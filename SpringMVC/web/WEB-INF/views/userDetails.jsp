<%--
  Created by IntelliJ IDEA.
  User: purushotham
  Date: 3/27/2018
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title> </title>
</head>
<body>
<div align="center">
    <table border="0">
        <tr>
            <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <h3>Thank you for registering! Here's the review of your details:</h3>
            </td>
        </tr>
        <tr>
            <td>User Name:</td>
            <td>${firstName}</td>
        </tr>
        <tr>
            <td>LastName:</td>
            <td>${lastName}</td>
        </tr>
        <tr>
            <td>Age:</td>
            <td>${age}</td>
        </tr>
    </table>
</div>
</body>
</html>