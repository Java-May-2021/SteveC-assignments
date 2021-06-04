<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Language</title>
</head>
<body>
<h1><c:out value="${language.name}"/></h1>
<p><c:out value="${language.creator}"/></p>
<p>Language: <c:out value="${language.version}"/></p>

<a href="/languages/${language.id}/edit">Edit</a>

</body>
</html>