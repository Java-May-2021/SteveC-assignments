<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
<h1><c:out value="${ error }" /></h1>
<form method="POST" action="/process">

<label>What is the Code? </label>
<input type="text" name="code">
<button type="submit">Try Code</button>
</form>

</body>
</html>