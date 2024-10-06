<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>

  <% 
	String error = (String)request.getAttribute("error");

	if(error!=null){
  %>

  <div style="color:red;background-color:#fee4e0;font-size:22px;border:1px solid green;padding:10px 25px;margin:20px auto;width:80%;text-align:center"><%= error %></div>	

  <% } %>

  <form action="save.do">
	Employee Name: <input type="text" name="emp_nm" required /><br />
	Employee Email: <input type="email" name="email" required /><br />
	Employee Password: <input type="password" name="password" required maxlength="12" size="5" /><br />
	Employee Age: <input type="number" name="age" required /><br />
	<input type="submit" value="Save Employee" />
  </form>
 </body>
</html>
