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
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
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


		<div class="collapse navbar-collapse" id="navbarSupportedContent">
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

			<a href="index.jsp">Back Home</a>


		</div>
	</nav>
<body>
	<h2>Candidates Test Details</h2>
	<form action="test" method="get">

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
				Candidate name</label> <input type="text" class="form-control"
				name="name" id="exampleFormControlInput1"
				placeholder="Candidate Name">
		</div>
		<div>
			<select class="custom-select" id="inputGroupSelect01" name="degree">
				<option selected>Degree Persued</option>
				<option value="B.E">B.E</option>
				<option value="B.tech">B.tech</option>
				<option value="Bsc">Bsc</option>
				<option value="M.com">M.com</option>
				<option value="B.com">B.com</option>

			</select>
		</div>
		<div>
			<label for="customRange1" class="form-label">Degree Tenure</label> <input
				type="range" class="form-range" id="customRange1" name="tenure">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
				Fees</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="Test Fees"
				name="fees">
		</div>
		<button type="submit" class="btn btn-success">Submit Details</button>
	</form>

</body>
</html>