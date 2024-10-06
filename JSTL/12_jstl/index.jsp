<%@ page import="java.util.ArrayList" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <%
	int[] ar1 = {12,13,14,15};
	int[] ar2 = {22,23,24,25};
	int[] ar3 = {32,33,34,35};
	int[] ar4 = {42,43,44,45};

	ArrayList<int[]> list = new ArrayList<int[]>();
	list.add(ar1);
	list.add(ar2);
	list.add(ar3);
	list.add(ar4);

	session.setAttribute("list",list);
  %>

  <a href="abc.jsp">The Link</a>
 </body>
</html>
