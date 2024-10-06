<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <% 
	pageContext.setAttribute("abc",123);
	request.setAttribute("abc",234); 
	session.setAttribute("abc",345);
	application.setAttribute("abc",456);
  %>

  <h1>#####################################</h1>

  <%= pageContext.getAttribute("abc") %><br />
  <%= request.getAttribute("abc") %><br />
  <%= session.getAttribute("abc") %><br />
  <%= application.getAttribute("abc") %><br />


  <h1>#####################################</h1>

  <%= pageContext.getAttribute("abc",PageContext.PAGE_SCOPE) %><br />
  <%= pageContext.getAttribute("abc",PageContext.REQUEST_SCOPE) %><br />
  <%= pageContext.getAttribute("abc",PageContext.SESSION_SCOPE) %><br />
  <%= pageContext.getAttribute("abc",PageContext.APPLICATION_SCOPE) %><br />










 </body>
</html>
