<%@ page language="java" contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
  xmlns:og="http://ogp.me/ns#"
  ng-app="expedia-coding-excercise" lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta name="description" content="Hotel deals">

	<title >Best Hotel Deals</title>

	<link rel="icon" href="image/favicon.png" type="image/png" sizes="16x16">

</head>

<body>

<div id="container" ng-controller="MainController">
	<div ng-view="">
		<header id="header-container-home">
			{{ test }}
		</header>
	</div>
</div>

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular-route.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="text/javascript" src="angular-app.js"></script>
<script type="text/javascript" src="controllers/main-controller.js"></script>

</body>
</html>
