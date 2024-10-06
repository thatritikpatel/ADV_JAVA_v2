<%--<%@ page import="java.util.Date,java.io.File" %>--%>

<%@ page import="java.util.Date" %>
<%@ page import="java.io.File" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <%   
	String s = "mohan"; 
	Date dt = new Date(); 
	File f = new File("abc.txt");
  %>

  Name: <%= s %><br />
  Date: <%= dt %><br />
  File: <%= f %>
 </body>
</html>
