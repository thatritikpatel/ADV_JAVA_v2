<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="static/css/common.css" />
  <link rel="stylesheet" type="text/css" href="static/css/index.css" />
  <title>User Dashboard</title>
 </head>
 <body>
  <div id="container">
	<%@ include file="header.jsp" %>

	<div id="main_body">
		<table id="struct1">
			<tr>
				<td width="40%">
					<div id="record1"></div>
				</td>
				<td width="60%">
					<div id="record2"></div>
				</td>
			</tr>
		</table>
		<table id="struct1">
			<tr>
				<td width="60%">
					<div id="record1"></div>
				</td>
				<td width="40%">
					<div id="record2"></div>
				</td>
			</tr>
		</table>
	</div>

	<%@ include file="footer.jsp" %>
  </div>
 </body>
</html>
