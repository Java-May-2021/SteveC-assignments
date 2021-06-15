<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Dojo</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">

</head>
<body>

<table class="table table-dark">
	<thead>
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Age</th>
	<th>action</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${dojo.ninjas}" var="ninja">
	<tr>
	<td>${ninja.firstName}</td>
	<td>${ninja.lastName}</td>
	<td>${ninja.age}</td>
	<td><a href="/ninjas/delete/${ninja.id}">Delete</a></td>
	</tr>
	</c:forEach>
	</tbody>
	
</table>


</body>
</html>