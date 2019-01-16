<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>G.net综合信息服务管理平台</title>
<link rel="stylesheet" href="static/css/global.css" type="text/css" />
<link rel="stylesheet" href="static/css/index.css" type="text/css" />
<link rel="stylesheet" href="static/css/menu.css" type="text/css" />
<script type="text/javascript" src="static/js/jquery-1.8.0.min.js"></script>
<script src="static/js/cfcoda.js" language="javascript"></script>
<script src="static/js/time.js" language="javascript"></script>

<link href="static/css/lanrenzhijia.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<!-- content -->
	<div style="position: relative;">
		<div id="frame">
			<div id="scroller">
				<div id="content">
					<div class="section" id="pane-0">
						<div class="page1">
							<div class="content">
								<div class="first_screen">
									<div class="weather">
										<div class="today">
											<img src="static/images/icon_tianqi.png" width="70"
												height="60" /> <span>31~20°C</span>
										</div>
										<div class="city">
											<a href="#">长沙</a>
										</div>
										<div class="clear"></div>
										<div class="refresh">
											<span class="fleft">更新时间15:30</span><a href="#"
												class="fright">刷新</a>
										</div>
									</div>
									<div class="time">
										<span id="h1"></span> <span id="h2"></span><strong>:</strong>
										<span id="m1"></span> <span id="m2"></span><strong>:</strong>
										<span id="s1"></span> <span id="s2"></span>
									</div>
									<div class="date" id="currentime"></div>
									<div class="welcome_wz">
										<img src="static/images/welcome_wz.png" width="400"
											height="112" />
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="section" id="pane-1" style="display: none">
						<div class="page1">
							<div class="content">
								<div class="second_screen">
									<ul>
										<li><a href="#"
											onclick="parent.addTab('list.html','部门信息')" title="部门信息"><span><img
													src="static/images/icon_1.png" width="56" height="61" /></span>
												<p>部门信息</p> </a></li>
											
										<li><a href="#"
											onclick="parent.addTab('list.html','我申请的单据')" title="我申请的单据"><span><img
													src="static/images/icon_2.png" width="56" height="58" /></span>
												<p>我申请的单据</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','我报销的单据')" title="我报销的单据"><span><img
													src="static/images/icon_3.png" width="64" height="57" /></span>
												<p>我报销的单据</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','待我审批的单据')" title="待我审批的单据"><span><img
													src="static/images/icon_4.png" width="64" height="62" /></span>
												<p>待我审批的单据</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','我审批的单据')" title="我审批的单据"><span><img
													src="static/images/icon_5.png" width="60" height="58" /></span>
												<p>我审批的单据</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','我要撤销的单据')" title="我要撤销的单据"><span><img
													src="static/images/icon_6.png" width="61" height="63" /></span>
												<p>我要撤销的单据</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','报销账户')" title="报销账户"><span><img
													src="static/images/icon_7.png" width="64" height="48" /></span>
												<p>报销账户</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','差旅费事前申请')" title="差旅费事前申请"><span><img
													src="static/images/icon_8.png" width="45" height="60" /></span>
												<p>差旅费事前申请</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','在线填单')" title="在线填单"><span><img
													src="static/images/icon_9.png" width="59" height="60" /></span>
												<p>在线填单</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','单据草稿')" title="单据草稿"><span><img
													src="static/images/icon_10.png" width="63" height="63" /></span>
												<p>单据草稿</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','退单重提')" title="退单重提"><span><img
													src="static/images/icon_11.png" width="52" height="60" /></span>
												<p>退单重提</p> </a></li>
												
										<li><a href="#"
											onclick="parent.addTab('list.html','请假申请')" title="请假申请"><span><img
													src="static/images/icon_12.png" width="60" height="60" /></span>
												<p>请假申请</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','请假明细表')" title="请假明细表"><span><img
													src="static/images/icon_13.png" width="64" height="63" /></span>
												<p>请假明细表</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','待我审批的假条')" title="待我审批的假条"><span><img
													src="static/images/icon_14.png" width="60" height="63" /></span>
												<p>待我审批的假条</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','我审批的假条')" title="我审批的假条"><span><img
													src="static/images/icon_15.png" width="59" height="61" /></span>
												<p>我审批的假条</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','以下为后续新增内容')" title="以下为后续新增内容"><span><img
													src="static/images/icon_16.png" width="54" height="52" /></span>
												<p>以下为后续新增内容</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','以下为后续新增内容')" title="以下为后续新增内容"><span><img
													src="static/images/icon_17.png" width="51" height="57" /></span>
												<p>以下为后续新增内容</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','以下为后续新增内容')" title="以下为后续新增内容"><span><img
													src="static/images/icon_18.png" width="61" height="61" /></span>
												<p>以下为后续新增内容</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','以下为后续新增内容')" title="以下为后续新增内容"><span><img
													src="static/images/icon_19.png" width="52" height="63" /></span>
												<p>以下为后续新增内容</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','以下为后续新增内容')" title="以下为后续新增内容"><span><img
													src="static/images/icon_20.png" width="61" height="60" /></span>
												<p>以下为后续新增内容</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','以下为后续新增内容')" title="以下为后续新增内容"><span><img
													src="static/images/icon_21.png" width="64" height="64" /></span>
												<p>以下为后续新增内容</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','以下为后续新增内容')" title="以下为后续新增内容"><span><img
													src="static/images/icon_22.png" width="60" height="62" /></span>
												<p>以下为后续新增内容</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','以下为后续新增内容')" title="以下为后续新增内容"><span><img
													src="static/images/icon_23.png" width="50" height="60" /></span>
												<p>以下为后续新增内容</p> </a></li>
										<li><a href="#"
											onclick="parent.addTab('list.html','以下为后续新增内容')" title="以下为后续新增内容"><span><img
													src="static/images/icon_24.png" width="50" height="63" /></span>
												<p>以下为后续新增内容</p> </a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="switch">
				<div id="switch-content">
					<ul id="toolbar" class="navigation">
						<li id="tab-0" class="active"><a href="#" id="aaa"
							onclick="javascript:ScrollSection(0, 'scroller', 'home-pane'); return false"></a></li>
						<li id="tab-1" class="inactive"><a href="#"
							onclick="javascript:ScrollSection(1, 'scroller', 'home-pane'); return false"></a></li>
					</ul>
				</div>
			</div>
			<div class="clear"></div>
			<!-- -->
			<div class="main_desktop">
				<ul class="desktop_wrap">
					<li>
						<p>个人信息</p> <a href="#"
						onclick="window.top.addTab('list.html','个人信息');return false;"><img
							src="static/images/icon_2.png" width="56" height="58" /></a>
					</li>
					<li>
						<p>公告</p> <a href="#" onclick="parent.addTab('${pageContext.request.contextPath }/notice/showNotice.action','公告')"><img
							src="static/images/icon_3.png" width="64" height="57" /></a>
					</li>
					<li>
						<p>报销信息</p> <a href="#"
						onclick="parent.addTab('list.html','报销信息')"><img
							src="static/images/icon_4.png" width="64" height="62" /></a>
					</li>
					<li>
						<p>请假信息</p> <a href="#"
						onclick="parent.addTab('list.html','请假信息')"><img
							src="static/images/icon_5.png" width="60" height="58" /></a>
					</li>
					<!--  <li>
        <p>即时提醒</p>
        <a href="#" onclick="parent.addTab('list.html','及时提醒')"><img src="static/images/icon_6.png" width="61" height="63" /></a></li>
   -->
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
