<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Today date and Time is</h1>
<%
	Date date=new Date();
	SimpleDateFormat format1=new SimpleDateFormat("E yyyy-MM-dd 'at' hh:mm:ss a zzz");
	out.print(format1.format(date));
%>

</body>
</html>