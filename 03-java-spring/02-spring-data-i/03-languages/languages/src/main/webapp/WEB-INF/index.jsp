<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
</head>
<body>
<div class="container">
<table class="table table-dark">
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${languages}" var="language">
        <tr>
            <td><a href="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.version}"/></td>
            <td><a href="/languages/${language.id}/edit">Edit</a>  <a href="/languages/${language.id}/delete">Delete</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</div>
<div class="container">

<form:form method="POST" action="/languages" modelAttribute="language">
    <form:label path="name">Name:
    <form:errors path="name"/>
    <form:input path="name"/></form:label><br>
    
    <form:label path="creator">Creator:
    <form:errors path="creator"/>
    <form:input path="creator"/></form:label><br>
    
    <form:label path="version">Version:
    <form:errors path="version"/>
    <form:input path="version"/></form:label>
    

    
    <input type="submit" value="Submit"/>
</form:form>
</div>


</body>
</html>