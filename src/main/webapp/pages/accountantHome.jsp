<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accountant Home</title>
<style type="text/css">
body {
		background-color: powderblue;
		max-width: max-content;
		margin: auto;
	}
</style>
</head>
<body>
	<h1>Accountant Home</h1>
	<table>
		<tr><td> <a href="addStudents">Add Students</a>  </td></tr>
		<tr><td> <a href="viewStudents">View Students</a>  </td></tr>
		<tr><td> <a href="editStudents">Edit Students</a>  </td></tr>
		<tr><td> <a href="deleteStudents">Delete Students</a>  </td></tr>
	</table>
	<br>
	<form action="Logout">
		<table>
		<tr><td> <input type="submit" value="Logout"></input> </td></tr>
		</table>
	</form>
</body>
</html>