<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="finalreg.css" />
<div class = "container">	
<body>

<center><h1 id="lindo">Lindo Coffee</h1></center>
<p><b>Thank you for registering</b></p>
<p><b>${firstname} ${lastname}</b></p> 
<p>Your email address is: ${email}</p>
<p>Your phonenumber is: ${phonenumber}</p>

<p>You have selected ${checkbox} to our mailing list.</p>
<p> Your password is: ${ password }</p>

<p>You will enjoy our Coffee! Your favorite coffee is ${favoritecoffee}</p>

<a class = "btn btn-primary btn-xs"  href="/">Home</a>
<a class = "btn btn-primary btn-xs"  href="/">MenuList</a>
</body>
</div>
</html>