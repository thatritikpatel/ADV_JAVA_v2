<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <form action="next.jsp"> 
	User Name: <input type="text" name="nm" /><br />
	Email: <input type="email" name="em" /><br /> 
	Food:<br />
	Samosa:<input type="checkbox" name="food" value="samosa" /><br />
	Jalebi:<input type="checkbox" name="food" value="jalebi" /><br />
	Poha:<input type="checkbox" name="food" value="poha" /><br />
	<br />
	<select name="city" multiple>
		<option>Jabalpur</option>
		<option>Jaipur</option>
		<option>Jagdalpur</option>
		<option>Raipur</option>
		<option>Kanpur</option>
	</select>
	<input type="submit" value="Save" />
  </form>
 </body>
</html>
