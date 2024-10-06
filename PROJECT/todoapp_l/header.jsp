<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="header">
	<img src="static/images/logo.png" height="80%" id="logo" />
	<span id="logo_text">ToDoApp</span>

	<span id="control1">
		<c:choose>
			<c:when test="${user==null}">
				<a href="showsignup.do">SignUp</a>
				<a href="showsignin.do">SignIn</a>
			</c:when>
			<c:otherwise>
				<a href="logout.do">Logout</a>
			</c:otherwise>		
		</c:choose>
	</span>
</div>