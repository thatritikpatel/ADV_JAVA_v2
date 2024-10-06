window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var lis,page;
function getAllElements(){
	lis = document.getElementsByTagName('li');
	page = document.getElementById('page');
}

var links = new Array('dashborad.do','mytodos.do','connects.do');
function setAllActions(){
	for(i=0;i<lis.length;i++){		
		lis[i].index = i;
		

		if(i!=page.value){
			lis[i].onclick = function(){ window.location = links[this.index] };				
			lis[i].onmouseover = function(){ this.className = 'ulselect'; }
			lis[i].onmouseout = function(){ this.className = 'ulunselect'; }
		}else{
			lis[i].className = 'ulselect';
		}
	}
}