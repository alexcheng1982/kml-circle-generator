package services

object KmlCircleGenerator {
  def calculatePoints(center: GeoLocation, radius: Double, count: Int) = {
    val c = center.toUnitVector
    val worldRadius = 6371000
    val t = radius / worldRadius
    val k = c * Math.cos(t)
    val s = Math.sin(t)
    val v = k.cross(k.orthogonal)
    val u = k.cross(v)
    (0 to count).map { i =>
      val a = 2 * Math.PI * i / count
      val p = k + (u * Math.sin(a) + v * Math.cos(a)) * s
      p.toGeoLocation
    }
  }
}

class Vector(val x: Double, val y: Double, val z: Double) {
  def magnitudeSquared = x * x + y * y + z * z

  def magnitude = Math.sqrt(magnitudeSquared)

  def toUnit = new Vector(x / magnitude, y / magnitude, z / magnitude)

  def toGeoLocation = {
    val unit = toUnit
    val z = Math.min(unit.z, 1)
    val lat = Math.asin(z)
    val lng = Math.atan2(unit.y, unit.x)
    new GeoLocation(lat * 180 / Math.PI, lng * 180 / Math.PI)
  }

  def *(m: Double) = new Vector(m * x, m * y, m * z)

  def -(v: Vector) = new Vector(x - v.x, y - v.y, z - v.z)

  def +(v: Vector) = new Vector(x + v.x, y + v.y, z + v.z)

  def dot(v: Vector) = x * v.x + y * v.y + z * v.z

  def cross(v: Vector) = new Vector(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x)

  def orthogonal = {
    var minNormal = Math.abs(x)
    var minIndex = 0
    if (Math.abs(y) < minNormal) {
      minNormal = Math.abs(y)
      minIndex = 1
    }
    if (Math.abs(z) < minNormal) {
      minNormal = Math.abs(z)
      minIndex = 2
    }
    val v = minIndex match {
      case 0 => new Vector(1, 0, 0)
      case 1 => new Vector(0, 1, 0)
      case 2 => new Vector(0, 0, 1)
    }
    (v - this * minNormal).toUnit
  }

  override def toString = s"$x, $y, $z"
}

class GeoLocation(val latitude: Double, val longitude: Double) {
  def toUnitVector = {
    val lat = latitude  / 180 * Math.PI
    val lng = longitude / 180 * Math.PI
    new Vector(Math.cos(lng) * Math.cos(lat), Math.sin(lng) * Math.cos(lat), Math.sin(lat))
  }

  override def toString = s"$latitude, $longitude"
}