<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next Page</h1>
  <% pageContext.setAttribute("abc",true); %>
  
  <br /><br />

  ***** ${pageScope.abc}

  <br /><br />


  ####  ${requestScope.abc}

  <br /><br />

  ~~~~  ${sessionScope.abc}


  <br /><br />

  ~~~~  ${applicationScope.abc}


 </body>
</html>
