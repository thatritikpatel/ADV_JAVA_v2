<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <%
	pageContext.setAttribute("abc",123);
	request.setAttribute("abc",234);
	session.setAttribute("abc",345);
	application.setAttribute("abc",456);
  %>

  <c:set var="aaa" value="333" scope="application" />

  <h1>#####################</h1>
  <c:out value="${aaa}" />
  <h1>#####################</h1>
  <c:out value="${applicationScope.aaa}" />
 </body>
</html>
