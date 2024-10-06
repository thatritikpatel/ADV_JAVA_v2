<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <c:set var="abc" value="789" />

  <h1>#########################</h1>
  <c:out value="${pageScope.abc}" />
  <h1>#########################</h1>
  <c:out value="${requestScope.abc}" />
  <h1>#########################</h1>
  <c:out value="${sessionScope.abc}" />
  <h1>#########################</h1>
  <c:out value="${applicationScope.abc}" />
  <h1>#########################</h1>
 </body>
</html>
