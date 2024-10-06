<!doctype html>
<html lang="en">
 <head>
  
  <title>Document</title>
 </head>
 <body>
  <h1>Next2 Page</h1>

  ${cookie}<br /></br />

  ${cookie.xyz}<br />
  ${cookie.pqr}<br />
  ${cookie.JSESSIONID}<br /><br />

  ######################################<br /><br />

  ${cookie.xyz.name}~${cookie.xyz.value}<br />
  ${cookie.pqr.name}~${cookie.pqr.value}<br />
  ${cookie.JSESSIONID.name}~${cookie.JSESSIONID.value}<br />

  <br /><br />

  ######################################<br /><br />

  ${cookie['JSESSIONID']['name']}~${cookie['JSESSIONID'].value}<br />

	
 </body>
</html>
