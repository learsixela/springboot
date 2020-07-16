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
	<div class="container">
		<h1>GYM's</h1>
		<h3><a href="/personas">Personas</a></h3>
		<a href="/gimnasios/new">Agregar Gim</a>
		<hr />
		<h2>Todos los Gym</h2>
		<table class="table table-hover">
			<thead>
			<tr>
				<th>#</th>
				<th>Nombre</th>
				<th>Detalle</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${gimnasios}" var="gim">
				<tr>
					<td>${gim.id}</td>
					<td>${gim.nombre}</td>
					<td><a href="/gimnasios/${gim.id}">Detalle Gim</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>