<!--  Use the JSTL library -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>

<!DOCTYPE html>

<html>

<body>
	the student is confirmed: ${student.firstName} ${student.lastName};
	<br><br>
	School Year: ${ student.schoolYear}
	<br><br>
	Language: ${student.favLanguage}
	<br><br>
	Operation System 
	
	<ul>
		<j:forEach var="temp" items="${student.operationSystem}" >
		
			<li> ${temp} </li>
		</j:forEach>		
		
	</ul>
</body>

</html>