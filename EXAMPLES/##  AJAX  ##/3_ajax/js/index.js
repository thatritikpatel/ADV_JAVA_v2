window.onload = initAll;

var nm,send;
function initAll(){	
	nm = document.getElementById('name');
	
	send = document.getElementById('send');
	
	send.onclick = sendReq;
}

var req;
function sendReq(){
	req = new XMLHttpRequest();

	req.open('get','act.do?name='+nm.value,true);
	req.onreadystatechange = showResp;
	req.send();
}

function showResp(){
	alert(req.readyState)
	if(req.readyState==4&&req.status==200){
		alert(req.responseText);
	}
}