<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hii ${user.username }</h1>
	<form:form action="/springmvcvalidations/email-process" modelAttribute="email" >
		<label for="email" >Email</label>
		<form:input path="email" id="email" />
		<input type="submit" value="send" />
	</form:form>
</body>
</html>