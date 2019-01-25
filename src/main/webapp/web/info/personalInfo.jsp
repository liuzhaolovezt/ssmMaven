<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>个人信息</title>
    </head>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.js" ></script>
    <script src="${pageContext.request.contextPath }/static/js/jquery.js"
	type="text/javascript"></script>
	<script type="text/javascript">
	/* window.onload=function(){
	    document.getElementById('exampleasc').value = ${sessionScope["LoginUser"].userPw};
	    alert(document.getElementById('exampleasc').value);
	}; */
	$(document).ready(function() {
		var stre = ${sessionScope["LoginUser"].userPw};
		$('#exampleasc').attr('value',stre) ;
	});
	</script>
    <body>
    	<div style="width: 70%; height: 60%;margin: 5% auto;">
    		<form class="form-inline">
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="exampleInputName2">工&ensp;&ensp;&ensp;&ensp;号:</label>
			    <input type="text" class="form-control" id="exampleasc" placeholder="请输入工号" disabled="disabled">
			    <%-- <label>${sessionScope["LoginUser"].userPw}</label> --%>
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="exampleInputEmail2">姓&ensp;&ensp;&ensp;&ensp;名:</label>
			    <input type="text" class="form-control" id="exampleInputEmail2" placeholder="请输入姓名" >
			  </div>
			
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="exampleInputName2">年&ensp;&ensp;&ensp;&ensp;龄:</label>
			    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="exampleInputEmail2">性&ensp;&ensp;&ensp;&ensp;别:</label>
			    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
			  </div>
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="exampleInputName2">部&ensp;&ensp;&ensp;&ensp;门:</label>
			    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="exampleInputEmail2">职&ensp;&ensp;&ensp;&ensp;位:</label>
			    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
			  </div>
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="exampleInputName2">电&ensp;&ensp;&ensp;&ensp;话:</label>
			    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="exampleInputEmail2">密&ensp;&ensp;&ensp;&ensp;码:</label>
			    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
			  </div>
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="exampleInputName2">工&ensp;&ensp;&ensp;&ensp;资:</label>
			    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="exampleInputEmail2">住&ensp;&ensp;&ensp;&ensp;址:</label>
			    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
			  </div>
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="exampleInputName2">电子邮件:</label>
			    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="exampleInputEmail2">入职时间:</label>
			    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
			  </div>
			 
			</form>
    	</div>
 	</body>
</html>