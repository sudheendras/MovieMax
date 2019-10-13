<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<html>
	<head>
		<title>SignUp</title>
	</head>
	<body>
		<form:form method="POST" action="signUp" modelAttribute="userForm">
		<table>
			<tr>
				<td>Enter Name :</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Enter email :</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>Enter City :</td>
				<td><form:input path="city"/></td>
			</tr>
			<tr>
				<td>Enter PhoneNumber :</td>
				<td><form:input path="phoneNumber"/></td>
			</tr>
			<tr>
				<td>Enter Username :</td>
				<td><form:input path="username"/></td>
			</tr>
			<tr>
				<td>Enter Password :</td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Get Movies"/></td>
			</tr>
		</table> 
		</form:form>
	</body>
</html>