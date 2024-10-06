<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Two Page</h1>

  <a href="${home_enc_url}">Home</a><br /><br />

  Session: <%= session.getId() %>
  <br /><br />
  
  <a href="<c:url value='three.jsp' />">Page Three</a>
 </body>
</html>
