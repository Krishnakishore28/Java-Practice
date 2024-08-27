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
<form:form modelAttribute="start" method="post" action="stage2" id="form1">
		<form:input path="empId" type="hidden" />
		<form:input path="empName" type="hidden" />
		<form:input path="project"  type="hidden"/>
		<form:input path="projectApprover" type="hidden" />
		location:<form:input path="location" id="location"/>
		<p id="locationvalidate"></p>
		odc:<form:input path="odc" id="odc"/>
		<p id="odcvalidate"></p>
		<input type="submit" />
	</form:form>
	<script>
			document.getElementById("form1").addEventListener('submit',(event)=>{
				let x=document.getElementById("location").value.trim();
				let y=document.getElementById("odc").value.trim();
				let locationvalidate=document.getElementById("locationvalidate");
				let odcvalidate=document.getElementById("odcvalidate");
				if(x===""){
					event.preventDefault();
					locationvalidate.innerHTML="location is required";
				}
				else{
					locationvalidate.innerHTML="";
				}
				if(y===""){
					event.preventDefault();
					odcvalidate.innerHTML="odc is required";
				}
				else{
					odcvalidate.innerHTML="";
				}
			})
			if(x==="" && y===""){
				event.preventDefault(); 	
			}
	</script>
</body>
</html>