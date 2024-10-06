<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
	<h1>NEXT Page</h1>
	
	<% String userName = request.getParameter("uname"); %>
	<% String email = request.getParameter("email"); %>
	<% String password = request.getParameter("passw"); %>

	User Name: <%= userName %><br />
	Email: <%= email %><br />
	Password: <%= password %>
 </body>
</html>
