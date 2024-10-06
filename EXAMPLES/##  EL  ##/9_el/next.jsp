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

	<% String[] food = request.getParameterValues("food"); %>

	User Name: <%= userName %><br />
	Email: <%= email %><br />
	Password: <%= password %><br />

	<% 
		if(food!=null){
			for(int i=0;i<food.length;i++){ %>
				Food Option <%= i+1 %>: <%= food[i] %><br />
	<% }} %>
 </body>
</html>
