<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head> <title> student form</title></head>


<body>
	<form:form action="processFormTag" modelAttribute="student">
	
	
		<!-- path="property of the student class" , value is the attritube value   -->
		first name <form:input path='firstName'/> 
		<br><br>
		last name <form:input path="lastName" />
		<br><br>
		Country: 
		<form:select path="country">  
			<form:options items="${student.countryOption}" />
		</form:select>
		
		<br><br>
		<input type="submit" value="Submit"/> 
		<br><br>
		Language: 
		
<%-- 		Java <form:radiobutton path="favLanguage" value="Java" />
		C++ <form:radiobutton path="favLanguage" value="C++" />
		Go <form:radiobutton path="favLanguage" value="Go" />
		Rail <form:radiobutton path="favLanguage" value="Rail" />
		Javascript <form:radiobutton path="favLanguage" value="Javascript" /> 
--%>
	
		 <form:radiobuttons path="favLanguage" items="${student.favoriteLanguageOptions}"/>
		
	</form:form> 
</body>


</html>