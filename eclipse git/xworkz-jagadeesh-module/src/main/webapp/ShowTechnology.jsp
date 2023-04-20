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
				alt="" width="80" height="48" class="d-inline-block align text-top"></a>
				<a href="SignInSuccess.jsp">Go Back</a>
			<span	style="color: orange;">Hey :${user}</span> <img
				src="download?fileName=${pic}" height="50" width="80">
		</div>
	</nav>

	<table class="table table-dark table-hover">
		<tr>
			<th>Technology Name</th>
			<th>Technology Language</th>
			<th>Technology version</th>
			<th>Technology Owner</th>
			<th>Support From</th>
			<th>Support to</th>
			<th>License</th>
			<th>Open source</th>
			<th>OS Type</th>
		</tr>
		<c:forEach items="${techList}" var="j">
			<tr>
				<td>${j.name}</td>
				<td>${j.language}</td>
				<td>${j.version}</td>
				<td>${j.owner}</td>
				<td>${j.supportFrom}</td>
				<td>${j.supportTo}</td>
				<td>${j.license}</td>
				<td>${j.openSource}</td>
				<td>${j.osType}</td>
			</tr>
		</c:forEach>

	</table>

<a
				href="AddTechnology.jsp"><span class="glyphicon glyphicon-user" style="color: green"></span>
					Add Technology few more Technologies</a>
</body>
</html>