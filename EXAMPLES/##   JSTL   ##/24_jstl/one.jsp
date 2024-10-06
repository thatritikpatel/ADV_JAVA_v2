<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>One Page</h1>

  Session: <%= session.getId() %>
  <br /><br />
  
  <% String encURL = response.encodeURL("two.jsp"); %>
  <a href="<%= encURL %>">Page Two</a>
 </body>
</html>
