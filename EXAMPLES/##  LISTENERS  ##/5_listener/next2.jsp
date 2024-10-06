<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Index Page</h1>
  <hr />
  <% System.out.println("##########~~~~~~~~~~~~~~~~~~~##start"); %>
  <% request.setAttribute("aaaaa","gautam"); %>
  <% System.out.println("##########~~~~~~~~~~~~~~~~~~~~####end"); %>
  <% request.removeAttribute("aaaaa"); %>
  <% System.out.println("##########~~~~~~~~~~~~~~~~~~~~####end"); %>

  <br /><br />
 </body>
</html>
