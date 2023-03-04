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
			</a> <a href="index.jsp">Homepage</a>
			 <a href="missiles">MissileInfo</a>
		</div>
	</nav>
	<h1>Welcome to searchByName Page</h1>
	<h1 style="color: blue;">${deleted}</h1>
	<h2 style="color: red">${delete}</h2>
	<form action="searchByName">
		<input type="search" name="name"> <input type="submit"
			value="search">
	</form>
	<table class="table table-dark table-hover">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Company</th>
			<th>Country</th>
			<th>Price</th>
			<th>Type</th>
			<th>edit</th>
			<th>delete</th>
		</tr>
		<c:forEach items="${lists}" var="m">
			<tr>
				<td>${m.id}</td>
				<td>${m.name}</td>
				<td>${m.company}</td>
				<td>${m.country}</td>
				<td>${m.price}</td>
				<td>${m.type}</td>
				<td><a href="update?id=${m.id}">edit</a></td>
				<td><a href="delete?id=${m.id}">delete</a></td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>