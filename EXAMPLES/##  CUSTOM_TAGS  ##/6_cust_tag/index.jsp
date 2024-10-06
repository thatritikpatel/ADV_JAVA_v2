<%@ taglib prefix="z" uri="cust_tag_5" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Index Page</h1>
  <hr />
  <% 
	request.setAttribute("pages",2400); 
	request.setAttribute("price",1800);   
	request.setAttribute("author","Mr. Ganesh");   
	request.setAttribute("pblshr","TMH");   
  %>


  <z:book author='<%= (String)request.getAttribute("author") %>' price="345.50" pages="${pages}" publisher='<c:out value="${pblshr}" />' />


 </body>
</html>
