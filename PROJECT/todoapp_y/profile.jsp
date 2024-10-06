<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <link rel="stylesheet" type="text/css" href="static/css/common.css" />
  <link rel="stylesheet" type="text/css" href="static/css/profile.css" />
  
  <script src="static/js/menu.js"> </script>
  <script src="static/js/profile.js"> </script>
  <script src="static/js/common.js"> </script>

  <title>User Profile</title>
 </head>
 <body>
  <div id="container">
	<%@ include file="header.jsp" %>

	<%@ include file="menu.jsp" %>
	<input type="hidden" id="page" value="0" />

	<div id="main_body">
	${user.userName}
	</div>

	<%@ include file="footer.jsp" %>
  </div>
 </body>
</html>
