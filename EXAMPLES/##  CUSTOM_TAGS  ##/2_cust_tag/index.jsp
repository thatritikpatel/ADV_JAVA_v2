<%@ taglib prefix="a" uri="cust_tag_2" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <% request.setAttribute("aaa",111); %>
  <% request.setAttribute("bbb","ghanshyam"); %>
  <h1>Index Page</h1>
  	
  <hr />
  <a:abc>Mohan</a:abc><br />
  <a:abc>${aaa}</a:abc><br />
  <a:abc><c:out value="${bbb}" /></a:abc><br />
  <%--<a:abc><%= 12 %></a:abc>--%>
  <hr />
 </body>
</html>
