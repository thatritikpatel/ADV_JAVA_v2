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
  <form action="signup.do" method="post" enctype="multipart/form-data">
	<table border="1" width="50%" align="center">
		<caption>User SingUp</caption>
		<tr>
			<th width="50%">User Name</th>
			<td width="50%">
				<input type="text" name="uname" />
			</td>
		</tr>
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
			<th width="50%">Re-Password</th>
			<td width="50%">
				<input type="password" name="repass" />
			</td>
		</tr>
		<tr>
			<th width="50%">Your Pic</th>
			<td width="50%">
				<input type="file" name="file" />
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="SignUp" />
			</td>
		</tr>
	</table>
  </form>
 </body>
</html>
