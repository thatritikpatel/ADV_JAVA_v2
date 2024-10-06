<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <c:forEach var="z" items="${abc}">
	${z.key}^^^^^^^${z.value}<br />
  </c:forEach>
 </body>
</html>
