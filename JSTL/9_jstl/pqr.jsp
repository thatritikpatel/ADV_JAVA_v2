<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <c:forEach var="e" items="${str}">
	${e}<br />
  </c:forEach>
 </body>
</html>
