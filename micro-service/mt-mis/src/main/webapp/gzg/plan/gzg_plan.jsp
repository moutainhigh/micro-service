<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="/base/base.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>配货方案管理</title>
</head>
<body>
<div class="easyui-layout" fit="true" modal="true">
    <!-- 查询 -->
    <div region="north" title="查询条件" border="false" style="height:108px;background:#fafafa;">
        <table id="tableSrarch" align="center">
            <tr height="1px"></tr>
            <!-- 查询条件 -->
            <tr>
                <td>方案名称:</td>
                <td style="width: 250px"><input id="planName" class="easyui-textbox"/></td>

                <td>格子柜类型:</td>
                <td style="width: 250px"><select id="cabinetCategroyId"/></td>

                <td>操作人:</td>
                <td style="width: 250px"><input id="updateName" class="easyui-textbox"/></td>
            </tr>
            <tr style="height: 1px;"></tr>
            <!-- 操作按钮 -->
            <tr>
                <td colspan="6" align="center">
                    <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="loadPlanDatagrid();">查询</a>
                    &nbsp;&nbsp;
                    <a href="#" class="easyui-linkbutton" iconCls="icon-reload" onclick="initPlanDatagridParam();">重置</a>
                    &nbsp;&nbsp;
                    <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd();">新增</a>
                    &nbsp;&nbsp;
                    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit();">修改</a>
                </td>
            </tr>
        </table>
    </div>
    <!-- 表格 -->
    <div region="center" border="false" style="lines:true">
        <table id="planDatagrid"></table>
    </div>
    <!-- 新增弹窗 -->
    <div id="planAddDialog"></div>
    <!-- 修改弹窗 -->
    <div id="planEditDialog"></div>
</div>
<script type="text/javascript" src="/js/gzg/plan/gzg_plan.js?ver=${sv}"></script>
</body>
</html>