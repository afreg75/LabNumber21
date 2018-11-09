<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="welcome.css" />
<div class = "container">
<body>

<a href="/">Home</a>
<p>Thank you for registering</p>
<p>${firstname} ${lastname}</p> 
<p>Your email address is: ${email}</p>
<p>Your phonenumber is: ${phonenumber}</p>

<p>You have selected ${checkbox} to our mailing list.</p>

<p>You will enjoy our Coffee! Your favorite coffee is ${favoritecoffee}</p>

</body>
</div>
</html>