<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Accountant</title>
<style type="text/css">
body {
		background-color: powderblue;
		max-width: max-content;
		margin: auto;
	}
</style>
</head>
<body>
	<h1>Edit Accountant</h1>
	<table border="1">
	<tr>
		<th>Accountant ID</th>
		<th>Branch Code</th>
		<th>Branch</th>
		<th>Name</th>
		<th>Username</th>
		<th>Password</th>
		<th>Salary</th>
		<th>Edit</th>
	</tr>
	<c:forEach var="obj" items="${list}">
	<tr>
	<td>${obj.getId()}</td>
	<td>${obj.getBcode()}</td>
	<td>${obj.getBranch()}</td>
	<td>${obj.getName()}</td>
	<td>${obj.getUsername()}</td>
	<td>${obj.getPassword()}</td>
	<td>${obj.getSalary()}</td>
	<td> <a href="editAcc?id=${obj.getId()}">Edit Accountant</a></td>
	<tr>
	</c:forEach>
	</table>
	<form action="adHome">
		<table>
		<tr><td> <input type="submit" value="Home"></input> </td></tr>
		</table>
	</form>
</body>
</html>