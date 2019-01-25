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
<script src="${pageContext.request.contextPath }/static/js/jquery.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/js/artDialog/artDialog.js?skin=default"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/js/fancybox/jquery.fancybox-1.3.4.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/js/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/basic_layout.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/jquery.fancybox-1.3.4.css"
	type="text/css">
	
 <script src="${pageContext.request.contextPath }/bootStrap/bower_components/ckeditor/ckeditor.js"></script>
<script type="text/javascript">
	/**判断字符是否为空的方法**/
	function isEmpty(obj) {
		if (typeof obj == "undefined" || obj == null || obj == "") {
			return true;
		} else {
			return false;
		}
	}
	/*
	 * 关闭
	 */
	function myclose() {
		art.dialog({
			icon:'warning', 
			title:'友情提示', 
			drag:false, 
			resize:false, 
			content:'确定要关闭窗口吗？', 
			ok:function() {parent.$.fancybox.close();},
			cancel:true
			});
	}
	/*
	 *验证表单
	 */
	function validateForm(){
       //1.验证当前工号是否存在   将用户信息存入session
       
       
       return true;
	}
	$(document).ready(function() {
		  // Replace the <textarea id="editor1"> with a CKEditor
	     var editor11=CKEDITOR.replace('noticeCont');
	   /*
		 * 提交
		 */
		$("#submitbutton").click(function() {
			if (validateForm()) {
				 //alert( editor11.document.getBody().getText());//取文本形式的值
			     alert( editor11.document.getBody().getHtml()); //取包含html代码的值
				 $("#submit").submit();
			}
		});
	   
	   
		 var result = "${result}";
			if (result == 'success') {
				art.dialog({
					icon:'succeed', 
					title:'友情提示', 
					drag:false, 
					resize:false, 
					content:'添加成功,是否需要关闭当前窗口？', 
					ok:function() {window.parent.$.fancybox.close();},
					cancel:true
					});
			}else if(result=='false'){
				art.dialog({
					icon:'warning', 
					title:'友情提示', 
					drag:false, 
					resize:false, 
					content:'添加失败,请重新添加', 
					ok: true   //function() {window.parent.$.fancybox.close();},
					//cancel:true
					});
			} 
	});
</script>

</head>

<body>
	<div id="container">
		<div id="nav_links">
			当前位置：公告信息&nbsp;>&nbsp;<span style="color: #1A5CC6;">添加公告</span>
			<div id="page_close">
				<a href="javascript:myclose();"> <img
					src="${pageContext.request.contextPath}/static/images/page_close.png"
					width="20" height="20" style="vertical-align: text-top;" />
				</a>
			</div>
		</div>
		<div class="ui_content">
			<form method="post" id="submit" action="${pageContext.request.contextPath }/notice/addNotice.action">
				<table cellspacing="0" cellpadding="0" width="100%" align="center"
						border="0">
						<tr>
							<td class="ui_text_rt">公告标题：</td>
							<td class="ui_text_lt">
							<input type="text" name="noticeTitle"
								id="noticeTitle" value="${notice.noticeTitle}"
								class="ui_input_txt01" />
								</td>
						</tr>
						<tr>
							<td class="ui_text_rt">公告内容：</td>
							<td class="ui_text_lt">
                            <textarea  placeholder="Place some text here"
                              id="noticeCont" name="noticeCont" rows="10" cols="80">
                              ${notice.noticeCont}
                            </textarea>
						</td>
						</tr>
						
						<tr>
							<td class="ui_text_rt">工号：</td>
							<td class="ui_text_lt"><input type="text" name="userId"
								id="userId" value="${notice.userId }"
								class="ui_input_txt01" /></td>
						</tr>
						<tr>
							<td></td>
							<td class="ui_text_lt">
							&nbsp;
							<input id="submitbutton" type="button" value="提交"  />
							&nbsp;
							<input type="reset" value="重置" onclick="resetForm()" /> 
							&nbsp;
							<input id="cancelbutton" type="button" value="关闭"  onClick="myclose();"/>
						    <span id="content" style="color: red"></span>
							</td>
						</tr>
					</table>
				
			</form>
		</div>
	</div>
</body>
</html>

