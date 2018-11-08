<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<a href="/">Home</a>

	<center><p>Lindo Coffee</p>
	<p>Please fill out the following Form to receive some Lindo Coffee!</p></center>
		<form action = "/welcome">
	
		<p>
			First Name: <input name ="firstname"/>
		</p>
		<p>
			Last Name: <input name ="lastname"/>
		</p>
		<p>
			Email address: <input name ="email"/></p>
			<p>
			
  			<input type="checkbox" name="checkbox" value="Yes">Check if you want to be added to mailing list.<br>
		</p>
		
		<p>
             <label>What type of Coffee do you like? </label>
             <select name = "coffeeList">
               <option value = " "></option>
               <option value = "French Vanilla">French Vanilla</option>
               <option value = "Dark Roast">Dark Roast</option>
               <option value = "Decaf">Decaf</option>
               <option value = "I don't like coffee">I don't like coffee</option>
             </select>
          </p>
          
          <button>Submit</button>
        </form>
	
</body>
</html>