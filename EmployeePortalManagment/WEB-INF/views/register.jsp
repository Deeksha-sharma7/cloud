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
<title>EmployeeManagment</title>
</head>
<body>
<form:form modelAttribute="registerModel" method="post" role="form" >
            <center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Enter DasID</td>
                        <td><input type="text" name="dasID" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Name</td>
                        <td><input type="text" name="name" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter User Name</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Password</td>
                        <td><input type="password" name="passwd" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter City</td>
                        <td><input type="text" name="city" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Salary</td>
                        <td><input type="salary" name="salary" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Role</td>
                        <td><input type="text" name="role" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Designation</td>
                        <td><input type="text" name="deg" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Register" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="login">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
     </form:form>
</body>
</html>