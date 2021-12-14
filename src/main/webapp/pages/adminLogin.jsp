<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style type="text/css">
body {
		background-color: powderblue;
		max-width: max-content;
		margin: auto;
	}
</style>
</head>
<body>
	<h1>Admin Login</h1>
	<form action="adminLoginCheck">
		<table>
		<tr>
		<td>Enter Username : </td><td><input type="text" name="roleName"></input></td>
		</tr>
		<tr>
		<td>Enter Password : </td><td><input type="password" name="password"></input></td>
		</tr>
		<tr>
		<td> </td><td><input type="submit" value="Login"></input></td>
		</tr>
		</table>
	</form>
	
	<a href="accountantLogin">Login as Accountant</a>
	
</body>
</html>