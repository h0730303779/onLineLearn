/**
 * sysUserList.jsp的js文件，包括列表查询、排序、增加、修改、删除基础操作
 */
var sysUserList = avalon.define({
    $id: "sysUserList",
    baseFuncInfo: baseFuncInfo//底层基本方法
});
layui.use(['index'], function() {
    //加载layui的模块，index模块是基础模块，也可添加其它
    avalon.ready(function () {
        //所有的入口事件写在这里...

        initSearch(); //初始化搜索框
        getList();  //查询列表
        avalon.scan();
    });
});
/**
 * 初始化搜索框
 */
function initSearch(){
    _initSearch({
        elem: '#sysUserList_search' //指定搜索框表单的元素选择器（推荐id选择器）
        ,filter:'sysUserList_search'  //指定的lay-filter
        ,conds:[
            {field: 'userName', title: '账号',type:'input'}
            ,{field: 'sex', title: '性别',type:'select',data:getSysDictByCode("sys_sex_",true)}
            ,{field: 'identity', title: '身份',type:'select',data:getSysDictByCode("sys_user_type_",true)}
,{field: 'isDelete', title: '状态',type:'select',data:getSysDictByCode("sys_is_delete_",true)}
            // ,{field: 'onlineStatus', title: '在线',type:'input'}
        ]
        ,done:function(filter,data){
            //完成html载入，可进行一些插件方法的初始化事件，或者加载下拉框
            //...
        }
        ,search:function(data){
            //点击搜索返回的事件，用于处理搜索方法;获取搜索条件：data.field
            var field = data.field;
            var table = layui.table; //获取layui的table模块
            //重新刷新table,where:接口的其它参数。如：where: {token: 'sasasas', id: 123}
            table.reload('sysUserList_table',{
                where:field
            });
        }
    });
}
/**
 * 查询列表事件
 */
function getList() {
    var param = {
        "type":$("#ide").val()
    };
    //获取layui的table模块
    var table=layui.table;
    //获取layui的util模块
    var util=layui.util;
    _layuiTable({
        elem: '#sysUserList_table', //必填，指定原始表格元素选择器（推荐id选择器）
        filter:'sysUserList_table', ////必填，指定的lay-filter的名字
        //执行渲染table配置
        render:{
            height:'full-180', //table的高度，页面最大高度减去差值
            url: getRootPath() + "sysUser/list.do", // ajax的url必须加上getRootPath()方法
            where:param, //接口的参数。如：where: {token: 'sasasas', id: 123}
            cols: [[ //表头
                {fixed: 'left',type:'checkbox'}  //开启编辑框
                ,{type: 'numbers', title: '序号',width:60 }  //序号
                ,{field: 'userName', title: '账号'}

                ,{field: 'nickName', title: '昵称'}
                ,{field: 'sex', title: '性别',templet:function (d) {
                        return getSysDictName('sys_sex_',d.sex);
                    }}
                ,{field: 'pictureUrl', title: '头像路径',templet:function (d) {
                        if (isEmpty(d.pictureUrl)){
                            return '无头像';
                        } else {
                            var src = getHttpPath() + d.pictureUrl;
                            var str = '<a class="acursor" onclick="imagesOpen(' + src + ')">查看</a>';
                            return str;
                        }
                    }}
                ,{field: 'remark', title: '备注'}
                ,{field: 'identity', title: '身份',templet:function (d) {
                        return getSysDictName('sys_user_type_',d.identity);
                    }}
                ,{field: 'isDelete', title: '账号状态',templet:function (d) {
                        return getSysDictName('sys_is_delete_',d.isDelete);
                    }}
                // ,{field: 'onlineStatus', title: '在线',sort: true,sortField:'su_.online_status_'}
                ,{field: 'laterTime', title: '最近登录时间',align:'center'
                    ,templet: function(d){
                    return util.toDateString(d.laterTime,"yyyy-MM-dd HH:mm:ss");
                }}
                ,{fixed: 'right',title: '操作',width: 180, align:'center'
                    ,toolbar: '#sysUserList_bar'}
            ]]
        },
        //监听工具条事件
        tool:function(obj,filter){
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            if(layEvent === 'detail'){ //查看
                if(isNotEmpty(data.uid)){
                    saveOrEdit(data.uid,true);
                }
                //do somehing
            } else if(layEvent === 'edit'){ //编辑
                //do something
                if(isNotEmpty(data.uid)){
                    saveOrEdit(data.uid);
                }
            }else if(layEvent === 'del'){ //删除
                layer.confirm('确认删除所选纪录吗？', function(index){
                    // obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                    layer.close(index);
                    //向服务端发送删除指令
                    if(isNotEmpty(data.uid)){
                        var ids=[];
                        ids.push(data.uid);
                        del(ids);
                    }
                });
            }
        }
    });
}

/**
 * 获取单个实体
 */
function saveOrEdit(id,readonly){
    //debugger;
    var url="";
    var title="";
    if(isEmpty(id)){  //id为空,新增操作
        title="新增";
        url=getRootPath()+"user/sysUserAdd";
        //_layerOpen系统弹框统一调用方法，done事件是定义的按钮的执行事件
        _layerOpen({
            url:url,  //弹框自定义的url，会默认采取type=2
            width:750, //弹框自定义的宽度，方法会自动判断是否超过宽度
            height:600,  //弹框自定义的高度，方法会自动判断是否超过高度
            readonly:readonly,  //弹框自定义参数，用于是否只能查看,默认是false，true代表只能查看,done事件不执行
            title:title, //弹框标题
            done:function(index,iframeWin){
                /**
                 * 确定按钮的回调,说明：index是关闭弹框用的，iframeWin是操作子iframe窗口的变量，
                 * 利用iframeWin可以执行弹框的方法，比如save方法
                 */
                var ids = iframeWin.save(
                    //成功保存之后的操作，刷新页面
                    function success() {
                        successToast("保存成功",500);
                        var table = layui.table; //获取layui的table模块
                        table.reload('sysUserList_table'); //重新刷新table
                        layer.close(index); //如果设定了yes回调，需进行手工关闭
                    }
                );
            }
        });
    }else{  //编辑
        title="编辑";
        url=getRootPath()+"user/sysUserEdit?id="+id;
        //_layerOpen系统弹框统一调用方法，done事件是定义的按钮的执行事件
        _layerOpen({
            url:url,  //弹框自定义的url，会默认采取type=2
            width:500, //弹框自定义的宽度，方法会自动判断是否超过宽度
            height:300,  //弹框自定义的高度，方法会自动判断是否超过高度
            readonly:readonly,  //弹框自定义参数，用于是否只能查看,默认是false，true代表只能查看,done事件不执行
            title:title, //弹框标题
            done:function(index,iframeWin){
                /**
                 * 确定按钮的回调,说明：index是关闭弹框用的，iframeWin是操作子iframe窗口的变量，
                 * 利用iframeWin可以执行弹框的方法，比如save方法
                 */
                var ids = iframeWin.save(
                    //成功保存之后的操作，刷新页面
                    function success() {
                        successToast("保存成功",500);
                        var table = layui.table; //获取layui的table模块
                        table.reload('sysUserList_table'); //重新刷新table
                        layer.close(index); //如果设定了yes回调，需进行手工关闭
                    }
                );
            }
        });
    }

}

/**
 * 删除事件
 * @param ids
 */
function del(ids){
    var param={
        "ids":ids
    };
    _ajax({
        type: "POST",
        url: getRootPath()+"sysUser/delete.do",
        data:param,  //必须字符串后台才能接收list,
        //loading:false,  //是否ajax启用等待旋转框，默认是true
        dataType: "json",
        done: function(data){
            successToast("删除成功",500);
            var table = layui.table; //获取layui的table模块
            table.reload('sysUserList_table'); //重新刷新table
        }
    });
}

/**
 * 批量删除
 */
function batchDel(){
    var table = layui.table; //获取layui的table模块
    var checkStatus = table.checkStatus('sysUserList_table'); //test即为基础参数id对应的值
    var data=checkStatus.data; //获取选中行的数据
    if(data.length==0){
        warningToast("请至少选择一条纪录");
        return false;
    }else{
        layer.confirm('确认删除所选纪录吗？', function(index){
            layer.close(index);
            var ids=[];
            $.each(data,function(i,item){
                ids.push(item.uid);
            });
            del(ids);
        });
    }
}
