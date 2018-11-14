<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MenuItem</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Menu Items</h1>
		<h2>Add an item</h2>
		<form action="/menuitems/add" method="post">
		<table class="table">
			<tr>
				<th scope="row">Name</th>
				<td><input type="text" name="name" autofocus/></td>
			</tr>
			<tr>
				<th scope="row">Description</th>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<th scope="row">Qty</th>
				<td><input type="text"name="qty" /></td>
			</tr>
			<tr>
				<th scope="row">Price</th>
				<td><input type="text"name="price" /></td>
			</tr>
			<tr>
				<th scope="row">Category</th>
				<td><input type="text"name="category" /></td>
			</tr>
		</table>
		<button type="submit" class="btn btn-primary">Add</button>
		<a class="btn link" href="/add-coffee">Cancel</a>
		</form>
	</div>
</body>
</html>