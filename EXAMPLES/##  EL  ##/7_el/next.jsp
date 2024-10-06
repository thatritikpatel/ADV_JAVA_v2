<%@ page import="models.*" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next Page</h1>

  <% User user = (User)request.getAttribute("user"); %>
  
  Name: <%= user.getName() %><br />
  Age: <%= user.getAge() %><br />
  City: <%= user.getAddress().getCity().getCityName() %><br />
  State: <%= user.getAddress().getState().getStateName() %><br />

 </body>
</html>
