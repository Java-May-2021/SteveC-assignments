<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NewLicense</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>New License</h1>

<form:form method="POST" action="/license/new" modelAttribute="license">
	<div class="form-group">
	<form:label path="person">Select a Person</form:label>
	<form:errors path="person"/>
	<form:select path="person">
	<c:forEach items="${persons}" var="person">
	<option value="${person.id}">${person.firstName} ${person.lastName}</option>
	</c:forEach>
	</form:select>
	</div>
	

	<div class="form-group">
	    <form:label path="state">State
	    <form:errors path="state"/>
	    <form:input path="state"/></form:label>
    </div>
    <div class="form-group">
    	<form:label path="expiration_date">Expiration Date:
    	<form:errors path="expiration_date"/>
    	<form:input type = "date" path="expiration_date"/></form:label>
    </div>
   
    <button>Create</button>
</form:form>

</div>

</body>
</html>