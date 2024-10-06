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

			
			<div id="txnote_ttl_box">
				<img src="static/images/title_arrow.png" id="ttl_arrw" />
				<span id="samp_ttl">Here goes your title...</span>
				<input type="text" id="title" />
				<img src="static/images/edit.png" id="ttl_edit" title="Set/Change Title" />
				<span id="sv_todo">Save</span>
				<input type="hidden" id="todotype" />
				<input type="hidden" id="_todoid_" />
			</div>

			<!-- ###################Text Note##################### -->
			<div id="todo_tnote_box">				
				<textarea id="txarea" name="txnote"></textarea>
			</div>
			<!-- ####################Text Note################### -->


			<!-- ###################Itemed List##################### -->
			<div id="todo_itemed_list_box">
				<table id="itemed_rec_box">
					<!--
					<tr id="step_row_1">
						<td class="_itm_rec_cell_left" id="_first_rec">			
							<input type="checkbox" class="chk_rec" />
						</td>
						<td class="_itm_rec_cell_middle">
							<input type="text" class="chk_tfld" id="step_1" />
						</td>
						<td class="_itm_rec_cell_right">
							<img src="static/images/del.png" class="_step_del_img" id="_step_del_id_1" />
						</td>
					</tr>-->
				</table>
				<table id="done_rec_box">
					<caption id="done_cap">Steps Done:</caption>
				</table>
				<!--
				<div id="_add">
					<img src="static/images/add.png" id="_add" title="Add New Record..." />
				</div>-->
			</div>			
			<!-- ###################Itemed List##################### -->


			<!-- ####################No Recs################## -->
			<div id="norecs">No Records to Show...!</div>
			<!-- ####################No Recs#################### -->

			<!-- ####################All Recs#################### -->
			<div id="all_recs_box"><div>
			<!-- ####################All Recs################### -->
		</div>
	</div>

	<%@ include file="footer.jsp" %>
  </div>
 </body>
</html>
