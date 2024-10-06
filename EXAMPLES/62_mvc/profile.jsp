<%@ page import="models.Student" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <% Student st = (Student)session.getAttribute("student"); %>
	<form action="update.do">
	  <table border="1" width="50%" align="center">
		<tr>
			<th>Student Name</th>
			<td>
				<input type="text" name="name" value="<%= st.getName() %>" />
			</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>
				<input type="text" name="email" value="<%= st.getEmail() %>" />
			</td>
		</tr>
		<tr>
			<th>Degree</th>
			<td>
				<input type="text" name="degree" value="<%= st.getDegree() %>" />
			</td>
		</tr>
		<tr>
			<th>Branch</th>
			<td>
				<input type="text" name="branch" value="<%= st.getBranch() %>" />
			</td>
		</tr>
		<tr>
			<th>Semester</th>
			<td>
				<input type="text" name="semester" value="<%= st.getSemester() %>" />
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Update" />
			</td>
		</tr>
	  </table>
	</form>
 </body>
</html>
