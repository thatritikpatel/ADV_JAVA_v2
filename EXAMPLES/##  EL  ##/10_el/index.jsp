<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <%= request.getHeader("accept-language") %>

  <br /><br />

  <!-- Try them one by one -->
  ${header.host}
  ${header.accept}
  ${header.accept-language}
 </body>
</html>
