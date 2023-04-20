<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
			<a href="SignInSuccess.jsp">Go Back</a> <span style="color: Orage;">Hey :${user}</span>
			<img src="download?fileName=${pic}" height="50" width="80">
		</div>
	</nav>
	<div align="center">
		<form action="techno" method="post">
			UserId<input value="${user}" name="userId" readonly="readonly">
			<table>
				<tr>
					<td>Technology Name</td>
					<td><input type="text" name="name" value="${tech.name}"></td>
				</tr>
				<tr>
					<td>Technology Language</td>
					<td><input type="text" name="language"
						value="${tech.language}"></td>
				</tr>
				<tr>
					<td>Technology version</td>
					<td><input type="text" name="version" value="${tech.version}"></td>
				</tr>
				<tr>
					<td>Technology Owner</td>
					<td><input type="text" name="owner" value="${tech.owner}"></td>
				</tr>
				<tr>
					<td>Support From</td>
					<td><input type="text" name="supportFrom"
						value="${tech.supportFrom}"></td>
				</tr>
				<tr>
					<td>Support to</td>
					<td><input type="text" name="supportTo"
						value="${tech.supportTo}"></td>
				</tr>
				<tr>
					<td>License</td>
					<td><input type="text" name="license" value="${tech.license}"></td>
				</tr>
				<tr>
					<td>Open source</td>
					<td><input type="text" name="openSource"
						value="${tech.openSource}"></td>
				</tr>
				<tr>
					<td>OS Type</td>
					<td><input type="text" name="osType" value="${tech.osType}"></td>
				</tr>
			</table>
			<input type="submit" value="Add Here" class="btn btn-success">
		</form>
		<span style="color: blue;">${techie}</span> <br>
		<a href="show?userId=${user}">Show User Technology Details</a>
	</div>
</body>
</html>