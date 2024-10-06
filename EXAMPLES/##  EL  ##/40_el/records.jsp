<%@ taglib prefix="y" uri="project.mohan" %>
<%@ taglib prefix="x" uri="project.ganesh" %>

<!doctype html>

<html lang="en">
 <head>
 
  <title>Document</title>
 </head>
 <body>
	<h1>Records Page</h1> 
	
	${y:listStudents(records)}

	<br /><br />
	${x:listRecords(stateRecords)}

	<br /><br />
	${y:listRecords(citiRecords)}

 </body>
</html>
