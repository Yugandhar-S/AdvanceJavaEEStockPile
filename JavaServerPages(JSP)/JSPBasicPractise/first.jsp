<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First</title>
</head>
<body>
<%--  --%>
<% List<String> myList=new ArrayList<String>();
	myList.add("Yugandhar");
	myList.add("Sachin");
	myList.add("Mikhil");
	myList.add("Rohan");
%>

<%=myList %>
<pre>
The unique contents are as follows:
<%@include file="Logo.html"%>
</pre>
</body>
</html>
