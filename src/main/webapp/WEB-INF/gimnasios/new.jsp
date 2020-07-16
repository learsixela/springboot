<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GIM's</title>
</head>
<body>
	<div class="container">
		<h1>Gym</h1>
		<hr />
		<h2>Agregar Gym</h2>
		<form:form action="/gimnasios1" method="post" modelAttribute="gimnasio">
			<div class="form-group">
		        <form:label path="nombre">Nombre Gymnasio</form:label>
		        <form:errors path="nombre"/>
		        <form:input class="form-control" path="nombre"/>
		    </div>
		    <button>Crear</button>
		</form:form>
	</div>
</body>
</html>