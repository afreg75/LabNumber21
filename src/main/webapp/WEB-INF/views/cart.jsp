<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="menu.css" />

</head>
<body>
<div class = "container">
<header>
		<span><font color="black">
			Hello ${ user.firstname } ${ user.lastname } 
		</font></span>
		
		<a href="/logout" role="button">Logout</a>
	</header>	

	<center><h1 id="lindo">Lindo Coffee</h1></center>
	
	<h2>Shopping Cart</h2>
	
	
			
	<table  class="table table-sm">
		<tr>

			<th>Name</th>
			<th>Quantity</th>
			<th>Price</th>
		
		</tr>	
		<c:forEach var="cartItem" items="${ list }">
			<tr>
				<td>${ cartItem.menuItem.name }</td>
				<td>${ cartItem.quantity }</td>
				<td>${ cartItem.menuItem.price }</td>
				<td>
				<a href="/mycart/delete?id=${ cartItem.id }" class="btn btn-primary btn-sm">Delete</a>
				</td>
			</tr>
		</c:forEach>
		</table>
		
		<a class="btn btn-primary" href="/menulist" role="button">Shop More</a>
	
		<a class="btn btn-primary"  role="button">Checkout</a>
	
	</div>
</body>
</html>