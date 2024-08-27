<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	magin-left: 30px;
}
</style>
</head>
<body>
	<h1 align="center">please register here</h1>
	<form:form action="registercompleted" method="get" modelAttribute="register" >
		<div align="center">
				<label for="user">user:</label>
				<form:input path="user" id="user" />
				<form:errors path="user" cssClass="error" ></form:errors>
			<br>
				<label for="username">username:</label>
				<form:input path="username" id="username" />
				<form:errors path="username" cssClass="error"></form:errors>
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
			<label for="age">Age:</label>
			<form:input path="age" id="age" />
			<form:errors path="age" cssClass="error" ></form:errors>
			<br>
			<div align="center">
				<h1>Communication</h1><br>
				<label>Email: </label>
				<form:input path="communicationDto.email" id="communicationDto.email" />
				<form:errors path="communicationDto.email"></form:errors>
				<br>
				<label>Phonenumber:</label>
				<form:input path="communicationDto.phoneNumber" />
			</div>
			
			<input type="submit" value="register" />
			
		</div>
	</form:form>


</body>
</html>