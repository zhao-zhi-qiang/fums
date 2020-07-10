$(function () {
    selectSymptoms();
    selectByEntity();
})
function aaa(url) {
    $("#iframex").prop("src",url)
}
function selectByEntity() {
    $(".shuyu2").empty();
    var symId=$("#dosage_form_id").val();
    $.ajax({
        url:"selectSymptom",
        data:{
            "symId":symId
        },
        type:"post",
        dataType:"json",
        success:function (result) {
            console.log(symId)
            console.log(result)

            var v="";
            for(var i=0;i<result.length;i++){
                v+='<table class="table table-bordered table-striped">';
                // v+='<tr>';
                v+='<td><input  type="checkbox" name="saw" value="'+result[i].detailsId+'">'+result[i].details+'</td>';
                // v+='</tr>';
                v+='</table>';
            }
            $(".shuyu2").append(v);
        }
    })
}
//症状表内容

function selectSymptoms(){
    $.ajax({
        url:"selectSymptom2",
        data:{
        },
        type:"post",
        dataType:"json",
        success:function (result) {
            $(".detailsinp").empty();
            $(".detailsinp").prepend('<option value="0" >请选择</option>');
            var results=result;
            //临时数组存放
            var hash=[];
            $.each(results,function (index,item) {
                var num=String(item.details).split(",");

                $.each(num,function (index,item2) {

                    if(hash.indexOf(item2)==-1){
                        hash.push(item2);
                    }
                })
            })
            for(var i=0;i<hash.length;i++){

                $(".detailsinp").prepend('<option  value="' + (i+1) + '">' +hash[i] + '</option>')
            }
        }
    })
}
//症状表
$.ajax({
    url:"queryid",
    data:{},
    type:"post",
    dataType:"json",
    success:function (result) {
        $("#dosage_form_id").empty();
        $("#dosage_form_id").prepend('<option value="0" >请选择</option>')
        console.log(result)
        for(var i=0;i<result.length;i++){
            $("#dosage_form_id").prepend('<option value="' + result[i].symId + '">' + result[i].symptoms+ '</option>')
        }
    }
})
function baocun() {
    var importId=[];
    var a=new Array();
    $('input[name="saw"]:checked').each(function () {
        importId.push($(this).val())
    })
    $.ajax({
        url:'selectMoreId',
        data:{
            "importId":importId
        },
        type:"post",
        dataType:"json",
        success:function (result) {
            console.log(result)
            $.each(result,function (index,item) {
                a.push(item);
            })
            document.getElementById('iframex').contentWindow.bu(a);
        }
    })


}