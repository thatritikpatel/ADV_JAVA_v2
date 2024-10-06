<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <% 
	String s1 = null;
	String s2 = "";
	String s3 = "Mohan";

	request.setAttribute("a",s1); 
	request.setAttribute("b",s2); 
	request.setAttribute("c",s3);  
  %>

  ${empty a}<br />
  ${empty b}<br />
  ${empty c}<br />
 </body>
</html>
