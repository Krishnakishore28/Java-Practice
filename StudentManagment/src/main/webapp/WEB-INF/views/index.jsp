<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="/StudentManagment/css/css/decor.css" />
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Students Managment</h1>
	<div align="center">
	<form:form action="insert-student" method="get">
		<input type="submit" value="add" />
	
	</form:form>
	<div align="center">
		<table border="1">
			<thead>
				<tr>
					<td>id</td>
					<td>name</td>
					<td>mobile</td>
					<td>country</td>	
				</tr>
			</thead>
			
			<c:forEach var="student" items="${students }">
		<tr>
		<td>${student.id }</td>
		<td>${student.name }</td>
		<td>${student.mobile}</td>
		<td>${student.country }</td>
		<td><a href="update-student?id=${student.id }">update</a></td>
		<td><a href="delete-student?id=${student.id}" onClick="if(!confirm("Are you sure you want to delete")) return false">delete</a></td>
		</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>