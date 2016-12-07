<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
     <%@ taglib uri="http://displaytag.sf.net/el" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmployeeManagment</title>
<link href="<c:url value="/resource/css/style.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/resource/css/bootstrap.css"/>" rel="stylesheet" type="text/css" />
<body background:url("/resource/img/bg-header.jpg") no-repeat;>
	<header>
      <div class="container">
        <center>
            <h1>Welcome to AtoS Employee Portal</h1>
            <div style="margin-top:30px;">
              <a href="login" class="btn btn-primary btn-lg" role="button">Login</a>
              <a href="register" class="btn btn-default btn-lg" role="button">Register</a>
            </div>
        </center>
      </div>
    </header>
</body>
</html>