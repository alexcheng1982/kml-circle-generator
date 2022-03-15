package controllers

import play.api.mvc._
import services.{GeoLocation, KmlCircleGenerator}

import javax.inject.Inject
import scala.collection.immutable.ArraySeq

class Application @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index())
  }

  def initJs = Action {
    Ok(views.html.initjs()).as("text/javascript")
  }

  def formatColor(color: String, allowEmpty: Boolean = true): String = {
    if (allowEmpty && (color == null || color.isEmpty)) {
      color
    }
    else if (color == null || color.length != 6) {
      "0000ff"
    }
    else {
      color.substring(4,6) + color.substring(2,4) + color.substring(0,2)
    }
  }

  def kml(param: String) = Action { implicit request =>
    val circles = param.split(";").map( p => p.split(",") match {
      case Array(lat, lng, radius, unit, fillColor, lineWeight, lineColor) =>
        val r = unit match {
          case "km" => radius.toInt * 1000
          case "mile" => radius.toInt * 1609.34
          case _ => radius.toInt
        }
        Some(lat.toDouble, lng.toDouble, r.toInt, formatColor(fillColor), lineWeight.toInt, formatColor(lineColor, false))
      case _ => None
    }).filter(_.isDefined).map(_.get)
    val minRadius = 100
    val kmls = circles.map { circle =>
      val r = Math.max(circle._3, minRadius)
      val pointsNum = Math.max(r / minRadius, 20)
      val points = KmlCircleGenerator.calculatePoints(new GeoLocation(circle._1, circle._2), circle._3, pointsNum)
      (points, circle._4, circle._5, circle._6)
    }

    Ok(views.html.kml(ArraySeq.unsafeWrapArray(kmls))).withHeaders(
      CONTENT_DISPOSITION -> "attachment; filename=circle.kml"
    ).as("application/vnd.google-earth.kml+xml")
  }
}