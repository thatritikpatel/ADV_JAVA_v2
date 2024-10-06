<%@ page import="models.Student" %>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <% 
  
	Student s = new Student(); 
	session.setAttribute("student",s);
  
  %>
 </body>
</html>
