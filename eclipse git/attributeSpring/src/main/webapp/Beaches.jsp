<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		</a> <a class="navbar-brand" href="#">Navbar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>


		<div class="collapse navbar-collapse" id="navbarSupportedContent"></div>
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
			</li>
		</ul>
		<a href="index.jsp">Home</a> <a href="Casino.jsp">Casino</a>

	</nav>

	<h1>Welcome to Blue Flagged Beaches</h1>
	<form action="beach" method="get">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Beach
				Name</label> <input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="Beach Name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Beach
				Location</label> <input type="text" class="form-control" name="location"
				id="exampleFormControlInput1" placeholder="Beach Location">
		</div>
		<div>
			<select class="custom-select" id="inputGroupSelect01" name="game">
				<option selected>Choose Game</option>
				<option value="PyaraGlinding">PyaraGlinding</option>
				<option value="Scuba">Scuba Diving</option>
				<option value="Motor">Motor Boat Ride</option>
				<option value="Combo">All In one Combo</option>

			</select>
		</div>
		<div class="form-check">
			<input type="radio" class="form-check-input" id="radio2" name="clean"
				value="true">Clean Beach :Yes <label
				class="form-check-label" for="radio2"></label> <br> <input
				type="radio" class="form-check-input" id="radio2" name="clean"
				value="false">Clean Beach :No <label
				class="form-check-label" for="radio2"></label>
		</div>
		<button type="submit" class="btn btn-primary">Click here to
			Register</button>
	</form>
</body>
</html>