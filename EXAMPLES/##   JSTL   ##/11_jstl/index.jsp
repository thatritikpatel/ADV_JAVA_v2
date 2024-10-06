<%@ page import="models.Student" %>

<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <%
	Student s1 = new Student("Mohan",21,"SRIT");
	Student s2 = new Student("Ganesh",20,"GGITS");
	Student s3 = new Student("Sudheer",22,"Global");

	Student[] arr = {s1,s2,s3};
	session.setAttribute("arr",arr);
  %>

  <a href="pqr.jsp">The Link</a>
 </body>
</html>
