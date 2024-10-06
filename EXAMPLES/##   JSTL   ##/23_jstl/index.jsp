<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <c:import url="header.jsp">
	<c:param name="color" value="yellow" />
	<c:param name="text" value="hello" />
  </c:import>
  
  <h1>Index Page</h1>
  
  <h1>Footer</h1>
 </body>
</html>
