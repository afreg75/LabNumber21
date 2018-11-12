<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" href="registration.css" />
<div class="container">
	<body>
		<a class="btn btn-primary btn-sm" href="/">Home</a>

		<center>
			<h1 id="lindo">Lindo Coffee</h1>
		</center>
		<p id="form">
			<b>Fill out the Form to receive Lindo Coffee!</b>
		</p>
		<form action="/welcome">


			<p>
				<b> First Name: <input name="firstname" placeholder="Firstname"
					required minlength="2" maxlength="10"/></input>

				</b>
			</p>
			<p>
				<b> Last Name: <input name="lastname" placeholder="Lastname" 	pattern="[A-Z][a-z]*"/>
					</input>
				</b>
			</p>
			<p>
				<b> Email address: <input type="email" name="email"
					placeholder="youremail@here.com" required></input>
				</b>
			</p>

			<p>
				<b> Phone Number:<input type="tel" name="phonenumber"
					placeholder="123-456-7890" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}"
					required></input>

				</b>
			</p>
			
			<p><b>
				Password: <input type="password" name="password" />
			</b></p>
			<p><b>
				Confirm Password: <input type="password" name="passwordconf"/>
			</b></p>
			<p>
				<b> <input type="checkbox" name="checkbox">Add to
					mailing list.<br>

				</b>
			</p>


			<p>
				<b> <select name="coffeeList">

						<option value=" "></option>
						<option value="French Vanilla">French Vanilla</option>
						<option value="Dark Roast">Dark Roast</option>
						<option value="Decaf">Decaf</option>
						<option value="I don't like coffee">I don't like coffee</option>
				</select> <label>Select your coffee </label>
				</b>
			</p>
			<br>


			<button>Submit</button>
		</form>

	</body>
</div>
</html>