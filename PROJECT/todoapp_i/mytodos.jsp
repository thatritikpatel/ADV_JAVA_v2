<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <link rel="stylesheet" type="text/css" href="static/css/common.css" />
  <link rel="stylesheet" type="text/css" href="static/css/index.css" />
  
  <title>My ToDos</title>
 </head>
 <body>
  <div id="container">
	<%@ include file="header.jsp" %>

	<%@ include file="menu.jsp" %>
	<input type="hidden" id="page" value="1" />

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
