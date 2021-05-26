<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Dojo Survey</h1>
<div>

<form method="POST" action="/process">
<label>Your Name: </label>
<input type="text" name="fullname"><br><br>
<label>Dojo Location: </label>
<select name="location">
<option value="San Jose">San Jose</option>
<option value="Boise">Boise</option>
<option value="Dallas">Dallas</option>
</select><br><br>
<label>Favorite Language: </label>
<select name="language">
<option value="Python">Python</option>
<option value="Java">Java</option>
<option value="React">React</option>
</select><br><br>
<label>Comment (optional):</label><br>
<textarea name="comment" rows="4" cols="50"></textarea><br>
<button type="submit">Submit</button>
</form>
</div>


</body>
</html>