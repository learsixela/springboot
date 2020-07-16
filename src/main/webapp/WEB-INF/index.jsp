<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        td {
            padding-left: 20px;
            padding-right: 20px;
        }
        h1 {
            margin-left: 20px;
        }
    </style>
    <title>Gym y Deportistas</title>
</head>
<body>
<h1>Informacion</h1>
<table>
    <thead>
    <th>Nombre Gym</th>
    <th>Deportista</th>
    </thead>
    <tbody>
    <c:forEach var="gim" items="${gimnasios}">
        <tr>
            <td>${gim.nombre}</td>
            <td>${gim.listaDeportista.size()} Deportistas</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>