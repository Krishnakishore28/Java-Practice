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
	<form:form action="/SpringMvcHibernate/process" modelAttribute="student">
		Enter Id:<form:input path="id" /><br>
		Enter Name:<form:input path="name" /><br>
		Enter Age:<form:input path="age" /><br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>