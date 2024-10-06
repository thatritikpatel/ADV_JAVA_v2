<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>

 <c:choose>
	<c:when test="${param.price<=200}">
		<h1>Buy the book ~~~</h1>
	</c:when>
	<c:when test="${param.price<=400}">
		<h1>Buy it later ~~~~</h1>
	</c:when>
	<c:otherwise>
		<h1>Don't buy the book ~~~</h1>
	</c:otherwise>
 </c:choose>

  <%--
  <% 
	String pr = request.getParameter("price"); 
	int price = Integer.parseInt(pr);
  %>

  <% if(price<=200){ %>
	<h1>Buy the book</h1>
  <% }else if(price<=400){ %>
	<h1>Buy it later</h1>
  <% }else{ %>
	<h1>Don't buy the book</h1>
  <% } %>
  --%>
 </body>
</html>
