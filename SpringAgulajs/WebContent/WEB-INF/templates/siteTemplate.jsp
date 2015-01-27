<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="springAngular">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title><tiles:getAsString name="title"/></title>

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/common.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/resources/css/sb-admin.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<!--  <link href="${pageContext.request.contextPath}/resources/css/plugins/morris.css" rel="stylesheet"> -->

<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
		        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		    <![endif]-->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angular.js"></script>
<script src="${pageContext.request.contextPath}/controller/controllers.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/formValidation.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/validatebootstrap.min.js"></script>

<!-- Morris Charts JavaScript -->
<!--  <script src="${pageContext.request.contextPath}/resources/js/plugins/morris/raphael.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/plugins/morris/morris.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/plugins/morris/morris-data.js"></script> -->
</head>
<body>
	<div id="wrapper">

		<!-- Navigation -->
		<tiles:insertAttribute name="navigation"/>
		<div id="page-wrapper">
			<tiles:insertAttribute name="body"/>
		</div>
	</div>
	<!-- /#wrapper -->
</body>
</html>