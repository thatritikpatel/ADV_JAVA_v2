<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <!--Case 1: -->
  <%--
  <% int[] a = (int[])session.getAttribute("arr"); %>

  <% for(int i=0;i<a.length;i++){ %>
	<h1><%= a[i] %></h1>
  <% } %>--%>

  <!-- Case 2 -->
  <c:forEach var="x" items="${arr}">
	<h1><c:out value="${x}****" /></h1>
  </c:forEach>
 </body>
</html>
