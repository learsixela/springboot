<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		  rel="stylesheet"
		  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		  crossorigin="anonymous">
	<link rel="stylesheet" href="css/main.css" />
    <title>GYM's</title>
</head>
<body>
<h1>Información GYM's</h1>
<c:url value="/" var="homeUrl"/>
<c:url value="personas" var="personasUrl"/>
<c:url value="gimnasios" var="gimnasiosUrl"/>
<c:url value="admin" var="adminUrl"/>
<c:url value="logout" var="logoutUrl"/>

<div class="menu">
	<ul>
		<li><a href="/">Home</a></li>
		<li><a href="${personasUrl}">Personas</a></li>
		<li><a href="${gimnasiosUrl}">Gimnasios</a></li>
		
		<sec:authorize access="hasRole('ROLE_ADMIN')">
		<li><a href="${adminUrl}">Admin</a></li>
		</sec:authorize>
		
		<li><a href="${logoutUrl}">Logout</a></li>
	</ul>
	<br style="clear:left"/>
</div>
</body>
</html>