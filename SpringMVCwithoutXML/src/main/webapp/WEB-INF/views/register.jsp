<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">please register here</h1>
	<form:form action="registercompleted" method="post" modelAttribute="register">
		<div align="center">
				<label for="user">user:</label>
				<form:input path="user" id="user" />
			<br>
				<label for="username">username:</label>
				<form:input path="username" id="username" />
			<br>
				<label for="password">password:</label>
				<form:password path="password" id="password" />
			<br>
				<label for="country">country:</label>
				<form:select path="country" id="country" >
				<form:option value="india" label="india" />
				<form:option value="srilanka" label="srilanka" />
				</form:select>
			<br>
			<label for="hobbies">hobbies:</label>
				<label>cricket</label>
				<form:checkbox path="hobbies" value="cricket" />
				<label>football</label>
				<form:checkbox path="hobbies" value="football" />
			<br>
			<label for="gender">Gender:</label>
			<label>male</label>
			<form:radiobutton path="gender" value="male" />
			<label>female</label>
			<form:radiobutton path="gender" value="female" />
			<br>
			<input type="submit" value="register" />
			
		</div>
	</form:form>


</body>
</html>