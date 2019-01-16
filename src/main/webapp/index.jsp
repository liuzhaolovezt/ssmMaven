<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>G.net综合信息服务管理平台</title>
<link rel="stylesheet" href="static/css/global.css" type="text/css"/>
<link rel="stylesheet" href="static/css/index.css" type="text/css"/>
<link rel="stylesheet" href="static/css/menu.css" type="text/css"/>
<script type="text/javascript" src="static/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="static/js/kandtabs/kandytabs.pack.js"></script>
<script type="text/javascript" src="static/js/easing.js"></script>
<link rel="stylesheet" href="static/js/kandtabs/kandytabs.css" type="text/css" /> 
 <script src="static/js/autoheight.js" type="text/javascript"></script>
<link href="static/css/lanrenzhijia.css" rel="stylesheet" type="text/css" />
 <script type="text/javascript">
    var tab,index=0;
    $(function() {
		    tab=$("#slide").KandyTabs({
		    del:true,
		    scroll:true,
		    trigger:'click',
		    custom:function(b,c,i){
				$("p",c).fadeOut();
				c.eq(i).find("p").slideDown(1500);
				index=i;
			},
		    done: function(btn,cont,tab){
		    	$("#slide .tabbtn").each(function(i)
		    	{
		    	if($(this).text().indexOf("我的桌面")>-1)//如果当前选项卡是我的桌面
		    	{
				$(this).css({"background":"#027be4","border-bottom":"1px solid #027be4","font-weight":"bold","color":"#ffffff"});//修改选项景色
		        $(this).find('.tabdel').text("");//	去除关闭按钮
		    	}	
		    	});
				setIframeH();//前台设定IFRAME高度 最好在在登录时把高度获取存放到session供其他IFRAME使用
		    }
          });
	});
	
	
</script>
</head>

<body style="overflow: hidden;" scroll="no">
<!-- header -->
<div class="header" region="north" border="true" >
<div class="logo fleft"><img src="static/images/logo.png" width="344" height="49" /></div>
<div class="header_right">
<ul>
  <li><a href="#" onclick="addTab('index.jsp','我的首页');" title="首页" id="home"></a></li>
  <li><a href="#" title="更换皮肤" id="theme"></a></li>
  <li><a href="#" title="设置" id="Setup"></a></li>
  <li><a href="javascript:location.reload();"title="刷新" id="refresh"></a></li>
  <li><a href="#" title="注销登录" id="logout"></a></li>
</ul>
</div>
</div>


 <dl id="slide" >
 <dt>我的桌面</dt>
    <dd><iframe id=centerFrame name="centerFrame" class="centerFrame" frameborder="0" style="width: 100%;height:110px; overflow-x: hidden; overflow-y:auto" noresize="noresize" scrolling="auto" src="center.jsp"></iframe></dd>  
 </dl>

<div id="footer" region="south" border="false" class="cs-south" >
<!-- 菜单 -->
<div class="menu" style="z-index:99999; position:absolute;">
<ul>
<li><a class="hide" href="#"><img src="static/images/menu.jpg" width="66" height="31" /></a>
    <ul  class="category" style="width:321px; background:url(static/images/menu_bg.jpg) repeat-y; padding-top:10px; border:2px solid #0059a5; border-bottom:none;">
    <div class="people blue"><span><img src="static/images/people.jpg" width="29" height="29" /></span><strong>${user}</strong></div>
    <li><a href="#" class="icon_g">个人中心</a>
        <ul style="position:relative; bottom:30px;">
            <li><a href="#" title="修改密码">修改密码</a></li>
        </ul>
    </li>
    <li><a href="#" class="icon_a">公告中心</a>
         <ul style="position:relative; bottom:30px;">
        <%--  href="${pageContext.request.contextPath }/notice/showNotice.action" --%>
            <li><a onclick="parent.addTab('${pageContext.request.contextPath }/notice/showNotice.action','查看公告')"  title="查看公告">查看公告</a></li>
        </ul>
    </li>
    <li><a href="#" class="icon_b">报销</a>
       
        <ul style="position:relative; bottom:30px;">
            <li><a href="#" title="我的单据">我的单据</a></li>
            <li><a href="#" title="我的信息">我的信息</a></li>
            <li><a href="#" title="单据制作">单据制作</a></li>
        </ul>
 
    </li>
    <li><a href="#" class="icon_c">请假</a></li>   
    </li>
    <div class="out_quit"><a href="#" title="注销" class="logout">注销</a><a href="#" title="退出" class="quit">退出</a></div>
    </ul>
</li>
</ul>
</div>
    <!-- -->
    <div class="footer_right"><span class="number">在线人数<strong>999</strong>人</span>
     <a href="#" class="tixing"><img src="static/images/tixing.png" width="16" height="16" /></a>
     <a href="#" class="xiaoxi"><img src="static/images/youjian.png" width="20" height="13" /></a>
     <a href="#" class="liaotian"><img src="static/images/liaotian.png" width="27" height="19" /></a>
    </div>
    <div class="clear"></div>
  </div>
  <div style="text-align:center;">
</div>
</body>
</html>

