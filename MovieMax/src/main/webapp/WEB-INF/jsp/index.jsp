<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head></head>
	<body>
		<table>
			<tr>
				<td><b>MovieMax</b></td>
			</tr>
			<c:if test="${empty success}"> 
			<tr>
				<td><a href="<c:url value="/signUp"/>">SignUp</a></td>
			</tr>
			</c:if>
			<tr>
				<td><a href="<c:url value="login"/>">Login</td>
			</tr>
			<h1>${success}</h1>
		</table>
	</body>
</html>