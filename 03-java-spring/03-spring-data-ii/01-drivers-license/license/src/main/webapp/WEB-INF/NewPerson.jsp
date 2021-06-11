<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NewPerson</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>New Person</h1>

<form:form method="POST" action="/person/new" modelAttribute="person">
	

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
   
    <button>Create</button>
</form:form>

</div>

</body>
</html>