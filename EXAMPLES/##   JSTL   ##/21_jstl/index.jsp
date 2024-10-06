<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <%
	Map map = new HashMap();
	map.put("abc",123);
	request.setAttribute("records",map);
  %>

  <c:out value="${records.abc}" />
  <c:set target="${records}" property="abc" value="999" />
  <br /><br />
  <c:out value="${records.abc}" />

  <c:set target="${records}" property="xyz" value="111" />
  <br /><br />
  <c:out value="${records}" />
 </body>
</html>
