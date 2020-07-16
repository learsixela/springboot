<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		  rel="stylesheet"
		  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		  crossorigin="anonymous">
	<link rel="stylesheet" href="css/main.css" />
	<title>GIM's</title>
</head>
<body>
<c:url value="/" var="homeUrl"/>
<div class="container">
		<h1>Gimnasios</h1>
		<h3><a href="/gimnasios">Gimnasios</a></h3>
		<h3><a href="${homeUrl}">Home</a></h3>
		<h2>${ gimnsasio.nombre } - Area Personas</h2>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Apellido</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${gimnasio.listaPersona}" var="persona">
				<tr>
					<td>${persona.nombre} </td>
					<td>${persona.apellido}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>