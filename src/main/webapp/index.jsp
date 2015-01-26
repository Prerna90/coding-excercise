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

<div ng-controller="MainController">
	<div ng-view="">
		<header>
			<%@ include file="hotel-deals.jsp" %>
		</header>
	</div>
</div>

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular-route.min.js"></script>
<script type="text/javascript" src="angular-app.js"></script>
<script type="text/javascript" src="controllers/main-controller.js"></script>

<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- web-font -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>

</body>
</html>
