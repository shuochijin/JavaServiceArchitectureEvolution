/**
 * 
 */

function ajax(uri, requestType, stateChangeFunction, callBackType, callBackFunction, data, relatedE, callBackparams)
{
	var xmlhttp = null;
	if(window.XMLHttpRequest)
	{
		xmlhttp = new XMLHttpRequest();
	}
	else
	{
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange=function()
	{
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
		{
			alert(xmlhttp.responseText);
			if(callBackFunction != null){
				var o;
				try{
					o = JSON.parse(xmlhttp.responseText);
				}catch(e){
					o = xmlhttp.responseText;
				}
				callBackFunction(relatedE, o, callBackparams);
			}
		}
	}
	xmlhttp.open(requestType,uri,true);
	xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	xmlhttp.send(data);
}