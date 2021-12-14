<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accountant Login</title>
</head>
<style type="text/css">
body {
		background-color: powderblue;
		max-width: max-content;
		margin: auto;
	}
</style>
<body>
<h1>Accountant Login</h1>
<form action="AccountantLoginController">
		<table>
		<tr>
		<td>Branch : </td>
		<td>
			<select name="branch" id="Branch">
			<option value="Hyderabad">Hyderabad</option>
			<option value="Chennai">Chennai</option>
			<option value="Bangalore">Bangalore</option>
			<option value="Pune">Pune</option>
			</select>
		</td>
		</tr>
		
		<tr>
		<td>Enter Username : </td><td><input type="text" name="uname"></input></td>
		</tr>
		<tr>
		<td>Enter Password : </td><td><input type="password" name="pwd"></input></td>
		</tr>
		<tr>
		<td> </td><td><input type="submit" value="Login"></input></td>
		</tr>
		</table>
	</form>
</body>
</html>