<%@ page language="java" import="java.util.*"
         contentType="text/html;charset=utf-8" %>
<%@ include file="/WEB-INF/base/adminCommon.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" type="text/css" href="${baseprefix}/layuiadmin/style/admin.css" media="all">
</head>

<body ms-controller="sysUserList" class="adminTop">
<div class="layui-fluid">
    <div class="layui-card">
        <!--搜素栏的div-->
        <div class="layui-form layui-card-header layuiadmin-card-header-auto search-form"
             id="sysUserList_search" lay-filter="sysUserList_search">
        </div>

        <div class="layui-card-body">
            <!--工具栏的按钮的div，注意：需要增加权限控制-->
            <div style="padding-bottom: 10px;" id="sysUserList_tool">
                <button :if="${sessionScope.ollSysUser.identity eq 1}"
                        class="layui-btn"  onclick="batchDel()">删除</button>
                <button :if="${sessionScope.ollSysUser.identity eq 1}"
                        class="layui-btn"  onclick="saveOrEdit()">添加</button>
            </div>
            <input id="ide" type="hidden" value="${sessionScope.ollSysUser.identity}">
            <!--table定义-->
            <table id="sysUserList_table" lay-filter="sysUserList_table"></table>
            <!--table的工具栏按钮定义，注意：需要增加权限控制-->
            <script type="text/html" id="sysUserList_bar">
                <%--<a class="layui-btn layui-btn-xs " lay-event="detail">查看</a>--%>
                <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
                <c:choose>
                    <c:when test="${sessionScope.ollSysUser.identity eq 1}">
                        <a  class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>

                    </c:when>
                </c:choose>
            </script>
        </div>
    </div>
</div>
<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${baseprefix}/js/user/sysUserList.js?t=<%= System.currentTimeMillis()%>"></script>
</body>
</html>