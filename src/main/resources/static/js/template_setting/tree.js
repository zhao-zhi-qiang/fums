var v;
var checkedData;
layui.use(['tree', 'util'], function(){
    var tree = layui.tree
        ,layer = layui.layer
        ,util = layui.util

        //模拟数据
        ,data = [{
            title: '基本信息'
            ,id: 1
            ,field: ''
            ,children: [{
                title: '患者唯一标识'
                ,id: 11
                ,field: ''
            },{
                title: '姓名'
                ,id: 12
                ,field: ''
            },{
                title: '性别'
                ,id: 13
                ,field: ''
            },{
                title: '出生地'
                ,id: 14
                ,field: ''
            },{
                title: '文化程度'
                ,id: 15
                ,field: ''
            },{
                title: '移动电话'
                ,id: 16
                ,field: ''
            },{
                title: '电子邮件'
                ,id: 17
                ,field: ''
            },{
                title: 'ABO血型'
                ,id: 18
                ,field: ''
            },{
                title: 'RH血型'
                ,id: 19
                ,field: ''
            },{
                title: '联系人'
                ,id: 20
                ,field: ''
                ,children: [{
                    title: '与患者关系'
                    ,id: 21
                    ,field: ''
                    // ,href: 'https://www.layui.com/doc/'
                },{
                    title: '姓名'
                    ,id: 22
                    ,field: ''
                },{
                    title: '性别'
                    ,id: 23
                    ,field: ''
                },{
                    title: '住址'
                    ,id: 24
                    ,field: ''
                },{
                    title: '电子邮件'
                    ,id: 25
                    ,field: ''
                }]
            },{
                title: '证件'
                ,id: 26
                ,field: ''
                ,children: [{
                    title: '身份证号'
                    ,id: 27
                    ,field: ''
                },{
                    title: '户口薄号'
                    ,id: 28
                    ,field: ''
                },{
                    title: '护照'
                    ,id: 29
                    ,field: ''
                },{
                    title: '军官证号'
                    ,id: 30
                    ,field: ''
                },{
                    title: '驾驶证号'
                    ,id: 31
                    ,field: ''
                },{
                    title: '港澳通行证'
                    ,id: 32
                    ,field: ''
                },{
                    title: '台湾通行证'
                    ,id: 33
                    ,field: ''
                }]
            }]
        },{
            title: '首页信息'
            ,id: 2
            ,field: ''
            ,children: [{
                title: '主要诊断'
                ,id: 41
                ,field: ''
            },{
                title: '门诊诊断'
                ,id: 42
                ,field: ''
            },{
                title: '其他诊断'
                ,id: 43
                ,field: ''
            },{
                title: '入院方式'
                ,id: 44
                ,field: ''
            },{
                title: '入院时间'
                ,id: 45
                ,field: ''
            },{
                title: '入院科室'
                ,id: 46
                ,field: ''
            },{
                title: '入院诊断'
                ,id: 47
                ,field: ''
            },{
                title: '入院医生'
                ,id: 48
                ,field: ''
            },{
                title: '主治医生'
                ,id: 49
                ,field: ''
            },{
                title: '出院时间'
                ,id: 50
                ,field: ''
            },{
                title: '出院科室'
                ,id: 51
                ,field: ''
            },{
                title: '出院状态'
                ,id: 52
                ,field: ''
            },{
                title: '出院诊断'
                ,id: 53
                ,field: ''
            },{
                title: '住院天数'
                ,id: 54
                ,field: ''
            },{
                title: '离院方式'
                ,id: 55
                ,field: ''
            },{
                title: '是否死亡'
                ,id: 56
                ,field: ''
            }]
        },{
            title: '手术信息'
            ,id: 3
            ,field: ''
            ,children: [{
                title: '手术名称'
                ,id: 60
                ,field: ''
            },{
                title: '手术日期'
                ,id: 61
                ,field: ''
            },{
                title: '手术执行科室'
                ,id: 62
                ,field: ''
            },{
                title: '手术开始时间'
                ,id: 63
                ,field: ''
            },{
                title: '手术结束时间'
                ,id: 64
                ,field: ''
            },{
                title: '手术工作量'
                ,id: 65
                ,field: ''
            },{
                title: '手术部位'
                ,id: 66
                ,field: ''
            },{
                title: '麻醉信息'
                ,id: 67
                ,field: ''
                ,children: [{
                    title: '麻醉方式'
                    ,id: 68
                    ,field: ''
                },{
                    title: '麻醉科室'
                    ,id: 69
                    ,field: ''
                },{
                    title: '麻醉准备时间'
                    ,id: 70
                    ,field: ''
                },{
                    title: '麻醉开始时间'
                    ,id: 71
                    ,field: ''
                },{
                    title: '麻醉结束时间'
                    ,id: 72
                    ,field: ''
                },{
                    title: '麻醉工作量'
                    ,id: 73
                    ,field: ''
                }]
            }]
        }]

    //基本演示
    tree.render({
        elem: '#test12'
        ,data: data
        ,showCheckbox: true  //是否显示复选框
        ,id: 'demoId1'
        ,isJump: true //是否允许点击节点时弹出新窗口跳转
        ,click: function(obj){
            var data = obj.data;  //获取当前点击的节点数据
            layer.msg('状态：'+ obj.state + '<br>节点数据：' + JSON.stringify(data));
        }
    });

    function rand(min,max) {
        return Math.floor(Math.random()*(max-min))+min;
    }
    //按钮事件
    util.event('lay-demo', {
        getChecked: function(othis){
            checkedData = tree.getChecked('demoId1'); //获取选中节点的数据
            for (var j = 0; j <checkedData.length; j++) {
                var title2 = checkedData[j].children.length;
                for(var jj = 0; jj <title2; jj++){
                    // var id = checkedData[j].children[jj].id;
                    var title = checkedData[j].children[jj].title;
                    var ss="对应id";
                    var randnum=rand(1000,9999);
                    v+="<tr>";
                    v+='<td style="color: #0E74B4"">'+title +'</td>'
                    v+='<td>'+"<input type='password' id='"+randnum+"' onfocus='cha("+randnum+")'/>"+'</td>';
                    v+='<td style="color: #0E74B4"">'+ss +'</td>'
                    v+='<td>'+"<input  type='text' value='"+randnum+"' />"+'</td>';
                    v+="</tr>";
                }

            }
            // window.parent.document.getElementById('randnum').value=randnum;
           var a = $('#content1', parent.document).append(v);

            // $("#term.window.content1").append(s)
          /*  console.log(checkedData);*/
           // return v;


        }
        ,setChecked: function(){
            tree.setChecked('demoId1', [1,2,3]); //勾选指定节点
        }
        ,reload: function(){
            //重载实例
            tree.reload('demoId1', {

            });

        }
    });
});