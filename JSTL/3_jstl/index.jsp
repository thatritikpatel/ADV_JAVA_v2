<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <% request.setAttribute("abc","<h1>Some Text</h1>"); %>

  <c:out value="${abc}" escapeXml="false" />
 </body>
</html>
