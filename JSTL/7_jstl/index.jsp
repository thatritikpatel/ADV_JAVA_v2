<%@ page import="java.util.HashSet" %>
<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <% 
	HashSet<Float> set = new HashSet<Float>(); 

	set.add(23.45f);
	set.add(56.67f);
	set.add(12.45f);

	session.setAttribute("set",set);
  %>

  <a href="xyz.jsp">The Link</a>
 </body>
</html>
