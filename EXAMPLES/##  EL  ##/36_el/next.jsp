<%@ taglib prefix="a" uri="app_tld" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next Page</h1>

  ${a:prepareChart()}

  <br /><br />
  ###################################################

  <%--	
  <% String[] arr = (String[])request.getAttribute("data"); %>
  
  <table border="1" width="30%">
  <% for(String str : arr){ %>
	<tr>
		<td><%= str %></td>
	</tr>
  <% } %>
  </table>
  --%>

 </body>
</html>
