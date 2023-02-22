<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="data:image/png;base64,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"
			width="85" height="50" alt="">
		</a> <a class="navbar-brand" href="#">Navbar</a>
		


		<a href="valentine">Valentine</a> <!-- here form action is used to make places and gifts more dynamic  -->
	</nav>
	<h5 style="color: green;"> ${reply}</h5>
	<h5 style="color: red;"> ${messag}
	<br>
	<c:forEach items="${errors}" var="e">
	 ${e.message}
	</c:forEach>
	</h5>
	<form action="aero" method="get">
	Company <input type="text" name="company"/>
	<br>
	Name <input type="text" name="name"/>
	<br>
	Cost <input type="text" name="cost"/>
	<br>
	Type<select name="type">
	<option value=" ">SELECT</option>
	<c:forEach items="${type}" var="t">
				<option value="${t}">${t}</option>
			</c:forEach>
	</select>
	<br>
	Country	<select name="country">
	<option value=" ">SELECT</option>
	<c:forEach items="${country}" var="c">
				<option value="${c}">${c}</option>
			</c:forEach>
	</select>
	<br>
	<input type="submit" value="send" class="btn btn-primary"/>
</form>
</body>
</html>