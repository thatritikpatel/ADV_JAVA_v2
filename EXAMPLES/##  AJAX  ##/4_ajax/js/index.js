window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var state,city;
function getAllElements(){
	state = document.getElementById('state');
	city = document.getElementById('city');
}

function setAllActions(){
	state.onchange = collectCities;
}

var ctreq;
function collectCities(){
	ctreq = new XMLHttpRequest();

	ctreq.open('get','allcities.do?state_id='+state.value,true);
	ctreq.onreadystatechange = showCities;
	ctreq.send();
}

function showCities(){
	if(ctreq.readyState==4&&ctreq.status==200){
		var resp = eval(ctreq.responseText);

		city.innerHTML = '<option value="0">Select</option>';

		for(i=0;i<resp.length;i++){
			var opt = document.createElement('option');
			opt.innerHTML = resp[i].cityName;
			opt.value = resp[i].cityId;
			city.appendChild(opt);
		}	
	}
}