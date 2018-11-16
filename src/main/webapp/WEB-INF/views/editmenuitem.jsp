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
	<main class="container">
		<h1>Menu Items</h1>
		<h2>Edit an item</h2>
		
		<form method="post">
			<!-- We need to keep the ID and submit it with the form, but we don't want the user to have to see it. -->
			<input type="hidden" name="id" value="${food.id}" />
			<div class="form-group">
			<table class="table">
		<div class="form-group">
			<tr>
				<th scope="row">Name</th>
				<td><input type="text" name="name" autofocus/></td>
			</tr>
			</div>
			<div class="form-group">
			<tr>
				<th scope="row">Description</th>
				<td><input type="text" name="description" /></td>
			</tr>
			</div>
			<div class="form-group">
			<tr>
				<th scope="row">Qty</th>
				<td><input type="text"name="qty" /></td>
			</tr>
			</div>
			<div class="form-group">
			<tr>
				<th scope="row">Price</th>
				<td><input type="text"name="price" /></td>
			</tr>
			</div>
			<div class="form-group">
			<tr>
				<th scope="row">Category</th>
				<td><input type="text"name="category" /></td>
			</tr>
			</div>
		</table>
		</div>
		<button type="submit" class="btn btn-primary">Edit</button>
		<a class="btn link" href="/edit-coffee"></a>
		
		<a class="btn btn-primary" href="/admin/menulist" role="button">Cancel</a>
		</form>
	</main>
</body>
</html>