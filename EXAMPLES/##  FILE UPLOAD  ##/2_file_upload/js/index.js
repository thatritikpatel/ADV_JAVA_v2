window.onload = initAll;

var tables;
function initAll(){
	tables = document.getElementsByTagName('table');
	//alert(tables[0].rows[0].cells[0])

	var plus = document.getElementById('add');
	plus.onclick = addNewField;
}

var i = 1;
function addNewField(){
	var row = tables[0].insertRow(i);
	var cell = row.insertCell(0);
	var inp = document.createElement('input');
	inp.name = 'file'+i;
	i++;
	inp.type = 'file';
	row.style.height = '50px';
	cell.appendChild(inp);
}