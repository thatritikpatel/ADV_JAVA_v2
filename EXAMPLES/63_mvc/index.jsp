<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <form action="save.do">
	<table border="1" width="70%" align="center">
		<tr>
			<th>Student Name</th>
			<td>
				<input type="text" name="name" />	
			</td>
		</tr>
		<tr>
			<th>Gender</th>
			<td>
				M:<input type="radio" name="gender" value="m" />
				&nbsp;&nbsp;&nbsp;
				F:<input type="radio" name="gender" value="f" />	
			</td>
		</tr>
		<tr>
			<th>College</th>
			<td>
				<input type="text" name="college" />	
			</td>
		</tr>
		<tr>
			<th>Degree</th>
			<td>
				<select name="degree">
					<option>Degree</option>
					<option>BE</option>
					<option>ME</option>
					<option>BTech</option>
					<option>MTech</option>
				</select>	
			</td>
		</tr>
		<tr>
			<th>Course</th>
			<td>
				JAVA: <input type="checkbox" name="course" value="JAVA" />
				&nbsp;&nbsp;&nbsp;
				Adv. Java: <input type="checkbox" name="course" value="Adv. JAVA" />	
				&nbsp;&nbsp;&nbsp;
				Python: <input type="checkbox" name="course" value="Python" />	
				&nbsp;&nbsp;&nbsp;
				Django: <input type="checkbox" name="course" value="Django" />	
			</td>
		</tr>	
		<tr>
			<td align="center" colspan="2">
				<input type="submit" value="Save" />
			</td>
		</tr>
	</table>
  </form>
 </body>
</html>
