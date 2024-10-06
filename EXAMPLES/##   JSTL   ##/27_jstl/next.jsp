<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next Page ::</h1>

  <c:choose>
	<c:when test="${param.open==1}">
		<c:redirect url="http://localhost:8080/abc/aaa.jsp" />
	</c:when>
	<c:when test="${param.open==2}">
		<c:redirect url="http://www.google.com" />
	</c:when>
	<c:when test="${param.open==3}">
		<c:redirect url="http://www.facebook.com" />
	</c:when>
  </c:choose>
 </body>
</html>
