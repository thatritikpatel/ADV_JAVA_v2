<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <% request.setAttribute("abc",567); %>

  <br />

  :::::${requestScope.abc}:::::
 </body>
</html>
