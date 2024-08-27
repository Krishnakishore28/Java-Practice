<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Order Completed</h1>
<%
String i=(String)request.getAttribute("order1");
out.println(i);
 %>
 
<p>Your order is  <%=request.getAttribute("food") %> ></p>
</body>
</html>