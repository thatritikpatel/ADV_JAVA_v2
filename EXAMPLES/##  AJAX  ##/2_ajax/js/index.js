window.onload = initAll;


var mobile,send;
function initAll(){
	mobile = document.getElementById('mobile');
	send = document.getElementById('send');

	send.onclick = sendReq;
}


var req;
function sendReq(){
	req = new XMLHttpRequest();

	req.open('get','act.do?contact='+mobile.value,true);
	req.onreadystatechange = processResponse;
	req.send();
}

function processResponse(){
	alert(req.readyState);
	if(req.readyState==4&&req.status==200){
		alert('hello')
	}
}