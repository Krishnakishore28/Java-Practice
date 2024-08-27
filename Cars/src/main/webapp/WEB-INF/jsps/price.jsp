<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>BestChoice Cars</h1>
	<h3>Choose price range to find available cars</h3>
	<form action="pricesort" method="POST">
		<input type="radio" value=4 name="id"/>< 5 lakhs
		<input type="radio" value=5 name="id"/>> 5 lakhs
		<br><input type="submit" value="Find Your Car" />
	</form>
	<button type="button" name="back" onclick="history.back()">back</button>
</body>
</html>