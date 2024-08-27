<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<div>
		<form:form align="center" action="process-home" method="get" modelAttribute="user">
			<p><label for="username">yourname:</label> 
			<form:input id="username" path="username" /> </p>
			<br> 
			<p><label for="crushname">crushname:</label>
			<form:input type="text" id="crushname" path="crushname" /></p> <br> <input
				type="submit" value="submit" />
		</form:form>
	</div>
</body>
</html>