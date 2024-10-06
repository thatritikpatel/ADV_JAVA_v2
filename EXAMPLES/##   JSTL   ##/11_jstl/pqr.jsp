<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <table border="1" width="80%" align="center">	
	<tr>
		<th>Name</th>
		<th>Age</th>
		<th>College</th>
	</tr>

	<c:forEach var="obj" items="${arr}">
		<tr>
			<td>${obj.name}</td>
			<td>${obj.age}</td>
			<td>${obj.college}</td>
		</tr>
	</c:forEach>
  </table>
 </body>
</html>
