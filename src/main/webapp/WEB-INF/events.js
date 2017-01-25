function Events($scope, $http){
    $http.get('http://localhost:8004/EventTracker/events.json').
        success(function (data){
            $scope.events = data;
    });
}