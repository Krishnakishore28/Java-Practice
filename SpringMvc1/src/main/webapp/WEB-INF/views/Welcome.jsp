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
	<h1>Enter the Details</h1>
	<form:form method="post" action="process" modelAttribute="marks">
		science:<form:input path="science"/><br>
		Maths:<form:input path="maths"/><br>
		English:<form:input path="english"/><br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>