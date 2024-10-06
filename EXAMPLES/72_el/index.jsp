<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  ${header.host}<br />
  <%--${header.user-agent}--%>
  ${header['user-agent']}
  <br />
  ${header.accept}<br />
  <%--${header.accept-language}--%>
  ${header['accept-language']}
 </body>
</html>
