<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <c:forEach var="x" items="${arr}">
	<h1><c:out value="${x}" /></h1>
  </c:forEach>
 </body>
</html>
