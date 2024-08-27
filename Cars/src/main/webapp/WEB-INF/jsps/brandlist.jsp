<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="com.example.car.entity.Car" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Car> cars=(List<Car>)request.getAttribute("cars"); %>
<form action="bookedcar" method="POST" >
	<table>
		<tr>
			<th></th>
			<th>Brand</th>
			<th>Model</th>
			<th>Year</th>
			<th>No. oF kms</th>
			<th>Price</th>
			<th>Fuel</th>
		</tr>
		<tr>
			
			<%for(int i=0;i<cars.size();i++){ %>
				<tr>
				<td><input type="radio"  name="id" value="<%=cars.get(i).getId()%>" /></td>
				<td><%=cars.get(i).getBrand()%></td> 
				<td><%=cars.get(i).getModel()%></td>
				<td><%=cars.get(i).getYear()%></td>
				<td><%=cars.get(i).getKms()%></td>
				<td><%=cars.get(i).getPrice()%></td>
				<td><%=cars.get(i).getFuel()%></td><tr>
			<%} %>
			
		</tr>
		
	</table>
	<input type="submit" value="BookCar" />
			</form>
			<button type="button" name="back" onclick="history.back()">back</button>
			<button ><a href="home">Home</a></button>
</body>
</html>