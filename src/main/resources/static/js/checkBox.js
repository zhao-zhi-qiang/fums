function checkAll() {
    if ($("#checkAll").prop("checked")){
        $("#tbody input[type=checkbox]").prop("checked",true);
    }else {
        $("#tbody input[type=checkbox]").prop("checked",false);
    }
}
function checkOne() {
    var bb=false;
    $("#tbody input[type=checkbox]").each(function () {
        if ($(this). prop('checked')){
            bb=true;
        }else {
            bb=false;
            return false;
        }
    })
    if (bb){
        $("#checkAll").prop("checked",true);
    }else {
        $("#checkAll").prop("checked",false);
    }
}