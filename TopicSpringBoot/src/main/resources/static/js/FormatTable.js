/**
 * 
 */
function formatTable(eName, o, params){
	var e = document.getElementById(eName);
	var headArray = o.head;
	var value = o.value;
	
	var tableNode = document.createElement("table");
	createHead(tableNode, headArray);
	createTable(tableNode, value, params);
	
	e.appendChild(tableNode);
	
}

function createHead(tableNode, headArray){
	var headNode = document.createElement("tr");
	
	for(var i = 0; i < headArray.length; ++i){
		var headCol = document.createElement("th");
		var input = document.createElement("input");
		
		input.type = "text";
		input.readOnly = true;
		input.value = headArray[i];
		
		headCol.appendChild(input);
		headNode.appendChild(headCol);
	}
	
	tableNode.appendChild(headNode);
}

function createTable(tableNode, tableArray, params){
	var ids = params[3];
	for(var i = 0; i < tableArray.length; ++ i){
		var tableRow = document.createElement("tr");
		var valueRow = tableArray[i];
		var id;
		
		for(var j = 0; j < valueRow.length; ++ j){
			var tableCol = document.createElement("td");
			var inputH = document.createElement("input");
			var input = document.createElement("input");
			if(j == 0){
				input.readOnly = true;
				id = valueRow[j];
				tableRow.id = id + "tr";
			}
			input.id = ids[j] + "" + id;
			input.type = "text";
			input.value = valueRow[j];
			
			inputH.id = ids[j] + "Hidden" + id;
			inputH.type = "text";
			inputH.value = valueRow[j];
			inputH.style.display = "none";
			
			tableCol.appendChild(input);
			tableCol.appendChild(inputH);
			
			tableRow.appendChild(tableCol);
		}
		var tdButton = document.createElement("td");
		var button = document.createElement("input");
		button.id = id;
		button.type = "button";
		button.value = "update";
		button.onclick = params[0];
		
		var buttonD = document.createElement("input");
		buttonD.id = id + "del";
		buttonD.type = "button";
		buttonD.value = "delete";
		buttonD.onclick = params[1];
		
		var buttonS = document.createElement("input");
		buttonS.id = id;
		buttonS.type = "button";
		buttonS.value = "getDataById";
		buttonS.onclick = params[2];
		
		tdButton.appendChild(button);
		tdButton.appendChild(buttonD);
		tdButton.appendChild(buttonS);
		tableRow.appendChild(tdButton);
		tableNode.appendChild(tableRow);
	}
}