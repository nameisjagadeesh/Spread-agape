<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" />
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">
			<a href="index.jsp">home</a>
		</div>
	</nav>
</head>
<h1>Searched by Two Here...!</h1>
<h3>
	<c:forEach items="${message}" var="j">
		<span style="color: red;">${j} <br></span>
	</c:forEach>
	<span style="color: red;">${fail}</span>

</h3>
<form action="findByTwo" method="get">
	Search By Any Name <input type="text" name="name" /> Search By Any
	Company <input type="text" name="company" /><input type="submit"
		value="search" class="btn btn-primary" />
</form>
<div>
	<table class="table table-bordered ">
		<tr class="table-primary">
			<th>id</th>
			<th>name</th>
			<th>Company</th>
			<th>Country</th>
			<th>Price</th>
			<th>type</th>
		</tr>
		<c:forEach items="${lists}" var="j">
			<tr>
				<td>${j.id}</td>
				<td>${j.name}</td>
				<td>${j.company}</td>
				<td>${j.country}</td>
				<td>${j.price}</td>
				<td>${j.type}</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>

</html>