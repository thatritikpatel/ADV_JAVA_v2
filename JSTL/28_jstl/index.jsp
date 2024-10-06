<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <c:set var="abc" value="123" scope="request" />

  ~<c:out value="${abc}" />~
  <br /><br />

  <c:remove var="abc" />

  #<c:out value="${abc}" />#
 </body>
</html>
