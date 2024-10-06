<%@ page import="java.util.HashMap" %>
<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <% 
	HashMap map = new HashMap(); 

	map.put("a1",100);
	map.put("a2",200);
	map.put("a3",300);
	map.put("a4",400);
	map.put("a5",500);

	session.setAttribute("abc",map);  
  %>

  <a href="mno.jsp">The Link</a>
 </body>
</html>
