<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
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
    <c:url value="/" var="homeUrl"/>
    <h1>GIM's</h1>
    <h3><a href="${homeUrl}">Home</a></h3>
    <h3><a href="/gimnasios">Gimnasios</a></h3>
    <a href="/personas/new">Agregar persona</a>
    <hr />
    <h2>Todas personas</h2>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Gimnasio</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${personas}" var="persona">
            <tr>
                <td>${persona.nombre}</td>
                <td>${persona.apellido}</td>
                <td>${persona.gimnasio.nombre}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>