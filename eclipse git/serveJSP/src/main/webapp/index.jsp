<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ivar</title>
</head>
<body>
<h3>Sending details of favorite Person </h3>
<form action="person" method="post">
<pre>
FirstName<input type="text" name="fname"/>
LastName<input type="text" name="lname"/>
Gender<input type="text" name="gender"/>
Reason <textarea rows="5" cols="15" name="reason"></textarea>
Address<textarea rows="5" cols="15" name="address"></textarea>
<input type="submit" value="Send">
</pre>
</form>
</body>
</html>