<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>

<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next Page</h1>
  
  <c:out value="${bk.title}" />

  <c:set target="${bk}" property="title" value="PHP" />

  <br /><br />

  <c:out value="${bk.title}" />
 

 </body>
</html>
