(function() {
  angular.module('kcg', ['colorpicker.module']).controller('KcgCtrl', [
    '$scope', '$window', '$timeout', function($scope, $window, $timeout) {
      var addCircle, getRadius, map, marker;
      $scope.circle = null;
      $scope.latInput = 0.0;
      $scope.lngInput = 0.0;
      var location = [$scope.latInput, $scope.lngInput];
      map = L.map('map').setView(location, 2);
      L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        maxZoom: 19,
        attribution: '&copy; <a href="https://openstreetmap.org/copyright">OpenStreetMap contributors</a>'
      }).addTo(map);
      L.control.scale({
        imperial: true,
        metric: true
      }).addTo(map);
      marker = new L.marker(location, {
        draggable: 'true'
      });
      getRadius = (function(_this) {
        return function() {
          switch ($scope.radiusUnit) {
            case 'km':
              return $scope.radius * 1000;
            case 'mile':
              return $scope.radius * 1609.34;
            default:
              return $scope.radius;
          }
        };
      })(this);
      addCircle = (function(_this) {
        return function() {
          var pos;
          pos = [$scope.latInput, $scope.lngInput];
          if ($scope.circle) {
            map.removeLayer($scope.circle);
          }
          $scope.circle = new L.circle(pos, {
            color: $scope.lineColor,
            fill: $scope.useFillColor,
            fillColor: $scope.getFillColor(),
            weight: $scope.lineWeight,
            radius: getRadius()
          });
          return map.addLayer($scope.circle);
        };
      })(this);
      marker.on('dragend', (function(_this) {
        return function() {
          var pos;
          pos = marker.getLatLng();
          $scope.latInput = pos.lat;
          $scope.lngInput = pos.lng;
          $scope.$apply();
          return addCircle();
        };
      })(this));
      map.addLayer(marker);

      function updateCirclePosition() {
        var latLng = L.latLng($scope.latInput, $scope.lngInput);
        if ($scope.circle) {
            $scope.circle.setLatLng(latLng);
        }
        marker.setLatLng(latLng);
      }

      $scope.$watch('latInput', updateCirclePosition);
      $scope.$watch('lngInput', updateCirclePosition);

      $scope.radius = 100;
      $scope.radiusUnit = 'km';
      $scope.useFillColor = false;
      $scope.fillColor = '';
      $scope.lineWeight = 1;
      $scope.lineColor = '#ff0000';
      $scope.lineWeights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
      $scope.getFillColor = function() {
        if ($scope.useFillColor) {
          return $scope.fillColor;
        } else {
          return '';
        }
      };
      $scope.getKmlUrl = function() {
        return "/kml/" + $scope.latInput + "," + $scope.lngInput + "," + $scope.radius + "," + $scope.radiusUnit + "," + ($scope.getFillColor().replace('#', '')) + "," + $scope.lineWeight + "," + ($scope.lineColor.replace('#', ''));
      };
      return addCircle();
    }
  ]);

}).call(this);