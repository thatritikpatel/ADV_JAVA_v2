<%@ page import="java.util.ArrayList" %>
<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <% 
	ArrayList al = new ArrayList(); 
	
	//al.add(12);
	
	session.setAttribute("a",al); 
  %>

  ${empty a}
 </body>
</html>
