<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a>
			<a href="index.jsp">Homepage</a>
			<a href="MissileSearch.jsp">Search Missile By Id</a>
			<a href="SearchByName.jsp">SearchByName</a>
		</div>
	</nav>
	<h1 style="color: green;">${message}</h1> <br>
	<h5 style="color: red;">${messages}<br>
	<c:forEach items="${errors}" var="e">${e.message} <br></c:forEach>
	</h5>
	<form action="missiles" method="post">
	Missile Name<input type="text" name="name"><br>
	Missile Company<input type="text" name="company"><br>
	Missile Country<input type="text" name="country"><br>
	Missile Price<input type="text" name="price"><br>
	Missile Type<select name="type">
	<option value=" ">SELECT</option>
	<c:forEach items="${type}" var="p">
				<option value="${p}">${p}</option>
		</c:forEach>
	</select><br>
	<input type="submit" value="send">
	</form>

</body>
</html>