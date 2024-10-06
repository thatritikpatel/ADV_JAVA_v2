<%@ page import="models.User" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next Page</h1>


  <% User user = (User)request.getAttribute("user"); %>
  Name: <%= user.getName() %>
  Age: <%= user.getAge() %>


 </body>
</html>
