<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="start" method="post" action="stage3">
		<form:input path="empId" type="hidden" />
		<form:input path="empName" type="hidden" />
		<form:input path="project"  type="hidden"/>
		<form:input path="location" type="hidden"/>
		<form:input path="odc" type="hidden" />
		<form:input path="projectApprover" type="hidden" />
		<form:input path="locationApprover" type="hidden" />
		floor:<form:input type="number" path="floor" id="floor" />
		<p id="floorvalidate"></p>
		<input type="submit" type="hidden" />
	
	</form:form>
	<script>
		
	</script>
</body>
</html>