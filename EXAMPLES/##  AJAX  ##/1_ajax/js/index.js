window.onload = initAll;

function initAll(){
	var t = document.getElementById('t');

	t.onclick = sendReq;
}

var req;
function sendReq(){
	req = new XMLHttpRequest();
	//alert(req.readyState);

	req.open('get','act.do',true);
	//alert(req.readyState);

	req.onreadystatechange = receiveResp;
	req.send();
}

function receiveResp(){
	alert(req.readyState)
}