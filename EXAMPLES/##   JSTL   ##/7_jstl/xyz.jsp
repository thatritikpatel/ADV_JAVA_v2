<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <c:forEach var="y" items="${set}">
	<h1>${y}</h1>
  </c:forEach>
 </body>
</html>
