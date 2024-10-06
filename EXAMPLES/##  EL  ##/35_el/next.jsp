<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next Page</h1>

  <% String[] arr = (String[])request.getAttribute("data"); %>
  
  <table border="1" width="30%">
  <% for(String str : arr){ %>
	<tr>
		<td><%= str %></td>
	</tr>
  <% } %>
  </table>
 </body>
</html>
