angular.module('kcg', ['colorpicker.module'])
    .controller('KcgCtrl', ['$scope', '$window', '$timeout', ($scope, $window, $timeout) ->
        $scope.circle = null
        $scope.centerLocation = [0, 0]
        map = L.map('map').setView($scope.centerLocation, 2)

        L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
          maxZoom: 19
          attribution: '&copy; <a href="https://openstreetmap.org/copyright">OpenStreetMap contributors</a>'
        }).addTo(map)

        L.control.scale({imperial: true, metric: true}).addTo(map)
        marker = new L.marker($scope.centerLocation, {
          draggable: 'true'
        })

        getRadius = () =>
          switch ($scope.radiusUnit)
            when 'km' then $scope.radius * 1000
            when 'mile' then $scope.radius * 1609.34
            else $scope.radius

        addCircle = () =>
          pos = $scope.centerLocation
          if $scope.circle
            map.removeLayer($scope.circle)
          $scope.circle = new L.circle(pos, {
            color: $scope.lineColor
            fill: $scope.useFillColor
            fillColor: $scope.getFillColor()
            weight: $scope.lineWeight
            radius: getRadius()
          })
          map.addLayer($scope.circle)

        marker.on('dragend', () =>
          pos = marker.getLatLng()
          $scope.centerLocation = [pos.lat, pos.lng]
          $scope.$apply()
          addCircle()
        )
        map.addLayer(marker)

        $scope.radius = 100
        $scope.radiusUnit = 'km'
        $scope.useFillColor = false
        $scope.fillColor = ''
        $scope.lineWeight = 1
        $scope.lineColor = '#ff0000'
        $scope.lineWeights = [1..10]

        $scope.getFillColor = () ->
            if $scope.useFillColor then $scope.fillColor else ''

        $scope.getKmlUrl = () ->
            "/kml/#{$scope.centerLocation[0]},#{$scope.centerLocation[1]},#{$scope.radius},#{$scope.radiusUnit},#{$scope.getFillColor().replace('#', '')},#{$scope.lineWeight},#{$scope.lineColor.replace('#', '')}"

        addCircle()
    ])