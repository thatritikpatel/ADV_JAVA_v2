<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <% pageContext.setAttribute("abc",989); %>
  <% request.setAttribute("abc",239); %>
  <% session.setAttribute("abc",555); %>
  <% application.setAttribute("abc",758); %>

  <hr />

  ${pageScope.abc}<br />
  ${requestScope.abc}<br />
  ${sessionScope.abc}<br />
  ${applicationScope.abc}


 </body>
</html>
