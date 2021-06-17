<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">

</head>
<body>

<div class="container">
<h1>${category.name}</h1>
<h2>Products:</h2>
<ul>
<c:forEach items="${category.products}" var="cat">
<li>${cat.name}</li>
</c:forEach>
</ul>
<form action="/product/add/${category.id}">
  <label for="addProduct">Add Product:</label>
  <select name="pro_id">
  <c:forEach items="${allProduct}" var="pro">
  <option value="${pro.id}">${pro.name}</option> 
  
  </c:forEach>
</select>
<button>Add</button>
</form>
</div>

</body>
</html>