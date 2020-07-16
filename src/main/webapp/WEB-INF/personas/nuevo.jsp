<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
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
	<title>Gym - Personas</title>
</head>
<body>
<div class="container">
	<h1>Gym con Personas</h1>
	<hr />
	<h2>agregar una persona</h2>
	<form:form action="/personas" method="post" modelAttribute="persona">
		<div class="form-group">
			<form:label path="gimnasio">Gimnasio Nombre:</form:label>
			<form:errors path="gimnasio"/>
			<form:select class="form-control" path="gimnasio">
				<c:forEach items="${ gimnasios }" var="doj">
					<option value="${ doj.id }">${ doj.name }</option>
				</c:forEach>
			</form:select>
		</div>
		<div class="form-group">
			<form:label path="nombre">Nombre</form:label>
			<form:errors path="nombre"/>
			<form:input class="form-control" path="nombre"/>
		</div>
		<div class="form-group">
			<form:label path="apellido">Apellido</form:label>
			<form:errors path="apellido"/>
			<form:input class="form-control" path="apellido"/>
		</div>
		<button>Agregar</button>
	</form:form>
</div>
</body>
</html>