<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <h1>#################</h1>
  <!-- Case 2: -->
  <c:if test="${abc<120}">
	<h1>Some Value</h1>
  </c:if>

  <h1>#################</h1>

  <!-- Case 1: -->
 <%--
  <% Integer val = (Integer)session.getAttribute("abc"); %>

  <% if(val<200){ %>
	<h1>Some Value</h1>
  <% } %>--%>
 </body>
</html>
