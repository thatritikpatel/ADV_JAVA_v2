<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="static/css/common.css" />
  <link rel="stylesheet" type="text/css" href="static/css/form.css" />
  <title>User SignUp</title>
 </head>
 <body>
  <div id="container">
	<%@ include file="header.jsp" %>

	<div id="main_body">
		<form action="signup.do" method="post">
			<table>
				<caption>User SignUp</caption>
				<tr>
					<th>User Name</th>
					<td>
						<input type="text" name="uname" class="fld" />
					</td>
				</tr>
				<tr>
					<th>Email</th>
					<td>
						<input type="email" name="email" class="fld" />
					</td>
				</tr>
				<tr>
					<th>Password</th>
					<td>
						<input type="password" name="pass" class="fld" />
					</td>
				</tr>
				<tr>
					<th>Retype Password</th>
					<td>
						<input type="password" name="repass" class="fld" />
					</td>
				</tr>
				<tr>
					<td colspan="2" id="btn_box">
						<input type="submit" value="SignUp" id="btn" />
					</td>
				</tr>
			</table>
		</form>
	</div>

	<%@ include file="footer.jsp" %>
  </div>
 </body>
</html>
