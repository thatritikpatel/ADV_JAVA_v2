<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next 1 Page</h1>
  <hr />
  <% System.out.println("##########~~~~~~~~~~~~~~~~~~~##start"); %>
  <% request.setAttribute("aaaaa","Bagheera"); %>
  <% System.out.println("##########~~~~~~~~~~~~~~~~~~~~####end"); %>
  <% request.setAttribute("aaaaa","Bholu"); %>
  <% System.out.println("##########~~~~~~~~~~~~~~~~~~~~####end"); %>

  <br /><br />

  <a href="next2.jsp">Next 2 Page</a>
 </body>
</html>
