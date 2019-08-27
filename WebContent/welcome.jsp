  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  body{
   border-color : white;
   }
</style>
<frameset rows="25%,*">
<frame src="a.jsp" name ="a" frameborder="0"></frame>

<frameset cols="25%,*">
<frame src="x.jsp" name="x" frameborder="0"></frame>
<frame src="y.jsp" name="y" frameborder="0"></frame>
</frameset>

</frameset>

</head>
<body>
<form method=post action="xyz">
</form>

</body>
</html>