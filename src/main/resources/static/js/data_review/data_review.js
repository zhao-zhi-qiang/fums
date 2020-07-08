$(function () {
//alert(111)
    fenye(1);
})
function fenye(pageNum) {
    var formData = $("#form1").serialize();
    var list = [];
    $("input[name=reviewState]").each(function () {
        if ($(this).is(':checked')){
            //alert()
            list.push($(this).val());
        }
    })
    console.log(list);
    formData+='&pageNum='+pageNum+'&list='+list;


    console.log(formData);
    $.ajax({
        type:'post',
        url:'DataReviewController/findAllDataReview',
        data:formData,
        success:function (data) {
            $("#tbody").empty();
            var list = data.list;
            var a = '';
            for(var i=0;i<list.length;i++){
                a+='<tr>';
                a+='<td><input onclick="checkOne()" type="checkbox"></td>';
                a+='<td>'+list[i].followUpId+'</td>';
                a+='<td>'+list[i].form+'</td>';
                a+='<td>'+list[i].dataItem+'</td>';
                a+='<td>'+list[i].patient+'</td>';
                a+='<td>'+list[i].value+'</td>';
                a+='<td>'+list[i].skeptic+'</td>';
                a+='<td>'+list[i].review+'</td>';
                switch (list[i].reviewState) {
                    case 0:
                        a+='<td>待复核</td>';
                        break;
                    case 1:
                        a+='<td>已修正</td>';
                        break;
                    case 2:
                        a+='<td>撤回</td>';
                        break;
                }
                a+='<td>'+list[i].reviewDate+'</td>';
                a+='<td><img style="cursor:pointer;" onclick="tiaozhuan('+list[i].id+')" class="img" src="img/u167.png"/></td>';
            }
            $("#tbody").append(a);
            $("#fenye").empty();
            var p = '<li><a id="firstPage" onclick="fenye('+data.firstPage+')"><span>首页</span></a></li><li><a id="prePage" onclick="fenye('+data.prePage+')" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>';
            for (var i=1;i<=data.lastPage;i++){
                p+=' <li><a onclick="fenye('+i+')">'+i+'</a></li>';
            }
            p+='<li><a onclick="fenye('+data.nextPage+')" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li><li><a onclick="fenye('+data.lastPage+')"><span>尾页</span></a></li>';
            $("#fenye").append(p);
            //console.log(data);
        }
        })
}

function qingkong() {
   // alert(111)
    $("#form1")[0].reset();
}
function tiaozhuan(id) {
    window.location.href="checkDetail?id="+id;
}
