<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Best Choice Cars</h1>
	<h6>Choose brand to find available models</h6>
	
	
	<form method="POST" action="brandlist">
		<span>Brand:</span>
		<select name="name" id="cars">
	 		 <option value="Hyundai">Hyundai</option>
	 		 <option value="Tata">Tata</option>
	 		 <option value="Maruthi Suzuki">Maruthi Suzuki</option>
	 		 <option value="Honda">Honda</option>
	 	</select>
	 	<br>
	 	<input type="submit" value="Find Models" />
	
	</form>
	<button type="button" name="back" onclick="history.back()">back</button>
	
	
	

</body>
</html>