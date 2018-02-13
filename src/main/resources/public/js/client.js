//this is the browser gets the file from the server.

$(document).ready(function(){
    console.log ("jQuery works!");

    $.ajax({
        type :"GET",
        url : "/harmonyKitties",
        success : function(){
            console.lg("ROUND TRIP!");
        }
    });
    //jquery.ajax();
    //var.scottsObject+{};
    //scottsObject.name= "Scott";
});

console.log ("Totally works!");