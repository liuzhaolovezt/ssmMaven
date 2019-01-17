<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>OA管理平台</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/global.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/list.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/menu.css"
	type="text/css" />
<script src="${pageContext.request.contextPath }/static/js/fixPNG.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/static/js/jquery.js"
	type="text/javascript"></script>
	
	<script type="text/javascript">
		/**跳转页数**/
		function goToPage(){
			if(confirm("您确定要退出本系统吗？")){
				window.parent.location.href = "exit";
			}
		}
		
		
	</script>

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

					</tr>
					<c:forEach items="${noticeList }" var="item">
						<tr class="line_g hover_bg">
							<td width="5%" align="center"><input type="checkbox"
								name="items_id" value="${item.noticeId}" /></td>
							<td width="5%" align="center">${item.noticeId }</td>
							<td width="6%" align="center"><c:if
									test="${fn:length(item.noticeTitle)<='8'}">
									<a href="${pageContext.request.contextPath }/index.jsp">
										${item.noticeTitle} </a>

								</c:if> <c:if test="${fn:length(item.noticeTitle)>'8'}">
									<a href="#"> ${fn:substring(item.noticeTitle,0,8)}...</a>
								</c:if></td>
							<td width="50%" align="center"><c:if
									test="${fn:length(item.noticeCont)<='50'}">
				                       ${item.noticeCont}
		                       	</c:if> <c:if
									test="${fn:length(item.noticeCont)>'50'}">
					                   ${fn:substring(item.noticeCont,0,50)}...
			                    </c:if></td>
							<td width="10%" align="center">${item.userName }</td>
							<td width="10%" align="center"><fmt:formatDate
									value="${item.noticeTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>

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
									<li>共<strong class="color_red">${ pagerUtil.totalRecord}</strong>条
									</li>
									<c:choose>
										<c:when test="${ pagerUtil.page!=1}">
											<li><a
												href="${pageContext.request.contextPath }/notice/showNotice.action?currentPage=1">首页
											</a></li>
											<li><a
												href="${pageContext.request.contextPath }/notice/showNotice.action?currentPage=${ pagerUtil.page-1}">上一页</a></li>
										</c:when>
										<c:otherwise>
											<li>首页</li>
											<li>上一页</li>
										</c:otherwise>
									</c:choose>
									<li><a href="#">${ pagerUtil.page}</a>/${ pagerUtil.totalPage}</li>
									<c:choose>
										<c:when test="${ pagerUtil.page!=pagerUtil.totalPage}">
											<li><a
												href="${pageContext.request.contextPath }/notice/showNotice.action?currentPage=${pagerUtil.totalPage}">尾页
											</a></li>
											<li><a
												href="${pageContext.request.contextPath }/notice/showNotice.action?currentPage=${ pagerUtil.page+1}">下一页</a></li>
										</c:when>
										<c:otherwise>
											<li>尾页</li>
											<li>下一页</li>
										</c:otherwise>
									</c:choose>
									<li>转到第<input type="text" class="page_numble"  id="currPage"/>页
									</li>
									<li><input type="button" value="" class="go mt7" onclick="goToPage()"/></li>
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

