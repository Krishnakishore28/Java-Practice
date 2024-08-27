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
	<h1 align="center">Love Calculator</h1>
	<div>
		<form:form align="center" action="process-home" method="get"
			 modelAttribute="user">
			<p>
				<label for="username">yourname:</label>
				<form:input id="username" path="username" />
				<form:errors path="username" cssClass="error">
				</form:errors>
			</p>
			<br>
			<p>
				<label for="crushname">crushname:</label>
				<form:input type="text" id="crushname" path="crushname" />
				<form:errors path="crushname" cssClass="error">
				</form:errors>
			</p>
			<br>
			<p>
			<form:checkbox path="termsAndConditions" />
			<label>i agree terms and conditions</label>
			<form:errors path="termsAndConditions" cssClass="error"></form:errors>
			</p><br>
			<input type="submit" value="submit" />
		</form:form>
	</div>
	<script type="text/javascript">
		function validateUserName() {
			var username = document.getElementById("username");
			console.log("username");
			if (username.value<15) {
				alert("username must be greater than or equal 3 and less than 15");
				return false;
			} else {
				console.log("hii");
				return true;
			}
		}
	</script>
</body>
</html>