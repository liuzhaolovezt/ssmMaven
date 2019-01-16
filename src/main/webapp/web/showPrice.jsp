<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询价格</title>
</head>
<script type="text/javascript" src="static/js/jquery.min.js"></script>
<script type="text/javascript">
  //页面完成之后再执行
   $(document).ready(function(){
	   //在表单提交之前，要做验证。监听表单提交事件
	   $("#subForm").submit(function(){
		   var trainnum = $("#trainnum").val();
		   if(trainnum==""){
			   alert("车次不能为空！");
			   //一定要加
			   return false;
		   }
		   
		   var startStation = $("#startStation").val();
		   if(startStation==""){
			   alert("出发地不能为空！");
			   return false;
		   }
		   
		   var endStation = $("#endStation").val();
		   if(endStation==""){
			   alert("目的地不能为空！");
			   return false;
		   }
		   
	   });
   })
</script>
<body>
<center>
	<h1>查询车票价格</h1>
	<form id="subForm" action="getPrice.htm" method="post">
		<table border="1" width="30%" style="text-align:center"> 
					<tr>
						<td>
							车次
						</td>
						
						<td>
							<input id="trainnum" type="text" name="trainnum"/>
						</td>
					</tr>
					<tr>
						<td>
							出发地
						</td>
						
						<td>
							<input id="startStation" type="text" name="startStation"/>
						</td>
					</tr>
					<tr>
						<td>
							目的地
						</td>
						
						<td>
							<input id="endStation" type="text" name="endStation"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="提交"/> 
						</td>	
					</tr>
		</table>
	</form>
</center>
</body>
</html>