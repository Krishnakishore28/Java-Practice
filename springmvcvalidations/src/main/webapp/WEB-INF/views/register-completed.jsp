<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your registration successfull</h1>
	<h3>details Entered by you are:</h3>
	<p>your entered user is ${register.user }</p>
	<p>your entered username is ${register.username }</p>
	<p>your entered password is ${register.password }</p>
	<p>your entered country is ${register.country}</p>
	<p>
		your entered hobbies are
		<c:forEach var="temp" items="${register.hobbies }">
		${temp}
</c:forEach>
	</p>
	<p>your entered gender is ${register.gender }</p>
	<p>your entered age is ${register.age }</p>
	
	<p>your entered email is ${register.communicationDto.email }</p>
	<p>your entered phone is ${register.communicationDto.phoneNumber }</p>


</body>
</html>