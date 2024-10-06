<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Profile Page</h1>
  <hr />
  <table border="1" width="80%" align="center">
	<tr>
		<td width="50%" align="center">
			<img src="pic.do" height="150" />
		</td>
		<td width="50%" align="center">
			<table border="1" width="80%" align="center">
				<tr>
					<td width="40%">User Name</td>
					<td width="60%">${user.userName}</td>
				</tr>
				<tr>
					<td width="40%">Email</td>
					<td width="60%">${user.email}</td>
				</tr>
			</table>
		</td>
	</tr>
  </table>	
 </body>
</html>
