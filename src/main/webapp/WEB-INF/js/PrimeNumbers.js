var textArea = document.getElementById("textArea");
document.getElementById("submit").addEventListener("click",function(e){
	e.preventDefault();
	var min = document.getElementById("minimum").value;
	var max = document.getElementById("maximum").value;
	console.log(min+" "+max);
	var parameter = "min="+min+"&max="+max;
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange=function (data){
		console.log(this.responseText);
		textArea.textContent = this.responseText;
	};
	xhttp.open("GET","/primeNumber?"+parameter,true);
	xhttp.send();
		
	
});
	



