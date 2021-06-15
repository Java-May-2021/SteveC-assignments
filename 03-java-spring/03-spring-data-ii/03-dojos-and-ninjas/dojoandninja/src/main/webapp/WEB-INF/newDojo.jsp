<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>New Dojo</h1>

<form:form method="POST" action="/dojos/new" modelAttribute="dojo">
	

	<div class="form-group">
	    <form:label path="name">Name:
	    <form:errors path="name"/>
	    <form:input path="name"/></form:label>
    </div>
    
   
    <button>Create</button>
</form:form>

</div>

</body>
</html>