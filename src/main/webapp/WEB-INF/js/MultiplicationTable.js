$(document).ready(function () {
        $.get("/multiplicationJson", function (data) {
                // console.log(data)
                console.log(data.rows.length);
                for (var i = 0; i < data.rows.length; i++) {
                        var row = data.rows[i];
                        var html = "<TR>";
                        for (var j = 0; j < row.length; j++) {
                                html += "<TD>";
                                html += "<SPAN>" + row[j].formula + "<SPAN>";
                                html += "<SPAN";
                                if (row[j].isPrimeNumber == true) {
                                        html += " class='isPrimeNumber' ";
                                }
                                html += ">" + row[j].product + "<SPAN>";
                        }
                        $("table").append(html + "</TR>");
                }



        });

});
