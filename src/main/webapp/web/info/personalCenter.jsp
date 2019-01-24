<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>个人中心</title>
    </head>
    <script type="text/javascript" src="../../static/js/personalCenter.js" ></script>
    <link rel="stylesheet" href="../../static/css/bootstrap.css" />
    <script type="text/javascript" src="../../static/js/bootstrap.js" ></script>
   
    <body style="background-image:url(../../static/images/login_bg.jpg) ">
    	<div style="width: 20%;height: 80%;margin-left: 2%; margin-top: 3%;">
    		<ul class="nav nav-pills nav-stacked">
			  <li role="presentation" class="active">
			  	<a href="#" onclick="ChangePage(this);" id="personalInfo.jsp">个人信息</a>
			  </li>
			  <li role="presentation" >
			  	<a href="#" onclick="ChangePage(this);" id="updatePassword.jsp">修改密码</a>
			  </li>
			</ul>
    	</div>
 		<div>
 			<iframe scrolling="no" src="personalInfo.jsp" id="rightPage" style="height: 60%;  margin-left: 30%; margin-top: -37%;width: 66%;opacity:0.5;box-shadow:0 0 10px gray;border: 1px azure solid;border-radius: 15px;"></iframe>
 		</div>
    </body>
</html>