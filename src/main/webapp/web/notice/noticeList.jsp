<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>OA管理平台</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/global.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/list.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/menu.css" type="text/css" />
<script src="${pageContext.request.contextPath }/static/js/fixPNG.js" type="text/javascript"></script>

</head>

<body>

	<!-- content -->
	<div class="content">
		<div class="content_box">
			<div class="current">
				<a href="#">个人桌面</a><span> > </span> <a href="#">基础信息</a><span>></span>公告
			</div>
			<div class="infolist">
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td colspan="6" class="title">
							<ul class="zsgc fleft">
								<li><a href="#">新增</a></li>
								<li><a href="#">删除</a></li>
								<li><a href="#">修改</a></li>
								<li><a href="#">编辑</a></li>
							</ul>
							<div class="list_date fright">
								<form name="form" id="form">
									<select name="jumpMenu" id="jumpMenu"
										onchange="MM_jumpMenu('parent',this,0)" class="select">
										<option>全部</option>
										<option>组织机构</option>
									</select>
								</form>
							</div>
						</td>
					</tr>
					<tr class="line_g hover_bg">

						<td width="5%" align="center"><input type="checkbox"
							name="CheckboxGroup1" value="单选框" id="CheckboxGroup1_0" /></td>
						<td width="5%" align="center"><strong>编号</strong></td>
						<td width="6%" align="center"><strong>公告标题</strong></td>
						<td width="50%" align="center"><strong>公告内容</strong></td>
						<td width="10%" align="center"><strong>发布人</strong></td>
						<td width="10%" align="center"><strong>发布时间</strong></td>
						<!-- <td width="8%" align="center"><strong>操作</strong></td> -->
					</tr>
						<c:forEach items="${noticeList }" var="item">
						<tr class="line_g hover_bg">
							 <td  width="5%" align="center"><input type="checkbox" name="items_id"
								value="${item.noticeId}" /></td> 
							<td width="5%" align="center">${item.noticeId }</td>
							<td width="6%" align="center">${item.noticeTitle }</td>
							<td width="50%"  align="center">${item.noticeCont }</td>
							<td  width="10%" align="center">${item.userId }</td>
							<td width="10%" align="center"><fmt:formatDate value="${item.noticeTime}"
									pattern="yyyy-MM-dd HH:mm:ss" /></td>
							
						<%-- 	<td align="center"><a
								href="${pageContext.request.contextPath }/items/editItems.action?id=${item.noticeId}">修改</a></td>
 --%>
						</tr>
					</c:forEach>

					<tr class="title">
						<td colspan="6" valign="middle">
							<ul class="zsgc fleft mt7">
								<li><a href="#">新增</a></li>
								<li><a href="#">删除</a></li>
								<li><a href="#">修改</a></li>
								<li><a href="#">编辑</a></li>
							</ul>
							<div class="page fright">
								<ul>
									<li>共<strong class="color_red">126</strong>条
									</li>
									<li>首页</li>
									<li>上一页</li>
									<li>1/3</li>
									<li><a href="#">下一页</a></li>
									<li><a href="#">尾页</a></li>
									<li>转到第<input type="text" class="page_numble" />页
									</li>
									<li><input type="button" value="" class="go mt7" /></li>
								</ul>
							</div>
						</td>
					</tr>


				</table>
			</div>
		</div>
	</div>
</body>
</html>

