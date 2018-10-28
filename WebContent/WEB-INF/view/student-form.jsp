<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>
	<form:form action="processFormTag" modelAttribute="student">
	
		first name <form:input path='firstName'/> <!-- path="property of the student class"  -->
		<br><br>
		last name <form:input path="lastName" />
		<br><br>
		<input type="submit" value="Submit"/> 
	</form:form> 
</body>


</html>