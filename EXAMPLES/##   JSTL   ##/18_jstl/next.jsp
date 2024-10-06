<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>

<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next Page</h1>
  
  1.<c:out value="${requestScope.bk.title}" /><br />
  2.<c:out value="${sessionScope.bk.title}" /><br />
  <h1>#############################################</h1>
  <c:set var="book" value="${bk}" scope="session" />
  <h1>#############################################</h1>	
  3.<c:out value="${requestScope.bk.title}" /><br />
  4.<c:out value="${sessionScope.book.title}" /><br />

 </body>
</html>
