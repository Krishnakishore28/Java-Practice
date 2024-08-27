<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/process" modelAttribute="employee">
		Enter Id:<form:input path="id" /><br>
		Enter Name:<form:input path="name" /><br>
		Enter salary:<form:input path="salary"/><br>
		<input type="submit" value="submit" />
		
	</form:form>
</body>
</html>