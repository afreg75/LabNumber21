<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="registration.css" />
<div class = "container">
<body >
<a href="/">Home</a>

	<h1 id ="lindo">Lindo Coffee</h1>
	<p>Please fill out the Form to receive Lindo Coffee!</p>
		<form action = "/welcome">
	
	<left><p>
			First Name: <input name ="firstname" placeholder="Firstname" required></input></left>
		</p>
		<p>
			Last Name: <input name ="lastname" placeholder="Lastname" required></input> 
		</p>
		<p>Email address: <input name ="email" placeholder="youremail@here.com" required></input> </p>
		
		<p>Phone Number:<input type="tel" name ="phonenumber" placeholder="123-456-7890"
				pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}"
				required></input>
				
				</p>
			<p>
			
			
  			<input type= "checkbox" name="checkbox" >Add to mailing list.<br>
  			
		</p>
			
		
		<p>
             <label>Please select your coffee </label>
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
</div>
</html>