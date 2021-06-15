<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>New Ninja</h1>
<form:form method="POST" action="/ninjas/new" modelAttribute="ninja">
	<div class="form-group">
	<form:label path="dojo">Select a Dojo</form:label>
	<form:errors path="dojo"/>
	<form:select path="dojo">
	<c:forEach items="${allDojo}" var="dojo">
	<option value="${dojo.id}">${dojo.name}</option>
	</c:forEach>
	</form:select>
	</div>
	

	<div class="form-group">
	    <form:label path="firstName">First Name:
	    <form:errors path="firstName"/>
	    <form:input path="firstName"/></form:label>
    </div>
    <div class="form-group">
	    <form:label path="lastName">Last Name:
	    <form:errors path="lastName"/>
	    <form:input path="lastName"/></form:label>
    </div>
    <div class="form-group">
	    <form:label path="age">Age:
	    <form:errors path="age"/>
	    <form:input path="age"/></form:label>
    </div>
    
   
    <button>Create</button>
</form:form>
</div>

</body>
</html>