$(function () {
    findFollowUpGroupAndHospitalDepartment();
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
   /* if (followUpSetdate != null){
        formData2+='&followUpSetdate='+followUpSetdate;
    }*/
    console.log(formData2)
    $.ajax({
        type:'post',
        url:'followUpManagementController/findAllFollowUpManagement',
        data:formData2,
        success:function (data) {
            var result = data.list;
            $("#tbody").empty();
            var a = '';
            for (var i=0;i<result.length;i++){
                a+='<tr>';
                a+='<td>'+result[i].patientUnique+'</td>';
                a+='<td>'+result[i].followUpName+'</td>';
                a+='<td>'+result[i].patientName+'</td>';
                a+='<td>'+result[i].sex+'</td>';
                a+='<td>'+result[i].patientId+'</td>';
                a+='<td>'+result[i].setOfDate+'</td>';
                a+='<td>'+result[i].dateOfNextFollowUp+'</td>';
                switch (result[i].followUpSetdate) {
                    case 0:
                        a+='<td>未随访</td>';
                        break;
                    case 1:
                        a+='<td>已随访</td>';
                        break;
                }
                a+='<td><img class="img " src="img/u167.png"/></td>';
                a+='</tr>';
            }
            $("#tbody").append(a);
console.log(data);
        }
    })
}
function findFollowUpGroupAndHospitalDepartment() {

    $.ajax({
        type: 'post',
        url:'followUpManagementController/findFollowUpGroupAndHospitalDepartment',
        data: {},
        success:function (data) {
            console.log(data);
            var hospitalDepartmentList = data.hospitalDepartmentList;
            var followUpList = data.followUpList;
            $("#followUp").empty();
            var a = '<option value="0">-请选择-</option>';
            for (var i = 0;i<followUpList.length;i++){
                a+='<option value="'+followUpList[i].followUpId+'">'+followUpList[i].followUpName+'</option>';
            }
            $("#followUp").append(a);

            $("#hospitalDepartment").empty();
            var b = '<option value="0">-请选择-</option>'
            for (var j = 0;j<hospitalDepartmentList.length;j++){
                b+='<option value="'+hospitalDepartmentList[j].hospitalDepartmentId+'">'+hospitalDepartmentList[j].hospitalDepartmentName+'</option>'
            }
            $("#hospitalDepartment").append(b);
        }
    })
}
function bian() {
alert(111)
}