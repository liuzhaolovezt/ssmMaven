<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Office</title>
    </head>
    <script type = "text/javascript" src = "${pageContext.request.contextPath}/static/js/login.js">
	</script>
	<script type = "text/javascript" src = "${pageContext.request.contextPath}/static/js/jquery.min.js">
	</script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/login.css" />
    <body>
    	<div id="BigDiv">
    		<div style="height: 30%;
    			width: auto;
    			margin: auto; 
    			position: absolute;
    			top: -5%; left: 42%; 
    			bottom: 0; right: 0;" > 
    			<!--登录主体-->
    			<div class="logintab">
    				<form method="post" action="${pageContext.request.contextPath}/index.action" onsubmit="return toVaild()">
    				<table style="color: white;">
    				<!--账号-->
    				<tr>
    					<td>
    						用户名:
    					</td>
    					<td>
    						<input type="text" id="name" name="name" placeholder="请输入用户名"/>
    					</td>
    					<td>
    						<span></span>
    					</td>
    				</tr>
    				<!--密码-->
    				<tr>
    					<td>
    						密   码:
    					</td>
    					<td>
    						<input type="password" id="psd" name="psd" placeholder="请输入密码"/>
    					</td>
    					<td>
    						<span></span>
    					</td>
    				</tr>
    				<!--验证码-->
    				<tr>
    					<td>
    						验证码:
    					</td>
    					<td>
    						<input type="text" id="inputCode" placeholder="请输入验证码"/>
    					</td>
    					<td>
    						<div id="checkCode" class="code"  onclick="createCode(4)" ></div>
    					</td>
    				</tr>
    				<!--登录按钮和忘记密码-->
    				<tr>
    					<td>
    						<input type="submit" value=" 登 录 " />
    					</td>
    					<td>
    						
    					</td>
    					<td>
    						<input type="button" value="忘记密码" onclick="validateCode()"/>
    					</td>
    				</tr>
    			</table>

    				</form>
    				</div>
    	
    		</div>
    		
    		<!--主页底部-->
    		<footer style="height: auto;width: auto;background: red; margin: auto;  position: absolute; left: 0; bottom: 0; right: 0;">
    			<div class="footer">
    				<p>
    					lz and cx 版权所有 联系电话：181****2612
    				</p>
    			</div>
    		</footer>
    	</div>
 	</body>
</html>