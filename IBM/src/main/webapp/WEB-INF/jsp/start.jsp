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
	<form:form modelAttribute="start" id="form1" method="post" action="start" >
		id:<form:input path="empId" id="empId" type="number" />
		<p id="idvalidate"></p>
		name:<form:input path="empName" id="empName" />
		<p id="namevalidate"></p>
		<input type="submit" />
	</form:form>
	<script>
		
			document.getElementById("form1").addEventListener('submit',(event)=>{
				let x=document.getElementById("empId").value.trim();
				let y=document.getElementById("empName").value.trim();
				let idvalidate=document.getElementById("idvalidate");
				let namevalidate=document.getElementById("namevalidate");
				if(x===""){
					event.preventDefault();
					idvalidate.innerHTML="id is required";
				}
				else{
					idvalidate.innerHTML="";
				}
				if(y===""){
					event.preventDefault();
					namevalidate.innerHTML="name is required";
				}
				else{
					namevalidate.innerHTML="";
				}
			
				
			})
			if(x==="" && y===""){
				event.preventDefault(); 	
			}
			
		
	</script>
</body>
</html>