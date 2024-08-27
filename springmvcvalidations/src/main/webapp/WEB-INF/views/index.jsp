<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>first name:${firstname }<br></p>
	<p>Second name:${secondname }<br></p>
	<p>getting from request scope ${requestScope.firstname }</p><br>
	<p>getting from session scope ${sessionScope.firstname }</p><br>
	<a href="${next }" >next</a>
</body>
</html>