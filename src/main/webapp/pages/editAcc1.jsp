<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Acc1</title>
<style type="text/css">
body {
		background-color: powderblue;
		max-width: max-content;
		margin: auto;
	}
</style>
</head>
<body>
<h1>Editing for ID : ${ID }</h1>
	<form action="UpdateAccountantController">
	<table>
		<tr>
		<td>Branch : </td>
		<td>
			<select name="branch" id="Branch" value="${acc.getBranch()}">
			<option value="Hyderabad">Hyderabad</option>
			<option value="Chennai">Chennai</option>
			<option value="Bangalore">Bangalore</option>
			<option value="Pune">Pune</option>
			</select>
		</td>
		</tr>
		<tr>
		<td>Branch Code : </td>
		<td>
			<select name="bcode" id="Code" value="${acc.getBcode()}">
			<option value="1001">Hyderabad:1001</option>
			<option value="1002">Chennai:1002</option>
			<option value="1003">Bangalore:1003</option>
			<option value="1004">Pune:1004</option>
			</select>
		</td>
		</tr>
		<tr>
			<td></td>
			<td> <input hidden type="text" name="id" value="${acc.getId()}"></input> </td>
		</tr>
		<tr>
			<td>Enter Name : </td>
			<td> <input type="text" name="name" value="${acc.getName()}"></input> </td>
		</tr>
		<tr>
			<td>Enter Username : </td>
			<td> <input type="text" name="username" value="${acc.getUsername()}"></input> </td>
		</tr>
		<tr>
			<td>Enter Password : </td>
			<td> <input type="password" name="password" value="${acc.getPassword()}"></input> </td>
		</tr>
		<tr>
			<td>Enter Confirm Password : </td>
			<td> <input type="password" name="password1" value="${acc.getPassword()}"></input> </td>
		</tr>
		<tr>
			<td>Enter Salary : </td>
			<td> <input type="text" name="salary" value="${acc.getSalary()}"></input> </td>
		</tr>
		<tr>
		<td> </td><td><input type="submit" value="Update Accountant"></input></td>
		</tr>
	</table>
	</form>
</body>
</html>