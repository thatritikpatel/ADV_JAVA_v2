<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>########################</h1>
  <c:catch var="err">
	  <%
		String str = null;
		out.print(str.length());  
	  %>	
  </c:catch>
  <h1>########################</h1> 
  
  <c:if test="${err!=null}">
	<c:out value="There is a problem" />
  </c:if>
 </body>
</html>
