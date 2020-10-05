<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form action="AddServ" method="post">
<pre>
NAME:<input type="text" name="name">
ADDRESS:<input type="text" name="address">
<select name="mode">
<option value="file">FILE</option>
<option value="database">DATABASE</option>
</select>
<input type="submit" value="Add Student">
</pre>
</form>
</body>
</html>
