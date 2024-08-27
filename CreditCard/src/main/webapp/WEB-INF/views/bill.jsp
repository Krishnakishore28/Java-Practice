<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h1 align="center">Bill Details</h1>
	<hr>
	<div align="center">
	<form:form action="bill-process" modelAttribute="details" method="post" >
		<p> 
			<label for="creditcardNumber">Credit card </label>
			<form:input path="creditcardNumber" id="creditcardNumber"/>
		</p>
		<p> 
			<label for="currency">Currency </label>
			<form:input path="currency" id="currency"/>
		</p>
		<p> 
			<label for="date">Date </label>
			<form:input path="date" id="date"/>
		</p>
		<p> 
			<label for="amount">Amount </label>
			<form:input path="amount" id="amount"/>
		</p>
		<input type="submit" value="submit" />
		</form:form>
	</div>
</body>
</html>