$(function() {
    $("#asideNav a").bind("click",function(e){
        debugger
        var as = $("#asideNav a");
        if (as){
            for(var i=0;i<as.length;i++){
                as[i].className = "";
            }
        }
        $(this).addClass("active");
    });
});