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
	<h1 align="center">Add Student</h1>
	
	</div>
	<div align="center">
		<form:form modelAttribute="student" action="save-student" method="post">
			<form:hidden path="id"/>
			<label>Name:</label>
			<form:input path="name"/><br>
			<label>Mobile:</label>
			<form:input path="mobile"/><br>
			<label>Country:</label>
			<form:input path="country"/><br>
			<input type="submit" value="submit" />
		</form:form>
	</div>
</body>
</html>