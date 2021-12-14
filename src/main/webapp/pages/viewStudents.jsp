<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Students</title>
<style type="text/css">
body {
		background-color: powderblue;
		max-width: max-content;
		margin: auto;
	}
</style>
</head>
<body>
<h1>View Students</h1>
<table border="1">
	<tr>
		<th>Student Roll No.</th>
		<th>Branch Code</th>
		<th>Full Name</th>
		<th>Course</th>
		<th>Mobile No.</th>
		<th>Course Fee</th>
	</tr>
	<c:forEach var="obj" items="${list}">
	<tr>
	<td>${obj.getRoll()}</td>
	<td>${obj.getBcode()}</td>
	<td>${obj.getFullname()}</td>
	<td>${obj.getCourse()}</td>
	<td>${obj.getMobile()}</td>
	<td>${obj.getFee()}</td>
	<tr>
	</c:forEach>
	</table>
</body>
</html>