<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Viewall Employee list</title>
</head>
<body>
	<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>DasId</th>
			<th>Name</th>
			<th>City</th>
			<th>Salary</th>
			<th>Role</th>
			<th>Designation</th>
			 <th>Delete</th>
		</tr>
		<c:forEach var="emp" items="${list}">
			<tr>
				<td>${emp.dasID}</td>
				<td>${emp.name}</td>
				<td>${emp.city}</td>
				<td>${emp.salary}</td>
				<td>${emp.role}</td>
				<td>${emp.deg}</td>  
			    <td><a href="deleteEmployee?id=<c:out value='${emp.dasID}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>