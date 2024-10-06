
var todos_ctrl_box;
var nw_txnote,nw_chklist,nw_numlist;
var todo_box;
var norecs,txarea;
var ttl_edit,samp_ttl,title,sv_txnote,todotype;

function getAllElements(){
	getAllMenuElements();

	todos_ctrl_box = document.getElementById('todos_ctrl_box');

	nw_txnote = document.getElementById('nw_txnote');
	nw_chklist = document.getElementById('nw_chklist');
	nw_numlist = document.getElementById('nw_numlist');	
	
	todo_box = document.getElementById('todo_box');	
	
	norecs = document.getElementById('norecs');	
	txarea = document.getElementById('txarea');	
	
	ttl_edit = document.getElementById('ttl_edit');	
	samp_ttl = document.getElementById('samp_ttl');	
	title = document.getElementById('title');	
	sv_txnote = document.getElementById('sv_txnote');	
	todotype = document.getElementById('todotype');	
}

function setAllActions(){
	setAllMenuActions();

	collectAllToDos();
	
	nw_txnote.onclick = showNewTextNote;

	ttl_edit.onclick = function(){
						ttl_edit.style.display = 'none';
						samp_ttl.style.display = 'none';
						title.style.display = 'inline';
						title.focus();
					   };

	title.onblur = function(){
						ttl_edit.style.display = 'inline';
						samp_ttl.style.display = 'inline';
						samp_ttl.innerHTML = title.value; 
						title.style.display = 'none';						
					};

	sv_txnote.onclick =	saveTextnote;		
}


var alltodoreq;
function collectAllToDos(){
	alltodoreq = new XMLHttpRequest();
	alltodoreq.open('get','alltodos.do',true);
	alltodoreq.onreadystatechange = showAllToDos;
	alltodoreq.send();
}

function showAllToDos(){
	alert(alltodoreq.readyState,alltodoreq.status);
	if(alltodoreq.readyState==4&&alltodoreq.status==200){
		alert(alltodoreq.responseText);
	}
}

var svReq;
function saveTextnote(){
	svReq = new XMLHttpRequest();

	svReq.open('get', 'save_textnote.do?title='+title.value+'&textnote='+txarea.value+'&todotype_id='+todotype.value, true);
	svReq.onreadystatechange = afterTextNoteSaved;
	svReq.send();
}

function afterTextNoteSaved(){
	if(svReq.readyState==4&&svReq.status==200){
		if(svReq.responseText=="success"){
			collectAllToDos();		
		}
	}
}

function showNewTextNote(){
	todotype.value = 1;
	norecs.style.display = 'none';
	todo_box.style.display = 'block';
	txarea.autofocus = true;	
}
