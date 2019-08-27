<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<%= "Welcome to login page" %>
<form method=post action="abc">
<p>user name:<input type="text" name="username"></p>
<p>password:<input type="password" name="pass"></p>
<input type="submit" value="submit">

<a href="newuser.jsp" target="newuser.jsp"> new user</a>
</form>
</body>
</html>