<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Index Page</h1>

  Session: <%= session.getId() %>
  <br /><br />
  

  <% String encURL = response.encodeURL("one.jsp"); %>
  <a href="<%= encURL %>">Page One</a>
 </body>
</html>
