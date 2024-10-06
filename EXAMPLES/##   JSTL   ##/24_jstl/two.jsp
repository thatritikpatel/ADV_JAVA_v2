<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Two Page</h1>

  Session: <%= session.getId() %>
  <br /><br />

  <% String encURL = response.encodeURL("three.jsp"); %>
  <a href="<%= encURL %>">Page Three</a>
 </body>
</html>
