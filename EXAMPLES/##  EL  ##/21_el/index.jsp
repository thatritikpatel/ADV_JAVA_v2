<%@ page import="java.util.*" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <%
	Map m = new HashMap();
	m.put("abc",123);
	m.put("mno",456);

	request.setAttribute("records",m);  

	request.setAttribute("abc","mno");
  %>

  ${records} <br /><br />

  ${records.abc} <br /><br />

  ${records['abc']} <br /><br />

  ${records[abc]} <br /><br />


 </body>
</html>
