window.onload=function(){
  var a=document.body.clientHeight;  //取得iframe框架的实际宽度
  alert(a);  //弹出数值测试
  document.getElementById("Frameheight").style.height=a+"px";
}

/*根据传入参数来确定iframe里面应该显示那个界面*/
    	function ChangePage(pageindex){
    		var dom = pageindex;
    		var page =  document.getElementById("rightPage");
    		page.src = dom.id;
    		/*当前点击的变为蓝色，其他变为默认*/
    		var NodesCount = dom.parentElement.parentElement.childElementCount;
    		var Nodes = dom.parentElement.parentElement.children;
    		for(i=0;i<NodesCount;i++){
    			Nodes[i].classList.remove("active");
    		}
    		dom.parentElement.classList.add("active");
    	}