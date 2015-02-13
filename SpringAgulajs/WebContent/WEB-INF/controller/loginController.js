springAngular.controller('login', [ '$scope', '$http','$location', function($scope, $http,$location) {
	$scope.email = 'test@liferay.com';
	$scope.password = '123456';
	$scope.information = '';
	$scope.submit = function() {
		console.log(host);
		$http({
			method : 'POST',
			url : api +'user/login.html',
			params : {
				email : $scope.email,
				password : $scope.password
			}
		}).success(function(data, status, headers, config) {
			if(data.data == true){
				window.location.href = host;
			}else{
				$scope.information = 'Email or Password incorrect !';
			}
		}).error(function(data, status, headers, config) {
			console.log(status);
			console.log(data);
		});
	};
} ]);