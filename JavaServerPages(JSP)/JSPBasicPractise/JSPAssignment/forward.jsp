<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person List</title>
</head>
<body>
<c:forEach items="${myList}" var="person">
${person}
<br>
${person.name}<br>
${person.age}
<br>
</c:forEach>
</body>
</html>
