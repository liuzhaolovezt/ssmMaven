<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>个人信息</title>
    </head>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css" />
    <script src="${pageContext.request.contextPath }/static/js/jquery.js"
	type="text/javascript"></script>
	<script
	src="${pageContext.request.contextPath }/static/js/jquery.min.js"
	type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.js" ></script>
	<script type='text/javascript'> 
	
			//表单验证存储图片字节流
			function toVaild(){
				var imgName = document.getElementById("ph").src;
				alert(imgName);
				document.getElementById("userPho").value =  imgName;
				return true;
			}
	
			//选择图片，马上预览
		    function loadImg(obj) {
		        var file = obj.files[0];
		        var url = getObjectURL(file);
		        //console.log(url);
		        //console.log(file.webkitRelativePath);
		        console.log(obj);
		        console.log(file.name);
		        console.log("file.size = " + file.size);  //file.size 单位为byte
		        if(file.size>1024*1024*1){
		        	alert("图片超过1MB了,请换一张小图片！");
		            return;
		        }

		        var reader = new FileReader();
		
		        //读取文件过程方法
		        reader.onloadstart = function (e) {
		            console.log("开始读取....");
		        }
		        reader.onprogress = function (e) {
		            console.log("正在读取中....");
		        }
		        reader.onabort = function (e) {
		            console.log("中断读取....");
		        }
		        reader.onerror = function (e) {
		            console.log("读取异常....");
		        }
		        reader.onload = function (e) {
		            console.log("成功读取....");
		
		            var img = document.getElementById("ph");
		            img.src = e.target.result;
		            console.log(img.src);
		            //或者 img.src = this.result;  //e.target == this
		        }
		
		        reader.readAsDataURL(file);
		        
		        //
		    }
	
	
		    function getObjectURL(file) 
		    { var url = null;
		    if (window.createObjcectURL != undefined) 
		    { 
		    	url = window.createOjcectURL(file); 
		    } 
		    else if (window.URL != undefined) 
		    { 
		    	url = window.URL.createObjectURL(file); 
		    } 
		    else if (window.webkitURL != undefined)
		    { 
		    	url = window.webkitURL.createObjectURL(file);
		    	} 
		    return url; }

	
            function selectFile(){  
                //触发 文件选择的click事件  
                $("#file").trigger("click");  
  			/* if($("#file").attr("value")!=null || $("#file").attr("value")!=""){
  				$("#ph").attr("src",$("#file").attr("value"));
  			} */
            //其他code如 alert($("#file").attr("value"))  
            }  

    </script>  
	<script type="text/javascript">
	/* window.onload=function(){
	    document.getElementById('exampleasc').value = ${sessionScope["LoginUser"].userPw};
	    alert(document.getElementById('exampleasc').value);
	}; */
	
	
	$(document).ready(function() {
		//alert($('#ph').attr("src"));
		  //alter("${pageContext.request.contextPath}/upLoad/${sessionScope.LoginUserPho}");
		var strId = ${sessionScope["LoginUser"].userId};
		var strUserName = ${sessionScope["LoginUser"].userName};
		var strUserSex = ${sessionScope["LoginUser"].userSex};
		var strUserAge = ${sessionScope["LoginUser"].userAge};
	    var strDeptId = ${sessionScope["LoginUser"].deptId};
		var strJobId = ${sessionScope["LoginUser"].jobId};
		var strUserTel = ${sessionScope["LoginUser"].userTel};
		var strUserPw = ${sessionScope["LoginUser"].userPw};
		var strUserSalary = ${sessionScope["LoginUser"].userSalary};
		var strUserAdd= ${sessionScope["LoginUser"].userAdd};
		/*个人邮箱地址*/
	 	var strUserEml = '<%=session.getAttribute("LoginUserEml")%>';
	 	/*入职日期yyyy-MM-dd  */
	 	var strUserDate = '<%=session.getAttribute("Date")%>';

		$('#userId').attr('value',strId) ;
		$('#userName').attr('value',strUserName) ;
		$('#userSex').attr('value',strUserSex) ;
		$('#userAge').attr('value',strUserAge) ;
		$('#deptId').attr('value',strDeptId) ;
		$('#jobId').attr('value',strJobId) ;
		$('#userTel').attr('value',strUserTel) ;
		$('#userPw').attr('value',strUserPw) ;
		$('#userSalary').attr('value',strUserSalary) ;
		$('#userAdd').attr('value',strUserAdd) ;
	    $('#userEml').attr('value',strUserEml) ;
		$('#userDate').attr('value',strUserDate) ; 
		//------------------type: 'POST',   ------------------
		 $("#upLoad").click(function(){
			 var formData = new FormData();
			 formData.append('file', $('#file')[0].files[0]);
			  htmlobj=$.ajax({
				  url:"${pageContext.request.contextPath}/upLoadImg.action",
				  async:false,
				  type: 'POST',
				  cache: false,
				  data: formData,
				  processData: false,
				  contentType: false,
	              /* success : function(data) {    
	                  //$( '#serverResponse').html(data); 
	                  alter("成功！");
		             },    
		             error : function(data) {    
		              $( '#serverResponse').html(data.status + " : " + data.statusText + " : " + data.responseText);    
		             }  */   
				  });
			  });
	
	});
	</script>
    <body>
    	<div style="width: 70%; height: 60%;margin: 5% auto;">
    		<form class="form-inline" id="submit" action="updateInfo.action" method="post" onsubmit="return toVaild()"> 
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="userid">工&ensp;&ensp;&ensp;&ensp;号:</label>
			    <input type="text" class="form-control" name="userId" id="userId" placeholder="请输入工号" readonly>
			    <%-- <label>${sessionScope["LoginUser"].userPw}</label> --%>
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="username">姓&ensp;&ensp;&ensp;&ensp;名:</label>
			    <input type="text" class="form-control" name="userName" id="userName" placeholder="请输入姓名" >
			  </div>
			
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="userAge">年&ensp;&ensp;&ensp;&ensp;龄:</label>
			    <input type="text" class="form-control" name="userAge" id="userAge" placeholder="请输入年龄">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="userSex">性&ensp;&ensp;&ensp;&ensp;别:</label>
			    <input type="text" class="form-control" name="userSex" id="userSex" placeholder="请输入性别">
			  </div>
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="deptId">部&ensp;&ensp;&ensp;&ensp;门:</label>
			    <input type="text" class="form-control" name="deptId" id="deptId" placeholder="请选择部门" readonly>
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="jobId">职&ensp;&ensp;&ensp;&ensp;位:</label>
			    <input type="text" class="form-control" name="jobId" id="jobId" placeholder="请输入职位" readonly>
			  </div>
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="userTel">电&ensp;&ensp;&ensp;&ensp;话:</label>
			    <input type="text" class="form-control" name="userTel" id="userTel" placeholder="请输入电话">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="userPw">密&ensp;&ensp;&ensp;&ensp;码:</label>
			    <input type="password" class="form-control" name="userPw" id="userPw" placeholder="请输入密码" readonly>
			  </div>
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="userSalary">工&ensp;&ensp;&ensp;&ensp;资:</label>
			    <input type="text" class="form-control" name="userSalary" id="userSalary" placeholder="请输入工资" readonly>
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="userAdd">住&ensp;&ensp;&ensp;&ensp;址:</label>
			    <input type="text" class="form-control" name="userAdd" id="userAdd" placeholder="请输入地址">
			  </div>
			  <div class="form-group" style="margin-top: 10px;">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			    <label for="userDate">入职时间:</label>
			    <input type="text" class="form-control" id="userDate" placeholder="请输入入职时间" > 
			  	 <%-- <fmt:formatDate value="${sessionScope.LoginUserDate}" pattern="yyyy-MM-dd"/>  --%>
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
			  	<label for="userEml">电子邮件:</label>
			    <input type="text" class="form-control" name="userEml" id="userEml" placeholder="请输入邮件地址">
			  </div>
			  
			  <div class="form-group" style="margin-top: 10px;">
			  		<input type="submit" id="submitBtn" value="修    改">
			  </div>
			  
			  <div class="form-group" style="margin-top: -320px;margin-left:120px">
			  	<label>&ensp;&ensp;&ensp;&ensp;</label>
					<div>
						<input type="text" id="userPho" name="userPho" style="filter:alpha(opacity=0);opacity:0;width: 0;height: 0;"/> 
				    	<img alt="个人照片" id="ph" src="${sessionScope.LoginUserPho}" width="71" height="99"/>
				    </div>
				    <input type="file" id="file"  onchange="loadImg(this)" accept="image/*"
	            		style="filter:alpha(opacity=0);opacity:0;width: 0;height: 0;"/> 
				    <input type="button" value = "更换头像" onclick="selectFile()">
				    <!-- <input type="button" id="upLoad" value = "上传头像"> -->
			  </div>
			  
			</form> 
    	</div>
 	</body>
</html>