/**
 * Controller class to make call to webServlet
 */
app.controller('MainController', ['$scope', '$http', '$location', '$rootScope',
                                   function($scope, $http, $location, $rootScope) { 
	
	$http({
		method : 'POST',
		url : "hotelDeals",
		headers : {
			'Content-Type' : 'application/x-www-form-urlencoded; charset=UTF-8'
		},
	}).success(function(hotelDeals) {
		$scope.hotelDeals = hotelDeals;
	});
	
	} 
]);
