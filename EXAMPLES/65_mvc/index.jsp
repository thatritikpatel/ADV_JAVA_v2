<%@ page import="models.Student,java.util.*" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <% Student s = (Student)request.getAttribute("student"); %>

  <a href="showall.do">Show All Students</a>
  <form action="<%= s!=null?"update.do":"save.do" %>">
	<table border="1" width="70%" align="center">
		<tr>
			<th>Student Name</th>
			<td>				
				<input type="text" name="name" value='<%= s!=null?s.getName():"" %>' />				
			</td>
		</tr>
		<tr>
			<th>Gender</th>
			<td>
				M:<input type="radio" name="gender" value="m" <%= s!=null&&s.getGender().equals("m")?"checked":"" %> />
				&nbsp;&nbsp;&nbsp;
				F:<input type="radio" name="gender" value="f" <%= s!=null&&s.getGender().equals("f")?"checked":"" %> />	
			</td>
		</tr>
		<tr>
			<th>College</th>
			<td>
				<input type="text" name="college" value="<%= s!=null?s.getCollege():"" %>" />	
			</td>
		</tr>
		<tr>
			<th>Degree</th>
			<td>
				<select name="degree">
					<option>Degree</option>
					<option <%= s!=null&&s.getDegree().equals("BE")?"selected":"" %>>BE</option>
					<option <%= s!=null&&s.getDegree().equals("ME")?"selected":"" %>>ME</option>
					<option <%= s!=null&&s.getDegree().equals("BTech")?"selected":"" %>>BTech</option>
					<option <%= s!=null&&s.getDegree().equals("MTech")?"selected":"" %>>MTech</option>
				</select>	
			</td>
		</tr>
		<tr>
			<th>Course</th>
			<td>
				<% 
					Map<String,Integer>	map = new LinkedHashMap<String,Integer>();
					if(s!=null){
						String[] arr = s.getCourse().split(","); 						
						map.put("JAVA",0);
						map.put("Adv. JAVA",0);
						map.put("Python",0);
						map.put("Django",0);
						for(String tmp : arr){
							if(tmp.equals("JAVA")){
								map.put("JAVA",1);
							}else if(tmp.equals("Adv. JAVA")){
								map.put("Adv. JAVA",1);
							}else if(tmp.equals("Python")){
								map.put("Python",1);
							}else if(tmp.equals("Django")){
								map.put("Django",1);
							}
						}
					}
				%>
				JAVA: <input type="checkbox" name="course" value="JAVA" <%= s!=null&&map.get("JAVA")==1?"checked":"" %> />
				&nbsp;&nbsp;&nbsp;
				Adv. Java: <input type="checkbox" name="course" value="Adv. JAVA" <%= s!=null&&map.get("Adv. JAVA")==1?"checked":"" %> />	
				&nbsp;&nbsp;&nbsp;
				Python: <input type="checkbox" name="course" value="Python" <%= s!=null&&map.get("Python")==1?"checked":"" %> />	
				&nbsp;&nbsp;&nbsp;
				Django: <input type="checkbox" name="course" value="Django" <%= s!=null&&map.get("Django")==1?"checked":"" %> />	
			</td>
		</tr>	
		<tr>
			<td align="center" colspan="2">
				<input type="hidden" name="student_id" value='<%= s!=null?s.getStudentId():"" %>' />
				<input type="submit" value="<%= s!=null?"Update":"Save" %>" />
			</td>
		</tr>
	</table>
  </form>
 </body>
</html>
