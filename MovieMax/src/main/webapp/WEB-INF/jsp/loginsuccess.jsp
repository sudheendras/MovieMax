<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
			<tr>
				<form:form method="POST" action="getMovies" modelAttribute="movieForm">
					<td>Enter City :</td>
					<td><form:input path="city"/></td>
					<td><input type="Submit" value="Get Movies"/></td> 
				</form:form>
			</tr>
			<tr>
				<c:forEach items="${movieList}" var="movie">
					<tr><td>${movie.movieId}</td><td>${movie.movieName}</td></tr>
				</c:forEach>	
			</tr>
</body>
</html>