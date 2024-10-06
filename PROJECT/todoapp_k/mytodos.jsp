<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <link rel="stylesheet" type="text/css" href="static/css/common.css" />
  <link rel="stylesheet" type="text/css" href="static/css/mytodos.css" />
  
  <script src="static/js/menu.js"> </script>
  <script src="static/js/mytodos.js"> </script>
  <script src="static/js/common.js"> </script>	

  <title>My ToDos</title>
 </head>
 <body>
  <div id="container">
	<%@ include file="header.jsp" %>

	<%@ include file="menu.jsp" %>
	<input type="hidden" id="page" value="1" />

	<div id="main_body">
		<div id="todos_ctrl_box">
			<div id="ctrl_header">
				<span id="new_lbl">New:</span>				
				<img src="static/images/textnote3.png" title="New Text-Note" id="nw_txnote" />
				<img src="static/images/todo3.png" title="New Check List"  id="nw_chklist" />
				<img src="static/images/numbered.png" title="New Numbered List" id="nw_numlist" />
			</div>

			<!-- ###################Text Note##################### -->
			<div id="todo_box">
				<div id="txnote_ttl_box">
					<img src="static/images/title_arrow.png" id="ttl_arrw" />
					<span id="samp_ttl">Here goes your title...</span>
					<input type="text" id="title" />
					<img src="static/images/edit.png" id="ttl_edit" />
					<span id="sv_txnote">Save</span>
					<input type="hidden" id="todotype" />
				</div>
				<textarea id="txarea" name="txnote"></textarea>
			</div>
			<!-- ####################Text Note################### -->

			<!-- ####################No Recs################## -->
			<div id="norecs">No Records to Show...!</div>
			<!-- ####################No Recs#################### -->

			<!-- ####################All Recs#################### -->
			<div id="all_recs_box">
			

			<div>
			<!-- ####################All Recs################### -->
		</div>
	</div>

	<%@ include file="footer.jsp" %>
  </div>
 </body>
</html>
