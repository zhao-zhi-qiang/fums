var setting = {
    check: {
        enable: true
    },
    data: {
        simpleData: {
            enable: true
        }
    }
};

var zNodes =[
    { id:1, pId:0, name:"基本信息", open:true},
    { id:101, pId:1, name:"患者唯一标识"},
    { id:102, pId:1, name:"姓名"},
    { id:103, pId:1, name:"性别"},
    { id:104, pId:1, name:"出生日期"},
    { id:105, pId:1, name:"出生地"},
    { id:106, pId:1, name:"文化程度"},
    { id:107, pId:1, name:"移动电话"},
    { id:108, pId:1, name:"电子邮件"},
    { id:109, pId:1, name:"移动电话"},
    { id:120, pId:1, name:"ABO血型"},
    { id:121, pId:1, name:"RH血型"},
    { id:122, pId:1, name:"联系人", open:true},
    { id:1120, pId:122, name:"与患者关系"},
    { id:1121, pId:122, name:"姓名"},
    { id:1122, pId:122, name:"性别"},
    { id:1123, pId:122, name:"住址"},
    { id:1124, pId:122, name:"电子邮件"},
    { id:123, pId:1, name:"证件", open:true},
    { id:1230, pId:123, name:"身份证号"},
    { id:1231, pId:123, name:"户口簿号"},
    { id:1230, pId:123, name:"护照"},
    { id:1231, pId:123, name:"军官证"},
    { id:1230, pId:123, name:"驾驶证"},
    { id:1231, pId:123, name:"户口簿"},
    { id:1230, pId:123, name:"身份证号"},
    { id:1231, pId:123, name:"户口簿号"},
    { id:2, pId : 0,name:"首页信息",open:true},
    { id:201, pId:2, name:"患者唯一标识", open:true},
    { id:202, pId:2, name:"姓名", open:true},
    { id:203, pId:2, name:"性别", open:true},
    { id:204, pId:2, name:"出生日期", open:true},
    { id:205, pId:2, name:"出生地", open:true},
    { id:206, pId:2, name:"文化程度", open:true},
    { id:207, pId:2, name:"移动电话", open:true},
    { id:208, pId:2, name:"电子邮件", open:true},
    { id:209, pId:2, name:"移动电话", open:true},
    { id:210, pId:2, name:"ABO血型", open:true},
    { id:211, pId:2, name:"RH血型", open:true},
    { id:3, pId : 0,name:"手术信息",open:true},
    { id:301, pId:3, name:"手术名称", open:true},
    { id:302, pId:3, name:"手术日期", open:true},
    { id:303, pId:3, name:"手术执行科室", open:true},
    { id:304, pId:3, name:"手术开始时间", open:true},
    { id:305, pId:3, name:"手术结束时间", open:true},
    { id:306, pId:3, name:"手术工作量", open:true},
    { id:307, pId:3, name:"手术部位", open:true},
    { id:308, pId:3, name:"麻醉信息", open:true},
    { id:3080, pId:308, name:"麻醉方式"},
    { id:3081, pId:308, name:"麻醉科室"},
    { id:3082, pId:308, name:"麻醉准备时间"},
    { id:3083, pId:308, name:"麻醉开始时间"},
    { id:3084, pId:308, name:"麻醉结束时间"},
    { id:3085, pId:308, name:"麻醉工作量"}
];
var code;
function setCheck() {
    var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
        py = $("#py").attr("checked")? "p":"",
        sy = $("#sy").attr("checked")? "s":"",
        pn = $("#pn").attr("checked")? "p":"",
        sn = $("#sn").attr("checked")? "s":"",
        type = { "Y":py + sy, "N":pn + sn};
    zTree.setting.check.chkboxType = type;
    showCode('setting.check.chkboxType = { "Y" : "' + type.Y + '", "N" : "' + type.N + '" };');
}
function showCode(str) {
    if (!code) code = $("#code");
    code.empty();
    code.append("<li>"+str+"</li>");
}

$(document).ready(function(){
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
    setCheck();
    $("#py").bind("change", setCheck);
    $("#sy").bind("change", setCheck);
    $("#pn").bind("change", setCheck);
    $("#sn").bind("change", setCheck);
});