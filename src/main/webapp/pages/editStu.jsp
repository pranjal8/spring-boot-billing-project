<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
<style type="text/css">
body {
		background-color: powderblue;
		max-width: max-content;
		margin: auto;
	}
</style>
</head>
<body>
<h1>Editing Student for ${ID }</h1>
<form action="UpdateStudentController">
	<table>
		<tr>
		<td>Branch Code : </td>
		<td>
			<select name="bcode" id="Code" value="${stu.getBcode()}">
			<option value="1001">Hyderabad:1001</option>
			<option value="1002">Chennai:1002</option>
			<option value="1003">Bangalore:1003</option>
			<option value="1004">Pune:1004</option>
			</select>
		</td>
		</tr>
	
		<tr>
			<td></td>
			<td> <input hidden type="text" name="roll" value="${stu.getRoll()}"></input> </td>
		</tr>
		<tr>
			<td>Enter Full Name : </td>
			<td> <input type="text" name="fullname" value="${stu.getFullname()}"></input> </td>
		</tr>
		<tr>
			<td>Enter Course : </td>
			<td> <input type="text" name="course" value="${stu.getCourse()}"></input> </td>
		</tr>
		<tr>
			<td>Enter Mobile : </td>
			<td> <input type="text" name="mobile" value="${stu.getMobile()}"></input> </td>
		</tr>
		<tr>
			<td>Course Fee : </td>
			<td> <input type="text" name="fee" value="${stu.getFee()}"></input> </td>
		</tr>
		<tr>
		<td> </td><td><input type="submit" value="Update Student"></input></td>
		</tr>
	
	</table>
	</form>
	<br>
	<form action="Logout">
		<table>
		<tr>
		<td></td>
		<td><input type="submit" value="Logout"></input> </td>
		</tr>
		</table>
	</form>
</body>
</html>