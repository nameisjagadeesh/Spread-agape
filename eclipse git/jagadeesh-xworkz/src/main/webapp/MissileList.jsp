<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz </title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
</head>
<body>
	<nav style="background-color: black;" class="row">
		<div class="container col">
			<a href="index.jsp"> <img alt="x-workz logo"
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="200" height="100" />
			</a>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="missiles" style="color: white; font-size: x-large;">Missile
				Details</a>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="MissileSearch.jsp" style="color: white; font-size: x-large;">Missile
				Search</a><br>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="SearchByName.jsp"
				style="color: white; font-size: x-large;">SearchByName</a><br>
		</div>
		<div class="col p-3 my-3 bg-primary">
			<a href="list" style="color: white; font-size: x-large;">Database
				List</a><br>
		</div>
	</nav>
	<h1>Missile Search</h1>
	<c:forEach items="${message}" var="m">
		<span style="color: red;">${m} <br></span>
	</c:forEach>
	<span style="color: red;">${failed}</span>

	<div class="container">
		<table style="width: 100%;" class="table table-striped">
			<thead>
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
			</thead>
			<tbody>
				<c:forEach items="${list}" var="m">
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
			</tbody>
		</table>
	</div>
	<div>
	<marquee>
	<img alt="Missile" src="data:image/jpeg;base64,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">
	</marquee>
	</div>
</body>
</html>