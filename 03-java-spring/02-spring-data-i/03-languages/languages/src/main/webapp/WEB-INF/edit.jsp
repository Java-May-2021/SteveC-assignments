<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
<a href="/languages">Dashboard</a>  <a href="/languages/${language.id}/delete">Delete</a>
<form:form method="POST" action="/languages/${language.id}" modelAttribute="language">
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

</body>
</html>