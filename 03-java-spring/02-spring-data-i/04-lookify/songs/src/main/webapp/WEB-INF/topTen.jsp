<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Top Ten</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">

</head>
<body>

<div class="container">
<h1>Top Ten Songs:</h1>
<div class="position-relative">
<div class="position-absolute top-0 start-100 translate-middle">
<a href="/dashboard">Dashboard</a>
</div>
</div>
<br>
<br>

<table class="table table-dark">
    <thead>
        <tr>
            <th>Rating</th>
            <th>Title</th>
            <th>Artist</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${songs}" var="song">
        <tr>
            <td>${song.rating}</td>
			<td><a href="/songs/${song.id}">${song.name}</a></td>
			<td>${song.artist}</td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</div>

</body>
</html>