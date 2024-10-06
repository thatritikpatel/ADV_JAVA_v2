<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <style>
	body{
		font-family: verdana;
	}

	.aa{
		/*vertical-align: top;*/
	}

	th,td{
		height: 50px; 
		/* border: 1px solid #2e2e2e; */
	}

	td{
		vertical-align: middle;
	}

	table{
		border: 1px solid #d4d4d4;
		background-color: #f4f4f4;
	}

	caption{
		text-align: left;
		border: 1px solid #d4d4d4;
		padding: 5px 12px;
		background-color: #696969;
		color: white;
	}

	input{
		border: 1px solid #2e2e2e;
		font-size: 20px;
		border-radius: 5px;
		padding-left: 12px;
	}

	#msg{
		margin: 10px auto;
		width: 400px;
		text-align: center;
		font-size: 20px;
		color: red;
		border: 1px solid red;
		background-color: #fff7f4;
		border-radius: 8px;	
	}
  </style>
  <title>Document</title>
 </head>
 <body>
  
  <% String message = (String)request.getAttribute("message"); %>

  <% if(message!=null){ %>
  <div id="msg">
	<%= message %>
  </div>	
  <% } %>
  
  <form action="save.do">
	<table border="0" align="center" width="60%">
		<caption>Student Form<caption>
		<tr>
			<th width="50%" align="right">Student Name : </th>
			<td width="50%" class="aa">&nbsp;<input type="text" name="name" /></td>
		</tr>
		<tr>
			<th align="right">Email : </th>
			<td class="aa">&nbsp;<input type="email" name="email" /></td>
		</tr>
		<tr>
			<th align="right">Degree : </th>
			<td class="aa">&nbsp;<input type="text" name="degree" /></td>
		</tr>
		<tr>
			<th align="right">Branch : </th>
			<td class="aa">&nbsp;<input type="text" name="branch" /></td>
		</tr>
		<tr>
			<th align="right">Semester : </th>
			<td class="aa">&nbsp;<input type="text" name="semester" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Save" />
			</td>
		</tr>
	</table>
  </form>

 </body>
</html>
