
var connectActions,arrows,recs,srch_bar;
function getAllElements(){
	getAllMenuElements();

	connectActions = document.getElementsByClassName('con_act');
	arrows = document.getElementsByClassName('arw');
	recs = document.getElementById('recs');
	srch_bar = document.getElementById('srch_bar');

	
}

function setConnectMenu(){
	for(i=0;i<connectActions.length;i++){
		connectActions[i].index = i;
		
		if(i==0){
			connectActions[i].active = true;
			arrows[i].active = true;
		}else{
			connectActions[i].active = false;
			arrows[i].active = false;
		}
		
		connectActions[i].onmouseover = function(){
											if(this.active!=true)
												this.className = 'con_act con_act_ov';

											for(i=0;i<arrows.length;i++){
												if(!arrows[i].active)
													arrows[i].style.visibility = 'hidden';
											}

											arrows[this.index].style.visibility = 'visible';
										};

		connectActions[i].onmouseout  = function(){
											if(this.active!=true)
												this.className = 'con_act con_act_ot';

											for(i=0;i<arrows.length;i++){
												if(!arrows[i].active)
													arrows[i].style.visibility = 'hidden';
											}
										};

		connectActions[i].onclick = function(){
		
			//####################################################
		
		}
	}
}

function setAllActions(){
	setAllMenuActions();

	setConnectMenu();

	getAllConnects();
}

var conreq;
function getAllConnects(){
	conreq = new XMLHttpRequest();
	conreq.open('get','allconnections.do',true);
	conreq.onreadystatechange = showConnects;
	conreq.send();
}

function showConnects(){
	if(conreq.readyState==4&&conreq.status==200){
		alert(conreq.responseText)
	}
}


var top_val = 20;
var count = 0;
function showSingleRecord(obj){
	var dv = document.createElement('div');
	dv.style.top = top_val+'px';
	count++;
	if(count%2==0){
		top_val += 140;
		dv.className = 'rec_ rec_rht';
	}else{
		dv.className = 'rec_ rec_lft';
	}	
	
	recs.appendChild(dv);	
}