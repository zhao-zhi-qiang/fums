$(function () {
    followUpManagementFenYe(1);
})
function followUpManagementFenYe(pageNum) {
    var formData2 = $("#form2").serialize();
    var list = [];
    $("#list_view input[type=checkbox]").each(function () {
        if ($(this).is(':checked')){
            list.push($(this).val());
        }
    })
    formData2+='&pageNum='+pageNum+'&list='+list;
    //console.log(formData2)
    $.ajax({
        type:'post',
        url:'followUpManagementController/findAllFollowUpManagement',
        data:formData2,
        success:function (data) {
console.log(data);
        }
    })
}