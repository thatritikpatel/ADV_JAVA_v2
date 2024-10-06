<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <c:forEach var="w" items="${arr}" varStatus="x">
	${x.count}: ${w} <br />
  </c:forEach>
 </body>
</html>
