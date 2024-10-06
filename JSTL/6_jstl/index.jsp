<%@ page import="java.util.ArrayList" %>
<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <% 
	ArrayList<String> list = new ArrayList<String>(); 
	
	list.add("ganesh");
	list.add("mukesh");
	list.add("mahesh");
	list.add("vidyut");

	session.setAttribute("arr",list);
  %>

  <a href="xyz.jsp">The Link</a>	
 </body>
</html>
