var aa;
$(function () {
    var herf=location.search;
    var array = herf.split("=");
    //alert(array[1])
    findOneDataReview(array[1]);
})
function findOneDataReview(id) {
    //alert(id)
    $.ajax({
        type:'post',
        url:'DataReviewController/findOneDataReview',
        data:{"id":id},
        success:function (data) {
            //console.log(date);
            aa=data;
            $("#skeptic").text(aa.followUpId);
            $("#proposalTime").text(aa.proposalTime);
        }
    })
}
function seveDataReview() {
    //alert(aa.patientId);
}
