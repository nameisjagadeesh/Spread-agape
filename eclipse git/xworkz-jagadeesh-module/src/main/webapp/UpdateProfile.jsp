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
				<a href="SignIn.jsp"><span class="glyphicon glyphicon-log-in"></span>
					Logout</a> <span style="color: orange;">Hi:${user}</span> <img
				src="download?fileName=${pic}" height="50" width="80">
		</div>
	</nav>
	<div align="center">
	<h1 style="color: green;">${added}</h1> <br>
	<h5 style="color: red;">${addFile}<br>
		<form action="profile" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td>Email</td>
					<td>
					<input type="email" name="email" id="emailPrint"
						onchange="ValidEmail()" value="${mdto.email}" readonly="readonly" placeholder="email cant be changed"> <span style="color: orange">email is constant</span>
						<span id="emailError" style="color: red"></span> <span
						id="display" style="color: red"></span></td>
				</tr>
				<tr>
					<td>User ID</td>

					<td><input type="text" name="userId" id="displayUserId"
						onchange="ValidName()" value="${mdto.userId}"> <span
						id="nameError" style="color: red"></span> <span
						id="displayUserName" style="color: red"></span></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><input type="number" name="number" id="userMobile"
						onchange="ValidMobile()" value="${mdto.number}"> <span
						id="mobileError" style="color: red"></span> <span
						id="numberPrint" style="color: red"></span></td>
				</tr>
			</table>

			Choose Profile Pic: <input type="file" name="pic">
			<div>
				<button type="submit" class="btn btn-success">Update Pic</button>
			</div>


		</form>

	</div>
	<script>
		function ValidName() {
			var user = document.getElementById('userName');
			var uservalue = user.value;
			console.log(uservalue);
			if (uservalue != null && uservalue != "" && uservalue.length > 2
					&& uservalue.length < 25) {
				console.log('valid name');
				var a = document.getElementById("agreementConfirm");
				console.log(a.checked);
				if (a.checked) {
					document.getElementById("submitId").disabled = false;
				}
				document.getElementById('nameError').innerHTML = '';
			} else {
				console.log('Invalid name');
				document.getElementById("submitId").disabled = 'disabled';
				document.getElementById('nameError').innerHTML = 'enter correct userId within range of 4 and 25';
			}
			const xhttp = new XMLHttpRequest();
			console.log('running ajax of userId');
			console.log(uservalue);
			xhttp.open("GET",
					"http://localhost:8080/xworkz-jagadeesh-module/userId/"
							+ uservalue);
			xhttp.send();

			xhttp.onload = function() {
				console.log(this);
				document.getElementById("displayUserId").innerHTML = this.responseText;
			}
		}
		function validEmail() {
			var userEmail = document.getElementById('emailId');
			var userEmailvalue = userEmail.value;
			console.log(userEmailvalue);
			if (userEmailvalue != null && userEmailvalue != ""
					&& userEmailvalue.length > 4 && userEmailvalue.length < 40) {
				console.log('valid email');
				document.getElementById('emailError').innerHTML = '';
			} else {
				console.log('invalid email');
				document.getElementById('emailError').innerHTML = 'Please enter valid emailId';
			}
			const xhttp = new XMLHttpRequest();
			console.log(userEmailvalue);
			xhttp.open("GET",
					"http://localhost:8080/xworkz-jagadeesh-module/userEmail/"
							+ userEmailvalue)
			xhttp.send();
			xhttp.onload = function() {
				console.log(this);
				document.getElementById("emailPrint").innerHTML = this.responseText;
			}

		}
		function ValidMobile() {
			var userMobile = document.getElementById('userMobile');
			var userMobilevalue = userMobile.value;
			console.log(userMobilevalue);
			if (userMobilevalue != null && userMobilevalue != ""
					&& userMobilevalue.length == 10) {
				console.log('valide mobile');
				document.getElementById('mobileError').innerHTML = '';
			} else {
				console.log('invalid mobile number');
				document.getElementById('mobileError').innerHTML = 'Please enter the valid Mobile Number';
			}
			const xhttp = new XMLHttprequest();
			console.log(userMobilevalue);
			xhttp.open("GET",
					"http://localhost:8080/xworkz-jagadeesh-module/userNumber/"
							+ userMobilevalue);
			xhttp.send();
			xhttp.onload = function() {
				console.log(this);
				document.getElementById("numberPrint").innerHTML = this.responseText;
			}
		}
	</script>



</body>
</html>