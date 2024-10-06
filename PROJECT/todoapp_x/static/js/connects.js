
var connectActions,arrows;
function getAllElements(){
	getAllMenuElements();

	connectActions = document.getElementsByClassName('con_act');
	arrows = document.getElementsByClassName('arw');

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
}