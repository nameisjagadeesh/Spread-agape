<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
				src=" data:image/jpeg;base64,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"
				alt="" width="100" height="60" class="d-inline-block align text-top">
			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>

	<div align="center">
		<h5 style="color: red;">${fail}</h5>
        <h5 style="color: red;">${lock}</h5>
		<form action="sign">
			<table>
				<tr>
					<td>Enter UserId</td>
					<td><input type="text" name="userId" id="" onchange="ValidName()" placeholder="enter ur userId">
						<span id="nameError" style="color: red;"></span> <span
						id="displayUserId" style="color: red;"></span><br></td>
				</tr>
				<tr>
					<td>Enter Password</td>
					<td><input type="password" placeholder="enter your password"
						name="password" id="userPassword" onblur="functioSn onPassword()" />
						<span id="passwordError" style="color: red"></span> </span> <input
						type="checkbox" onclick="onPassword()">Show Password <br></td>
				</tr>
				<tr>
				<td>SignIn <input type="submit" value="SignIn" class="btn btn-primary" id="submitId"  /></td>
				</tr>

            <tr>
            
            
            <td>  <a href="PassReset.jsp">Password Reset </a> </td>
            </tr>
            
			</table>

		</form>

		<script>
	
	
	function ValidName() {
		var	user=document.getElementById('userName');
		var uservalue=user.value;
		console.log(uservalue);
		if(uservalue!=null && uservalue!="" && uservalue.length>2 && uservalue.length<25 )
		{
			console.log('valid name');
			var a=document.getElementById("agreementConfirm");
			console.log(a.checked);
			if(a.checked){
				document.getElementById("submitId").disabled=false;
			}
			document.getElementById('nameError').innerHTML='';
		}
			else{
				console.log('Invalid name');
				document.getElementById("submitId").disabled='disabled';
				document.getElementById('nameError').innerHTML='enter correct userId within range of 4 and 25';
			}
		    function onPassword() {
			var password=document.getElementById('userPassword');
			if(password.type=== "password"){
				password.type="text";
			}
			else{
				password.type="password";
			}
		}
		
		
	</script>





	</div>
</body>
</html>