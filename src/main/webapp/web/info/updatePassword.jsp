<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改密码</title>
    </head>
    <link rel="stylesheet" href="../../static/css/bootstrap.css" />
    <script type="text/javascript" src="../../static/js/bootstrap.js" ></script>
    <body>
    	<div style="width: 60%; height: 60%;margin:  5% auto;">
    		<form class="form-horizontal">
		  <div class="form-group">
		    <label for="oldPassword" class="col-sm-2 control-label">原密码</label>
		    <div class="col-sm-10">
		      <input type="email" class="form-control" id="oldPassword" placeholder="请输入旧密码">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword1" class="col-sm-2 control-label">新密码</label>
		    <div class="col-sm-10">
		      <input type="password" class="form-control" id="inputPassword1" placeholder="请输入新密码">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword2" class="col-sm-2 control-label">验证密码</label>
		    <div class="col-sm-10">
		      <input type="password" class="form-control" id="inputPassword2" placeholder="再一次输入新密码">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default">确定</button>
		    </div>
		  </div>
		</form>

    	</div>
	 </body>
</html>