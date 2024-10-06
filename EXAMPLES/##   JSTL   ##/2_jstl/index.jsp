<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <% request.setAttribute("abc","<h1>Hello</h1>"); %>

  ${abc} ###

  <br />

  <c:out value="${abc}" /> ^^^
 </body>
</html>
