<%--
  Created by IntelliJ IDEA.
  User: purushotham
  Date: 3/27/2018
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title> </title>
</head>
<body>
<div align="center"><h2>Registration Form</h2>
</div>
<div align="center">
    <form:form action="viewUser" method="post">
        <table>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" /></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lastName" path="lastName" /></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input type="number" name="age" path="age" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Register" /></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>