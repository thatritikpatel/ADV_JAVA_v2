<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <%--<% request.setAttribute("abc","Mohan"); %>
  Hello <c:out value="${abc}" default="User" />--%>

  Hello <c:out value="${abc}">Ganesh</c:out>
 </body>
</html>
