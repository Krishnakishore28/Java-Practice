<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Home Page</h1>
	<p>username=${user }</p><br>
	<p>authorities=${auth }</p>
	<sec:authorize access='hasAuthority("trainer")'>
	<a href="/SpringSecurity/trainer">Trainer Dashboard</a>
	</sec:authorize>
	<sec:authorize access='hasAuthority("coder")'>
	<a href="/SpringSecurity/coder">coder Dashboard</a>
	</sec:authorize>
	<form:form action="logout">
		<input type="submit" value="logout" />
	</form:form>
</body>
</html>