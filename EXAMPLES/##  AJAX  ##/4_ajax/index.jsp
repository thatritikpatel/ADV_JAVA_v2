<!doctype html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  State: 
  <select id="state">
	<option value="0">Select</option>

	<c:forEach var="state" items="${states}">
		<option value="${state.stateId}">${state.stateName}</option>
	</c:forEach>
  </select>
  
  <br /><br />

  <select id="city">
	<option value="0">Select</option>
  </select>
	

  <br /><br />


  <input type="button" value="Send" id="send" />

  <script src="js/index.js"></script>
 </body>
</html>
