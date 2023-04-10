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
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a>

		</div>
	</nav>
	<h1>Fetching data with Ajax</h1>
	MissileId :
	<input type="text" id="missileId">
	<button onclick="loadDto()">Click Here</button>
	<span id="missileId2"> </span>
	<span id="missileCompany"> </span>
	<div id="displayDto"></div>

	<script >
		function loadDto() {
			console.log("running loadDto");
			const xhttp = new XMLHttpRequest();
			var id = document.getElementById("missileId").value;
			xhttp.open("GET", "http://localhost:8080/jagadeesh-xworkz/dto/"+id);
			xhttp.send();
			
			xhttp.onload= function () {
				console.log(this);
				document.getElementById("displayDto").innerHTML=this.responseText;
				var json=JSON.parse(this.responseText);
				document.getElementById("missileId2").innerHTML=json.id;
				document.getElementById("missileCompany").innerHTML=json.company;
			}
		}
	</script>


</body>
</head>
</html>