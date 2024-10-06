<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <h1>Index Page</h1>

  <c:url value='home.jsp' var="home_enc_url" scope="session" />
  <a href="${home_enc_url}">Home</a><br /><br />


  Session: <%= session.getId() %>
  <br /><br />
    
  
  <a href='<c:url value="one.jsp" />'>Page One</a>
 </body>
</html>
