
var todos_ctrl_box;
var nw_txnote,nw_chklist,nw_numlist;
var todo_tnote_box,norecs,all_recs_box,todo_itemed_list_box;
var txarea;
var ttl_edit,samp_ttl,title,sv_todo,todotype,ttl_arrw;
var _add,itemed_rec_box,_first_rec,step_1;

function getAllElements(){
	getAllMenuElements();

	todos_ctrl_box = document.getElementById('todos_ctrl_box');

	nw_txnote = document.getElementById('nw_txnote');
	nw_chklist = document.getElementById('nw_chklist');
	nw_numlist = document.getElementById('nw_numlist');	
	
	todo_tnote_box = document.getElementById('todo_tnote_box');		
	norecs = document.getElementById('norecs');	
	all_recs_box = document.getElementById('all_recs_box');	
	todo_itemed_list_box = document.getElementById('todo_itemed_list_box');	

	txarea = document.getElementById('txarea');	
	
	ttl_edit = document.getElementById('ttl_edit');	
	samp_ttl = document.getElementById('samp_ttl');	
	title = document.getElementById('title');	
	sv_todo = document.getElementById('sv_todo');	
	todotype = document.getElementById('todotype');	
	ttl_arrw = document.getElementById('ttl_arrw');	

	_add = document.getElementById('_add');	
	itemed_rec_box = document.getElementById('itemed_rec_box');	
	_first_rec = document.getElementById('_first_rec');	
	step_1 = document.getElementById('step_1');	
}

function setAllActions(){
	setAllMenuActions();

	collectAllToDos();
	
	nw_txnote.onclick = showNewTextNote;
	nw_chklist.onclick = nw_numlist.onclick = showNewItemedList;

	ttl_edit.onclick = samp_ttl.onclick = function(){
						ttl_edit.style.display = 'none';
						samp_ttl.style.display = 'none';
						title.style.display = 'inline';
						title.focus();
					   };

	title.onblur = function(){
						ttl_edit.style.display = 'inline';
						samp_ttl.style.display = 'inline';
						if(title.value.trim().length!=0){
							samp_ttl.innerHTML = title.value; 
						}
						title.style.display = 'none';						
					};

	sv_todo.onclick =	function(){
							if(todotype.value==1){
								saveTextnote();
							}else{
								saveItemedList();
							}
						};		

	_add.onclick = createNewItemedRecord;

	
	step_1.onkeyup = function(event){
						if(event.keyCode==13){
							createNewItemedRecord();
						}
					};
}

var rowid = 1;
function createNewItemedRecord(){
	var row = itemed_rec_box.insertRow(rowid++);
	
	var cell1 = row.insertCell(0);
	cell1.className = '_itm_rec_cell_left';

	if(todotype.value==2){
		var chk = document.createElement('input');
		chk.type = 'checkbox';
		chk.className = 'chk_rec';
		cell1.appendChild(chk);
	}else{
		var sp = document.createElement('span');
		sp.innerHTML = rowid+'.';
		sp.className = '_rec_num';
		cell1.appendChild(sp);
	}

	var cell2 = row.insertCell(1);
	cell2.className = '_itm_rec_cell_right';
	var fld = document.createElement('input');
	fld.id = 'step_'+rowid;
	fld.className = 'chk_tfld';	
	cell2.appendChild(fld);
	fld.focus();
	fld.onkeyup = function(e){
					if(e.keyCode==13){
						createNewItemedRecord();
					}
				  };
}

var alltodoreq;
function collectAllToDos(){
	alltodoreq = new XMLHttpRequest();
	alltodoreq.open('get','alltodos.do',true);
	alltodoreq.onreadystatechange = showAllToDos;
	alltodoreq.send();
}

function showAllToDos(){
	//alert(alltodoreq.readyState+' +++ '+alltodoreq.status);
	if(alltodoreq.readyState==4&&alltodoreq.status==200){
		//var recs = eval(alltodoreq.responseText);

		if(alltodoreq.responseText!='expired'){
			//alert(alltodoreq.responseText)
			var recs = JSON.parse(alltodoreq.responseText);
			if(recs.length!=0){
				all_recs_box.style.display = 'block';


				norecs.style.display = 'none';	
				todo_itemed_list_box.style.display = 'none';
				todo_tnote_box.style.display = 'none';
				txnote_ttl_box.style.display = 'none';	

				
				var top = left = 40;
				for(i=0;i<recs.length;i++){
					var dv = document.createElement('div');
					dv.todoid = recs[i].todoListId; 
					dv.className = '_recdv';
					dv.style.top = top+'px';
					dv.style.left = left+'px';				
					left = left + 290;
					if((i+1)%4==0){
						left = 40;
						top = top + 330;
					}

					var img = document.createElement('img');
					if(recs[i].toDoType.toDoTypeId==1){
						img.src = 'static/images/textnote3.png'; 
					}else{
						img.src = 'static/images/todo3.png'; 
					}
					img.className = '_todorecs';
					dv.appendChild(img);
					var sp = document.createElement('span');
					sp.className = '_rec_ttl';
					var str = recs[i].title;
					var ttl = str.substr(0,12);
					sp.innerHTML = ttl+'...';
					sp.title = str; 
					dv.appendChild(sp);
					
					dv.onclick = getToDo;

					all_recs_box.appendChild(dv);
				}
			}else{
				norecs.style.display = 'block';
			}
		}else{
			window.location = 'showsignin.do';
		}
	}
}

var todoreq;
function getToDo(){
	todoreq = new XMLHttpRequest();
	todoreq.open('get','gettodo.do?todoid='+this.todoid,false);
	todoreq.onreadystatechange = showToDo;
	todoreq.send();	
}

function showToDo(){
	alert(todoreq.readyState+'---'+todoreq.status)
	if(todoreq.readyState==4&&todoreq.status==200){
		alert(todoreq.responseText)
	}
}

var svReq;
function saveTextnote(){
	if(title.value.trim().length!=0){
		svReq = new XMLHttpRequest();

		svReq.open('get', 'save_textnote.do?title='+title.value+'&textnote='+txarea.value+'&todotype_id='+todotype.value, true);
		svReq.onreadystatechange = afterTextNoteSaved;
		svReq.send();
	}else{
		alert('Set Text Note Title...')
	}
}

function afterTextNoteSaved(){
	if(svReq.readyState==4&&svReq.status==200){	
		alert(svReq.responseText)
		if(svReq.responseText=="success"){
			collectAllToDos();		
		}
	}
}

var svReq2;
function saveItemedList(){
	if(title.value.trim().length!=0){
		svReq2 = new XMLHttpRequest();
		
		var i = 1;
		var steps = '';
		while(true){
			var step = document.getElementById('step_'+i);
			
			if(!step){
				break;
			}else{
				if(step.value.trim().length!=0){
					steps = steps + ('&step='+step.value);					
				}
				i++;
			}			
		}

		svReq2.open('get', 'save_itemedlist.do?title='+title.value+'&todotype_id='+todotype.value+steps, true);
		svReq2.onreadystatechange = afterToDoSaved;
		
		//alert('save_itemedlist.do?title='+title.value+'&todotype_id='+todotype.value+steps)
		svReq2.send();
	}else{
		alert('Set Check List Title...!')
	}
}

function afterToDoSaved(){
	alert(svReq2.readyState+'---'+svReq2.status)
	if(svReq2.readyState==4&&svReq2.status==200){
		collectAllToDos();
	}
}

function showNewTextNote(){
	norecs.style.display = 'none';
	all_recs_box.style.display = 'none';
	todo_itemed_list_box.style.display = 'none';
	todo_tnote_box.style.display = 'block';
	txnote_ttl_box.style.display = 'block';
	ttl_arrw.src = 'static/images/textnote3.png';

	todotype.value = 1;	
	
	txarea.autofocus = true;	
}

function showNewItemedList(){
	norecs.style.display = 'none';
	all_recs_box.style.display = 'none';
	todo_tnote_box.style.display = 'none';
	todo_itemed_list_box.style.display = 'block';
	txnote_ttl_box.style.display = 'block';

	for(i=itemed_rec_box.rows.length-1;i>0;i--){
		itemed_rec_box.deleteRow(i);
	}

	rowid = 1;

	_first_rec.innerHTML = '';
	step_1.focus();

	if(this.id=='nw_chklist'){
		var chk = document.createElement('input');
		chk.type = 'checkbox';
		chk.className = 'chk_rec';		
		_first_rec.appendChild(chk);
		todotype.value = 2;	
		ttl_arrw.src = 'static/images/todo3.png';
	}else{
		var sp = document.createElement('span');
		sp.innerHTML = '1.';
		sp.className = '_rec_num';
		_first_rec.appendChild(sp);
		todotype.value = 3;
		ttl_arrw.src = 'static/images/numlist.png';
	}
}
