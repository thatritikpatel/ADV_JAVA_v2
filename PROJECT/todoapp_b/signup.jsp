<!doctype html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="static/css/common.css" />
  <link rel="stylesheet" type="text/css" href="static/css/form.css" />
  <title>User SignUp</title>
 </head>
 <body>
  <div id="container">
	<%@ include file="header.jsp" %>

	<div id="main_body">
		<form action="signup.do" method="post">
			<table>
				<caption>User SignUp</caption>
				<tr>
					<th>User Name<sup>*</sup></th>
					<td>
						<input type="text" name="uname" class="fld" />
					</td>
				</tr>
				<tr>
					<th>Email<sup>*</sup></th>
					<td>
						<input type="email" name="email" class="fld" />
					</td>
				</tr>
				<tr>
					<th>Password<sup>*</sup></th>
					<td>
						<input type="password" name="pass" class="fld" />
					</td>
				</tr>
				<tr>
					<th>Retype Password<sup>*</sup></th>
					<td>
						<input type="password" name="repass" class="fld" />
					</td>
				</tr>
				<tr>
					<th>Country</th>
					<td>
						<select name="country_id" class="fld">
							<option value="0">Country</option>

							<c:forEach var="country" items="${countries}">
								<option value="${country.countryId}">${country.country}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2" id="btn_box">
						<input type="submit" value="SignUp" id="btn" />
					</td>
				</tr>
			</table>
			<div id="note">*Mandatory Fields...</div>
		</form>
	</div>

	<%@ include file="footer.jsp" %>
  </div>
 </body>
</html>
