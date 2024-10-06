<%@ page import="models.Student,java.util.ArrayList" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <a href="index.jsp">Home</a>
  <% ArrayList<Student> students = (ArrayList<Student>)request.getAttribute("stds"); %>

  <table border="1" width="90%" align="center">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>College</th>
		<th>Degree</th>
		<th>Gender</th>
		<th>Course</th>
	</tr>

	<% for(Student s : students){ %>
		<tr>
			<td><%= s.getStudentId() %></td>
			<td><%= s.getName() %></td>
			<td><%= s.getCollege() %></td>
			<td><%= s.getDegree() %></td>
			<td><%= s.getGender() %></td>
			<td><%= s.getCourse() %></td>
		</tr>
	<% } %>
  </table>	
 </body>
</html>
