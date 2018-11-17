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
		<a href="/logout" role="button">Logout</a>
	</header>	
	
	<center><h1 id="lindo">Lindo Coffee</h1></center>
	
	<h2>Menu List</h2>

	<!--  a form will submit back to the same URL if no actions is specified. -->
	<form class="form-inline" action="/menulist/category" autocomplete="off">
		  <label class="sr-only" for="keyword">Keyword</label>
		  <input type="text" value="${param.keyword}" class="form-control mb-2 mr-sm-2" id="keyword" name="keyword" placeholder="Keyword">
		  
		  <label class="sr-only" for="category">Category</label>
		  <select class="form-control mb-2 mr-sm-2" id="category" name="category">
		  	<option value="">Category</option>
		  	<c:forEach items="${ categories }" var="cat">
		  		<option <c:if test="${ cat eq param.category }">selected</c:if>>${ cat }</option>
		  	</c:forEach>
		  </select>
		
		  <button type="submit" class="btn btn-primary mb-2 mr-2">Search</button>
		  <c:if test="${not empty param.keyword or not empty param.category}">
		    <%-- c:if determines whether its contents should show or not --%>
		  	<a href="/menulist" class="btn btn-secondary mb-2">Clear</a>
	  	  </c:if>
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
			<a href="/mycart/add?id=${ menuitem.id }" class="btn btn-primary btn-sm">Add</a>
			</td>
			</tr>
		</c:forEach>
	</table>
	
</div>
</body>

</html>