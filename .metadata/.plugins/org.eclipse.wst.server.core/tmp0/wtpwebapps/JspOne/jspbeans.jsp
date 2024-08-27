<%@ page isELIgnored="false" %>
<%@page import="com.wipro.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%=request.getParameter("id") %>
	<jsp:useBean id="employee" class="com.wipro.Employee"></jsp:useBean>
	<jsp:setProperty property="id" name="employee" value='<%=Integer.parseInt(request.getParameter("id")) %>' />
	<jsp:setProperty property="name" name="employee" value='<%=request.getParameter("name") %>' />
	<jsp:setProperty property="designation" name="employee" value='<%=request.getParameter("designation") %>' />
	<%request.setAttribute("employee", employee); %>
	<jsp:forward page="EmployeeServlet" />
</body>
</html>