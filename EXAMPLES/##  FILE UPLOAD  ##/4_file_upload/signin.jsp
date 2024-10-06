<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
  <style>
	body{
		font-family: verdana;
		color: #262626;
	}
  </style>
 </head>
 <body>
  <%@ include file="header.jsp" %>
  <hr />

  <form action="signin.do" method="post">
	<table border="1" width="50%" align="center">
		<caption>User SingIn</caption>
		<tr>
			<th width="50%">Email</th>
			<td width="50%">
				<input type="email" name="email" />
			</td>
		</tr>
		<tr>
			<th width="50%">Password</th>
			<td width="50%">
				<input type="password" name="passw" />
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="SignIn" />
			</td>
		</tr>
	</table>
  </form>
 </body>
</html>
