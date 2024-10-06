<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>One Page</h1>

  Session: <%= session.getId() %>
  <br /><br />
    
  <a href="<c:url value='two.jsp' />">Page Two</a>
 </body>
</html>
