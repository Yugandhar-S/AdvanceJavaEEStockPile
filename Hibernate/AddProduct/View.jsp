<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Product</title>
</head>
<body>
The selected product are:
<br><br>
<c:forEach items="${mylist1}" var="product">
	<br>
	${product}
	<br>
</c:forEach>
</body>
</html>
