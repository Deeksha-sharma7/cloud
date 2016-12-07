<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="">
<meta name="viewport" content="width=device-width">
<title>Welcome Admin</title>

</head>
<body>
	<c:if test="${empty sessionScope.emp }">
		<%
			response.sendRedirect("../atos/home");
		%>
	</c:if>
	<div>
		<div align="center">
			<h4>Welcome&nbsp;${sessionScope.emp.name}</h4>
		</div>
		<div>
		<a href="allemplist">View All Employee</a>  
		</div>
	</div>
	<div align="center">
	<c:if test="${not empty sessionScope.emp }">
	<h4><a href="logout">LogOut</a><h4>
	</c:if>
	</div>
	<br>
	<br>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
</body>
</html>