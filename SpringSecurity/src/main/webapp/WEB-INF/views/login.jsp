<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Custom Login Page</h1>
	<c:if test="${param.error !=null}">
		<i style="color: red">invalid username or password</i>
	</c:if>
	<c:if test="${param.logout !=null}">
		<i style="color: red">you have successfully logged out</i>
	</c:if>
	<form:form>
		Username: <input type="text" name="username" />
		<br>
		Password: <input type="text" name="password" />
		<br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>