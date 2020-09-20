<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fail</title>
</head>
<body>
Sorry <%= request.getAttribute("login") %>, would you like to retry
<a href="Login.jsp">RETRY</a>
</body>
</html>
