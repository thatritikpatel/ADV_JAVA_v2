<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <table border="1" align="center" width="50%">	
  <c:forEach var="ar" items="${list}">
	<tr>
		<c:forEach var="x" items="${ar}">
			<td>${x}</td>
		</c:forEach>
	</tr>
  </c:forEach>
  </table>
 </body>
</html>
