var springAngular = angular.module('springAngular', []);
var host = 'http://localhost:8080/';
var api = host + 'api/'

springAngular.controller('user', function($scope, $http) {
	
	$scope.user = {};
	
	$http.get(api + 'user/getUser').
    success(function(data) {
        $scope.user = data;
    });
	
	$scope.logout = function(){
		if($scope.user != {}){
			$http.get(api + 'user/logout').
		    success(function(data) {
		        console.log(data);
		    });
		}
	};
});