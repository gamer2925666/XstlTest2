//var textArea = document.getElementById("textArea");
//document.getElementById("submit").addEventListener("click",function(e){
//	e.preventDefault();
//	var min = document.getElementById("minimum").value;
//	var max = document.getElementById("maximum").value;
//	console.log(min+" "+max);
//	var parameter = "min="+min+"&max="+max;
//	var xhttp = new XMLHttpRequest();
//	xhttp.onreadystatechange=function (data){
//		console.log(this.responseText);
//		textArea.textContent = this.responseText;
//	};
//	xhttp.open("GET","/primeNumber?"+parameter,true);
//	xhttp.send();
//		
//	
//});
$("document").ready(function () {
        $("#submit").click(function (e) {
                e.preventDefault();
                var min = Number($("INPUT[name='minimum']").val());
                var max = Number($("INPUT[name='maximum']").val());
                if (min === 0 || max === 0) {
                        alert("請輸入合法數字!");
                        return;
                }
//                var parameter = "min=" + min + "&max=" + max;
                var parameter = {min: min, max: max};
                $.get("/primeNumber", parameter, function (data, status) {
                        if (status === "success") {
                                $("#textArea").text(data);
                        } else {
                                $("#textArea").text("取得質數錯誤!");
                        }
                });
        });
});









