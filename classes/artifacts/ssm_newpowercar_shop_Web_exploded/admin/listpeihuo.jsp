<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎使用后台管理系统</title>
<link href="css/main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/plugins/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="js/plugins/spinner/jquery.mousewheel.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/plugins/charts/excanvas.min.js"></script>
<script type="text/javascript" src="js/plugins/charts/jquery.sparkline.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/uniform.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.cleditor.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.validationEngine-en.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.validationEngine.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/autogrowtextarea.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.maskedinput.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.dualListBox.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.inputlimiter.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/chosen.jquery.min.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.form.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.form.wizard.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html5.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html4.js"></script>
<script type="text/javascript" src="js/plugins/uploader/jquery.plupload.queue.js"></script>
<script type="text/javascript" src="js/plugins/tables/datatable.js"></script>
<script type="text/javascript" src="js/plugins/tables/tablesort.min.js"></script>
<script type="text/javascript" src="js/plugins/tables/resizable.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.tipsy.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.collapsible.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.progress.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.timeentry.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.colorpicker.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.jgrowl.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.breadcrumbs.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.sourcerer.js"></script>
<script type="text/javascript" src="js/plugins/calendar.min.js"></script>
<script type="text/javascript" src="js/plugins/elfinder.min.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<script type="text/javascript" src="js/admin.js" charset="utf-8"></script>
<script type="text/javascript" src="js/selimage.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js" charset="utf-8"></script>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="rightSide">
		<jsp:include page="top.jsp"></jsp:include>
		<div class="line"></div>
		<div class="line"></div>
		<div class="line"></div>
		<div class="line"></div>
		<div class="wrapper">
			<div class="widget">
				<div class="title">
					<img src="images/icons/dark/frames.png" alt="" class="titleIcon" />
					<h6>汽贸中心信息列表</h6>
				</div>
				<table cellpadding="0" cellspacing="0" width="100%" class="sTable">
					<thead>
						<tr>
							<td>汽贸中心名称</td>
							<td>城市</td>
							<td>地址</td>
							<td>联系手机</td>
							<td>备注</td>
							<td>操作</td>
						</tr>
					</thead>
					<c:forEach items="${peihuoList}" var="peihuo">
						<tr align="center">
							<td>${peihuo.peihuoname}</td>
							<td>${peihuo.cityname}</td>
							<td>${peihuo.address}</td>
							<td>${peihuo.contact}</td>
							<td>${peihuo.memo}</td>
							<td><a href="peihuo/getPeihuoById.action?id=${peihuo.peihuoid}">编辑</a>&nbsp;&nbsp;<a
								href="peihuo/deletePeihuo.action?id=${peihuo.peihuoid}"
								onclick="{if(confirm('确定要删除吗?')){return true;}return false;}">删除</a></td>
						</tr>
					</c:forEach>
				</table>
				<div class="dataTables_wrapper">
					<div class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix">
						<div class="dataTables_filter">
							<label><span style="float: left; color: red">${map.msg }</span></label>
						</div>
						<div
							class="dataTables_paginate fg-buttonset ui-buttonset fg-buttonset-multi ui-buttonset-multi paging_full_numbers">
							<span class="toFirst ui-corner-tl ui-corner-bl fg-button ui-button ui-state-disabled">${html }</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</body>
</html>





















































