var springAngular = angular.module('springAngular', []);
var host = 'http://localhost:8080/SpringAngular/';

springAngular.controller('user', function($scope, $http) {
	
	$scope.user = {};
	
	$http.get(host + 'user/getUser').
    success(function(data) {
        $scope.user = data;
    });
	
	$scope.logout = function(){
		if($scope.user != {}){
			$http.get(host + 'user/logout').
		    success(function(data) {
		        console.log(data);
		    });
		}
	};
});