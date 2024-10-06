
var connectActions,arrows,recs,srch_bar,userid;
function getAllElements(){
	getAllMenuElements();

	connectActions = document.getElementsByClassName('con_act');
	arrows = document.getElementsByClassName('arw');
	recs = document.getElementById('recs');
	srch_bar = document.getElementById('srch_bar');	
	userid = document.getElementById('userid');	
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
		var resp = conreq.responseText;

		if(resp!='expired'){
			//alert(resp)
			var recs = JSON.parse(resp);
			if(recs.length!=0){
				for(i=0;i<recs.length;i++){
					showSingleRecord(recs[i]);	
				}
			}else{
				
			}
		}else{
			window.location = 'showsignin.do';
		}
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
	
	var pic = document.createElement('img');
	pic.className = 'otherpic';
	
	var nam = document.createElement('span');
	nam.className = 'othernam';

	var crt = document.createElement('span');
	crt.className = 'othercrt';

	var cnt = document.createElement('span');
	cnt.className = 'othercnt';

	var eml = document.createElement('span');
	eml.className = 'othereml';

	var mob = document.createElement('span');
	mob.className = 'othermob';

	var btn = document.createElement('span');
	btn.className = 'red_btn';
	btn.innerHTML = 'Disconnect';
	btn.obj = obj;
	
	var who;
	if(userid.value==obj.fromUser.userId){		
		who = obj.toUser;		
	}else{
		who = obj.fromUser;		
	}

	pic.src = 'otheruserpic.do?email='+who.email+'&profpic='+who.profpic;
	nam.innerHTML = who.userName;
	crt.innerHTML = 'Joined: '+who.created;
	cnt.innerHTML = 'Country: '+who.country.country;
	eml.innerHTML = 'Email: '+who.email;	
	mob.innerHTML = 'Mobile: '+who.mobile;	
		
	dv.appendChild(pic);	
	dv.appendChild(nam);	
	dv.appendChild(crt);	
	dv.appendChild(cnt);	
	dv.appendChild(eml);	
	dv.appendChild(mob);	
	dv.appendChild(btn);	
	
	btn.onclick = function(){
					var res = confirm('Are you sure you want to disconnect...!');
					if(res){
						deleteConnection(this.obj.connectId);
					}
				  };
	
	recs.appendChild(dv);	
}

var relReq;
function deleteConnection(conid){
	relReq = new XMLHttpRequest();
	relReq.open('get','delconnection.do?conid='+conid,false);
	relReq.onreadystatechange = afterDelete;
	relReq.send();
}

function afterDelete(){
	if(relReq.readyState==4&&relReq.status==200){
		var res = relReq.responseText;
		
		if(res=='done'){
			var dv = document.createElement('div');
			dv.className = 'msgbox';
			dv.innerHTML = 'Disconnection Successfull...';

			recs.innerHTML = '';
			recs.appendChild(dv);
		}else{
			window.location = 'showsignin.do';
		}
	}
}