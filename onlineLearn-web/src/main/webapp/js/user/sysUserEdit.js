/**
 * sysUserEdit.jsp的js文件，包括查询，编辑操作
 */
var sysUserEdit = avalon.define({
    $id: "sysUserEdit",
    baseFuncInfo: baseFuncInfo//底层基本方法
    , type: function (type) {
        //debugger;
        var arr = sysUserEdit.baseFuncInfo.getSysDictByCode('sys_user_type_');
        var newArr=[];
        $.each(arr,function (i,item) {
            if (type=="1"){

                //if (item.value!=="1"){
                    newArr.push(item);
                //}
            } else if (type=="2") {
                //debugger;
                if (item.value=="3"||item.value=="4"){
                    newArr.push(item);
                }
            }
        });
        //console.log(newArr);
        return newArr;
    }
});

layui.use(['index'], function () {
    //加载layui的模块，index模块是基础模块，也可添加其它
    avalon.ready(function () {
        //所有的入口事件写在这里...
        //初始化表单元素,日期时间选择器
        // var laydate=layui.laydate;
        // laydate.render({
        //     elem: '#laterTime'
        //     ,type: 'date'
        // });
        var id = GetQueryString("id");  //接收变量
        //获取实体信息
        getInfo(id, function (data) {
            //在回调函数中，做其它操作，比如获取下拉列表数据，获取其它信息
            //...
        });
        avalon.scan();
    });
});

/**
 * 获取实体
 * @param id
 * @param $callback 成功验证后的回调函数，
 * 可做其它操作，比如获取下拉列表数据，获取其它信息
 */
function getInfo(id, $callback) {
    if (isEmpty(id)) {
        //新增
        typeof $callback === 'function' && $callback({}); //返回一个回调事件
    } else {
        //编辑
        var param = {
            "uid": id
        };
        _ajax({
            type: "POST",
            //loading:false,  //是否ajax启用等待旋转框，默认是true
            url: getRootPath() + "sysUser/getInfo.do",
            data: param,
            dataType: "json",
            done: function (data) {
                //表单初始赋值
                var form = layui.form; //调用layui的form模块
                //初始化表单元素,日期时间选择器
                var util = layui.util;
                data.laterTime = util.toDateString(data.laterTime, "yyyy-MM-dd");
                form.val('sysUserEdit_form', data);
                typeof $callback === 'function' && $callback(data); //返回一个回调事件
            }
        });
    }
}

/**
 * 验证表单
 * @param $callback 成功验证后的回调函数
 */
function verify_form($callback) {
    //监听提交,先定义个隐藏的按钮
    var form = layui.form; //调用layui的form模块
    form.on('submit(sysUserEdit_submit)', function (data) {
        //通过表单验证后
        var field = data.field; //获取提交的字段
        typeof $callback === 'function' && $callback(field); //返回一个回调事件
    });
    $("#sysUserEdit_submit").trigger('click');
}

/**
 * 关闭弹窗
 * @param $callBack  成功修改后的回调函数，比如可用作于修改后查询列表
 */
function save($callback) {  //菜单保存操作
    //对表单验证
    verify_form(function (field) {
        //成功验证后
        var param = field; //表单的元素
        //可以继续添加需要上传的参数
        _ajax({
            type: "POST",
            //loading:true,  //是否ajax启用等待旋转框，默认是true
            url: getRootPath() + "sysUser/saveOrEdit2.do",
            data: param,
            dataType: "json",
            done: function (data) {
                typeof $callback === 'function' && $callback(data); //返回一个回调事件
            }
        });
    });
}




