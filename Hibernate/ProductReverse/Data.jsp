<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form action="DataServ">
<pre>
Search by Location : <input type="text" name="location">
<input type="submit" value="Get Record">
</pre>
</form>
<br>
The record we found are:<br>
<c:forEach items="${records}" var="eachRecord">
<pre>
${eachRecord}
</pre>
</c:forEach>
</body>
</html>
