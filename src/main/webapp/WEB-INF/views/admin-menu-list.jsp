<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu List</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="menu.css" />

</head>

<body>
<div class = "container">
	<a class="btn btn-primary btn-sm"  href="/">Home</a>
	
	<center><h1 id="lindo">Lindo Coffee</h1></center>
	
	<h2>Menu List Admin</h2>

	<!--  a form will submit back to the same URL if no actions is specified. -->
	<form>
		<input name="category" placeholder="Category" />
		<button>Filter</button>
	</form>

	<table  class="table table-sm">
		<tr>

			<th>Coffee & Merchandise</th>
			<th>Category</th>
			<th>Qty</th>
			<th>Price</th>
			<th>Description</th>
		</tr>
		<c:forEach var="food" items="${ list }">
			<tr>
				<td>${ food.name }</td>
				<td>${ food.category }</td>
				<td>${ food.qty }</td>
				<td>${ food.price }</td>
				<td>${ food.description }</td>
			<td>
						<a href="/food/update?id=${ food.id }" class="btn btn-light btn-sm">Edit</a>
						<a href="/menuitems/delete?id=${ food.id }" class="btn btn-light btn-sm">Delete</a>
						
					</td>
			</tr>
		</c:forEach>
	</table>
	
	<a class="btn btn-primary btn-sm" href="/add-coffee">Add Coffee</a>
</div>
</body>

</html>