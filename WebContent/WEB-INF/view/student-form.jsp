<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head> <title> student form</title></head>


<body>
	<form:form action="processFormTag" modelAttribute="student">
	
	<!-- Input AREA -->
		<!-- path="property of the student class" , value is the attritube value   -->
		first name <form:input path='firstName'/> 
		<br><br>
		last name <form:input path="lastName" />
		<br><br>
		
	<!-- Dropdown list AREA -->
		School Year: 
		<form:select path="schoolYear">  
			<form:options items="${student.schoolYearOption}" />
		</form:select>
		<br><br>
		
	<!-- Radio-button AREA -->
		Programming Language: 
<%-- 		
		Java <form:radiobutton path="favLanguage" value="Java" />
		C++ <form:radiobutton path="favLanguage" value="C++" />
		Go <form:radiobutton path="favLanguage" value="Go" />
		Rail <form:radiobutton path="favLanguage" value="Rail" />
		Javascript <form:radiobutton path="favLanguage" value="Javascript" /> 
--%>
		<form:radiobuttons path="favLanguage" items="${student.favoriteLanguageOptions}"/>
		<br><br>

	<!-- Check box AREA -->
		Operation System: 
		 <form:checkbox path="operationSystem" value="linux" /> Linux 
		 <form:checkbox path="operationSystem" value="Mac" /> Mac 
		 <form:checkbox path="operationSystem" value="Windows" />  Windows 
		<br><br>
		
	<!-- Submit AREA -->
		<input type="submit" value="Submit"/> 
		<br><br>

	</form:form> 
</body>


</html>