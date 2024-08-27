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
	<form:form modelAttribute="start" method="post" action="stage1" id="form1">
		<form:input path="empId" type="hidden" />
		<form:input path="empName" type="hidden" />
		project:<form:input path="project" id="project"/>
		 <p id="projectvalidate"></p>
		<input type="submit" />
	</form:form>
	<script>
		document.getElementById("form1").addEventListener('submit',(event)=>{
			let x=document.getElementById("project").value.trim();
			let projectvalidate=document.getElementById("projectvalidate");
			
			if(x===""){
				projectvalidate.innerHTML="project required";
				event.preventDefault();
			}
			else{
				projectvalidate.innerHTML="";
			}
		})
	</script>
</body>
</html>