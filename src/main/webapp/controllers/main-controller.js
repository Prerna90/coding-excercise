app.controller('MainController', ['$scope', '$http', '$location', '$rootScope',
                                   function($scope, $http, $location, $rootScope) { 
	
	$scope.test = "Yay";
	
	$http({
		method : 'GET',
		url : "http://deals.expedia.com/beta/deals/hotels.json",
		headers : {
			'Content-Type' : 'application/x-www-form-urlencoded; charset=UTF-8'
		},
	}).success(function(data) {
		console.log("Success !!");
		console.log(data);
	});
	
	} 
]);
