<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <% request.setAttribute("a",12); %>
  <% request.setAttribute("b",'A'); %>

  ${a+b}
 </body>
</html>
