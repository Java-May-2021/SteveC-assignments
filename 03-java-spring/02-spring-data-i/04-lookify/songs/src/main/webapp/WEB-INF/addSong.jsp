<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add song</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>New Song</h1>
<div class="position-relative">
<div class="position-absolute top-0 start-100 translate-middle">
<a href="/dashboard">Dashboard</a>
</div>
</div>




<form:form action="/songs/new" method="POST" modelAttribute="song">
    <p>
        <form:label path="name">Title: </form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="artist">Artist: </form:label>
        <form:errors path="artist"/>
        <form:input path="artist"/>
    </p>
    <p>
        <form:label path="rating">Rating: </form:label>
        <form:errors path="rating"/>
        <form:select path="rating" items="${ratingList}"/>
    </p>
    
    <input type="submit" value="Submit"/>
</form:form>  
</div>

</body>
</html>