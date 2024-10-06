<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <% String encUrl = response.encodeURL("mno.jsp"); %>

  <a href="<%= encUrl %>">To MNO page</a>
 </body>
</html>
