<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
	<% request.setAttribute("a",12); %>  
	<% request.setAttribute("b",15); %>
	<% request.setAttribute("c",12); %>
	
	${a<b} <br /><br />
	${a lt b} <br /><br />

	${a > b} <br /><br />
	${a gt b} <br /><br />
	
	${a <= c} <br /><br />
	${a le c} <br /><br />
	
	${a >= c} <br /><br />
	${a ge c} <br /><br />
 </body>
</html>
