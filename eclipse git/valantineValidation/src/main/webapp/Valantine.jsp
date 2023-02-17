<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>X-Workz</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			width="85" height="50" alt="">
		</a> <a class="navbar-brand" href="#">Navbar</a> <a href="index.jsp">Home</a>

        <a href="ValentineSearch.jsp">Valentine Search</a>

	</nav>
</head>

<h1>Valentine Details Are here</h1>
<form action="valentine" method="post">
	<pre>
	
	<c:forEach items="${error}" var="e">
	<span style="color: red;">${e.message }</span>
	
	</c:forEach>
	Name <input type="text" name="name" value="${dto.name }"> 
	ValntineName <input type="text" name="valentine" value="${dto.valentine }"> 
	Places <select name="place">
	<option value="">Select</option>
	<c:forEach items="${places}" var="p">
	<option value="${p}">${p}</option>
	</c:forEach>
	</select>
	gift <select name="gift">
		      <option value="">Select</option>
		<c:forEach items="${gifts}" var="g">
			<option value="${g}">${g}</option>
		</c:forEach>
	</select>
   <input type="submit" value="Click To Valentine">

</pre>
</form>

</body>
</html>