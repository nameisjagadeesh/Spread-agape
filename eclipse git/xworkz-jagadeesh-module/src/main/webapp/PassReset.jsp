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
				
		</div>
		<div class="container-fluid">
			<a href="signUp.jsp"><span class="glyphicon glyphicon-user"></span>
				Sign Up</a> <a href="SignIn.jsp"><span
				class="glyphicon glyphicon-log-in"></span> Login</a>
				</a> <a href="index.jsp">Home</a>
		</div>
	</nav>
	<nav class="navbar navbar-expand">
		
	</nav>
	<div align="center">
		<form action="set" method="post">
			User Email <br>
			<input type="email" name="email" id="emailId"
				onchange="valideEmail()"> <br> <span id="display"
				style="color: red"></span> <br>
			<button type="submit" class="btn btn-success">Reset Password</button>
		</form>
		<div>
			<span style="color: orange;">${lock}</span>
            <span style="color: blue;">${reset}</span>
		</div>

	</div>
	<script>
		function valideEmail() {
			var userEmail = document.getElementById('emailId');
			var userEmailvalue = userEmail.value;
			console.log(userEmailvalue);
			if (userEmailvalue != null && userEmailvalue != ""
					&& userEmailvalue.length > 4 && userEmailvalue.length < 40) {
				console.log('valide email');
				const xhttp = new XMLHttpRequest();
				console.log('Running in ajax');
				console.log(userEmailvalue);
				xhttp.open("GET", "http://localhost:8080/xworkz-jagadeesh-module/reemail/"+userEmailvalue);
				xhttp.send();
				xhttp.onload = function() {
					console.log(this);
					document.getElementById("display").innerHTML = this.responseText
				}
				document.getElementById('emailError').innerHTML = '';
			} else {
				console.log('invalide email');
				document.getElementById('emailError').innerHTML = 'Plese enter valide email min 4 and max 40 charactes ';
			}
		}
	</script>
</body>
</html>