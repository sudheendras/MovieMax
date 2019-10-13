<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<html>
	<head>
		<title>SignUp</title>
	</head>
	<body>
		<h1>${failure}</h1>
		<form:form method="POST" action="login" modelAttribute="loginForm">
		<table>
			<tr>
				<td>Username :</td>
				<td><form:input path="userName"/></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Login"/></td>
			</tr>
		</table> 
		</form:form>
	</body>
</html>