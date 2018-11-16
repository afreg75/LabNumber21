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

<header>
		<span><font color="black">
			Hello ${ user.firstname } ${ user.lastname } 
		</font></span>
	</header>	
	
	<a class="btn btn-primary btn-sm"  href="/">Home</a>
	
	<center><h1 id="lindo">Lindo Coffee</h1></center>
	
	<h2>Menu List</h2>

	<!--  a form will submit back to the same URL if no actions is specified. -->
	<form>
		<input name="category" placeholder="Category" />
		<button>Filter</button>
	</form>

	<table  class="table table-sm">
		<tr>

			<th>Coffee & Merchandise</th>
			<th>Category</th>
			<th>Price</th>
			<th>Description</th>
		</tr>
		<c:forEach var="menuitem" items="${ list }">
			<tr>
				<td>${ menuitem.name }</td>
				<td>${ menuitem.category }</td>
				<td>${ menuitem.price }</td>
				<td>${ menuitem.description }</td>
						<td>
			<a href="/mycart?id=${ menuitem.id }" class="btn btn-primary btn-sm">Add</a>
			</td>
			</tr>
		</c:forEach>
	</table>
	
</div>
</body>

</html>