<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <c:set var="abc" value="123" scope="request" />
  <c:set var="abc" value="234" scope="session" />

  Attribute in Request Scope: <c:out value="${requestScope.abc}" /><br />
  Attribute in Session Scope: <c:out value="${sessionScope.abc}" /><br />

  <c:remove var="abc" />

  Attribute in Request Scope: <c:out value="${requestScope.abc}" /><br />
  Attribute in Session Scope: <c:out value="${sessionScope.abc}" /><br />
 </body>
</html>
