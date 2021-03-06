<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../common/common_css.jsp"%>

<script src="<%=request.getContextPath() %>/resources/js/jquery-1.9.1.js"></script>
<%-- <script src="<%=request.getContextPath() %>/resources/js/jquery.ui.dialog.js"></script>
<script src="<%=request.getContextPath() %>/resources/js/ui/jquery.ui.dialog.js"></script> --%>
<script src="<%=request.getContextPath() %>/resources/js/dialog/jquery-1.4.2.min.js"></script>
<script src="<%=request.getContextPath() %>/resources/js/dialog/jquery.jBox-2.3.min.js"></script>
<script src="<%=request.getContextPath() %>/resources/js/dialog/jquery.jBox-zh-CN.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resources/js/dialog/jbox.css" /> 

<script type="text/javascript">

var timerDict = new Array();

function statusTimerFun(id)
{
  	 var url = '${ctx }/packmode/updatestatus/'+id+".do";
   	 xmlhttp.open("GET", url, true);
     xmlhttp.onreadystatechange = callback_update_status_pack;
     xmlhttp.send(null);
	}
	
function callback_update_status_pack()
{
        if(xmlhttp.readyState == 4) 
        {
            if(xmlhttp.status == 200)
            { 
              // 转换Json数据为javascript对象
              eval("var objResults =" + xmlhttp.responseText);  
              var code=objResults.header.code;
              var message=objResults.header.message;
              var id = objResults.data.id;
              if(code==200)
            	  {
                  var loginfo = objResults.data.loginfo;
                  var issuccess = objResults.data.issuccess;
                  var status = objResults.data.status;
                  
            	  $("#status"+id).text("正在打包，进度:"+loginfo);
                  if(status==2){
           		  if(issuccess == true){
               		  $("#status"+id).text("打包完成");
               		  $("#status"+id).append("<a href=\"<%=request.getContextPath() %>/packmode/download/"+id+".do\"> 点击下载</a>");
                   	  jBox.tip("打包完成"); 
           		  }else{
           			  $("#status"+id).text("打包失败,失败原因:"+loginfo);
           		  }
               	  if(timerDict["timer"+id]!=null){
               		  clearInterval(timerDict["timer"+id]);
               		  timerDict["timer"+id] = null;
               	  }
            	  }
            	  }else
            	  {
            	  jBox.tip(message); 
            	  if(timerDict["timer"+id]!=null){
            		  clearInterval(timerDict["timer"+id]);
            		  timerDict["timer"+id] = null;
            	  }
            	  }
            } 
        }
}
//声明对象实例
var packmodeId = 0;
var xmlhttp = false;
//产生一个XMLHttpRequest对象实例
getHTTPRequestObject();

function getHTTPRequestObject()
{
    try
    {
        xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
    }
    catch(e)
    {
        try
        {
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        catch(E)
        {
            xmlhttp = false;
        }
    }
    if(!xmlhttp && typeof XMLHttpRequest!= 'undefined')
    {
        xmlhttp = new XMLHttpRequest();
    }
}
function callback_delete()
{
        if(xmlhttp.readyState == 4) 
        {
            if(xmlhttp.status == 200)
            { 
              // 转换Json数据为javascript对象
              eval("var objResults =" + xmlhttp.responseText);  
              var code=objResults.header.code;
              var message=objResults.header.message;
              if(code==200)
            	  {
            	  jBox.tip("删除成功");   
            	  window.location.reload();
            	  }
              else
            	  {
            	  jBox.tip(message); 
            	  }
            } 
        }
}


function windowOpen2(url)
{
	var openUrl = "";//弹出窗口的url
	var iWidth=700; //弹出窗口的宽度;
	var iHeight=500; //弹出窗口的高度;
	var iTop = (window.screen.availHeight-30-iHeight)/2; //获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth-10-iWidth)/2; //获得窗口的水平位置;
	 jBox("get:"+url, { title: "打包管理",width: iWidth,height: iHeight,submit: myfunc ,
         buttons: { '关闭': false }}); 
}

function windowOpen(url)
{
	var openUrl = "";//弹出窗口的url
	var iWidth=700; //弹出窗口的宽度;
	var iHeight=500; //弹出窗口的高度;
	var iTop = (window.screen.availHeight-30-iHeight)/2; //获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth-10-iWidth)/2; //获得窗口的水平位置;
	 jBox("get:"+url, { title: "打包管理",width: iWidth,height: iHeight,submit: myfunc ,
         buttons: { '确定': true ,'关闭': false }}); 
}
function windowOpen1(url)
{
	var openUrl = "";//弹出窗口的url
	var iWidth=300; //弹出窗口的宽度;
	var iHeight=150; //弹出窗口的高度;
	var iTop = (window.screen.availHeight-30-iHeight)/2; //获得窗口的垂直位置;
	var iLeft = (window.screen.availWidth-10-iWidth)/2; //获得窗口的水平位置;
	 jBox("iframe:"+url, { title: "上传",width: iWidth,height: iHeight,submit: myfunc ,
         buttons: {}}); 
}
function updateAndPack(id){
	if(timerDict["timer"+id]!=null){
		alert("正在打产品安装包");
		return;
	}
	//windowOpen('${ctx }/packmode/update/'+id+".do")
	window.location.href="<%=request.getContextPath() %>/packmode/update/"+id+".do"
}
/* function del(customerId){	
	if(confirm('确认删除？')){
		windowOpen('${ctx }/carType/delete/'+customerId);
		alert("删除成功");
	}
} */
var myfunc = function (v, h, f) {

    if (v== true ){    //选择清空时，返回false.然后清空。
    	h.find("form").submit();
    	
    }else{
    	window.location.href="<%=request.getContextPath() %>/packmode/getallpackmode.do"
    }

};
var deletesubmit = function (v, h, f) {
    if (v == 'ok')
    {
	   	 var url = '${ctx }/packmode/delete/'+packmodeId+".do";
	   	 xmlhttp.open("GET", url, true);
	     xmlhttp.onreadystatechange = callback_delete;
	     xmlhttp.send(null);
        }
    return true; //close
};

function del(id){
	packmodeId = id;
	jBox.confirm("确定吗？", "确认删除？将删除打包方案的信息", deletesubmit);
		
	}

function addPackMode(){
	windowOpen('${ctx }/packmode/add.do')
}

$(function(){
	if("${errorinfo}"!=""){
		alert("${errorinfo}");
	}
 	
    function stringify(json,space)
   	{
   		if(typeof(space)=='undefined')
   		{
   			return JSON.stringify(json);
   		}
   		else
   		{
   			return JSON.stringify(json,undefined,2);
   		}
   	}
});
function loaded()
{
	if (window.parent && !window.parent.closed) {
		//window.parent.jBox.close();
	}
	
}
function onCardlogochanged(carlogoId)
{
    // retrieve the JSON text from the local file.
    var url = "${ctx }/carType/getCartypeByLogoId/"+carlogoId;
    xmlhttp.open("GET", url, true);
    xmlhttp.onreadystatechange = GetCarTypeByCarLogo;
    xmlhttp.send(null);
}
</script>
<script src="<%=request.getContextPath() %>/resources/jquery.js"></script>
<script src="<%=request.getContextPath() %>/resources/jquery.datetimepicker.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resources/jquery.datetimepicker.css" /> 
<script type="text/javascript">
$(function(){
        $("#startTime").datetimepicker({ format:"Y-m-d",      
            timepicker:false,    //关闭时间选项
            yearEnd:2050,        //设置最大年份 
            lang:'ch',
            });
        $("#endTime").datetimepicker({ format:"Y-m-d",      
            timepicker:false,    //关闭时间选项
            yearEnd:2050,        //设置最大年份 
            lang:'ch',
            });
        //$( "#endTime" ).datepicker( "option", "dateFormat", "yy/mm/dd" });
        
});
</script>
</head>
<body class="no-skin" onload="loaded()">
	<div class="main-content-inner">
		<!-- #section:basics/content.breadcrumbs -->
		<div class="breadcrumbs" id="breadcrumbs">
			<ul class="breadcrumb">
				<li>
					<i class="ace-icon fa fa-home home-icon"></i>
					<a href="#">打包模块</a>
				</li> 
				<li class="active">打包配置方案</li>
			</ul><!-- /.breadcrumb -->			
		</div>
		<div class="page-content">

			系统版本：<input type="text" name="lname" id="lname" style="width:100px" value=""/>&nbsp;&nbsp;	
			架构类型：<input type="text" name="laddress" id="laddress" style="width:100px" value=""/>&nbsp;&nbsp;	
			 <img src="<%=request.getContextPath() %>/resources/upload/chaxun.png" onclick="query()" id="searchButton" width="60" height="35">
	
	    </div>
		<div class="clear"></div>
		<div class="page-content">
			<div class="row">
				<div class="col-xs-12">
					<!-- PAGE CONTENT BEGINS -->
					<div class="row">
						<div class="col-xs-12">
							<table id="sample-table-1" class="table table-striped table-bordered table-hover">
								<thead>
									<tr>
										<!--<th>平台本地路径</th>-->
										<th>是否SVN签出</th>
										<th>SVN地址</th>
										<th>版本</th>
										<th>有效期(天)</th>
										<th>系统版本</th>
										<th>架构</th>
					<!-- 				<th>是否更新秘钥</th>
										<th>是否更新UUID</th> -->
										<th>状态</th>
									</tr>
								</thead>

								<tbody>								
									<c:forEach items="${packmodelist.datas}" var="packmode">
										<tr>
											<!--<td>${packmode.platformLocalPath }</td>-->
											<td id="svncheck${packmode.id}">${packmode.isSvnCheck }</td>
											<td>${packmode.svnNetPath }</td>
											<td id="versionInfo${packmode.id}">${packmode.versionInfo }</td>
											<td>${packmode.indate }</td>
											<td>${packmode.systemVersion }</td>
											<td>${packmode.structureType }</td>
<%-- 										<td id="updatekey${packmode.id}">${packmode.isUpdateKey }</td>
											<td id="updateuuid${packmode.id}">${packmode.isUpdateUuid }</td> --%>
											<td id= "status${packmode.id}">${packmode.status }</td>
											<script type="text/javascript">
											if("${packmode.status}"==0)
											{
												$("#status${packmode.id}").text("可使用");
												if(timerDict["timer${packmode.id}"]!=null){
													clearInterval(timerDict["timer${packmode.id}"]);
													timerDict["timer${packmode.id}"] = null;
												}
											}else if("${packmode.status}"==1){
												$("#status${packmode.id}").text("正在使用");
												if(timerDict["timer${packmode.id}"]==null){
												    var statusTimer = setInterval(function(){statusTimerFun("${packmode.id}")},5000)
												    timerDict["timer${packmode.id}"] = statusTimer;
												}
											}else if("${packmode.status}"==2){
												$("#status${packmode.id}").text("已完成");
												if(timerDict["timer${packmode.id}"]==null){
												    var statusTimer = setInterval(function(){statusTimerFun("${packmode.id}")},5000)
												    timerDict["timer${packmode.id}"] = statusTimer;
												}
											}else if("${packmode.status}"==3){
												$("#status${packmode.id}").text("打包失败");
												if(timerDict["timer${packmode.id}"]!=null){
													clearInterval(timerDict["timer${packmode.id}"]);
													timerDict["timer${packmode.id}"] = null;
												}
											}
											if("${packmode.isSvnCheck}"==1)
											{
												$("#svncheck${packmode.id}").text("是");
											}else{
												$("#svncheck${packmode.id}").text("否");
											}
										 /*if("${packmode.isUpdateUuid}"==1)
											{
												$("#updateuuid${packmode.id}").text("是");
											}else{
												$("#updateuuid${packmode.id}").text("否");
											}
											if("${packmode.isUpdateKey}"==1)
											{
												$("#updatekey${packmode.id}").text("是");
											}else{
												$("#updatekey${packmode.id}").text("否");
											} */
											if("${packmode.versionInfo}"==1)
											{
												$("#versionInfo${packmode.id}").text("正式版");
											}else{
												$("#versionInfo${packmode.id}").text("试用版");
											}
											</script>
												
											<td>																							
										 <a class="btn btn-xs btn-info" onclick="updateAndPack('${packmode.id}')" title="打包">
															<i class="ace-icon fa fa-pencil bigger-120"></i>
													</a>
													
														<a class="btn btn-xs btn-danger" onclick="del('${packmode.id }')" title="删除">
														<i class="ace-icon fa fa-trash-o bigger-120"></i>
													</a>
																						
											</td>		 								
										</tr>
									</c:forEach>
										
								</tbody>
							</table>
							<div class="page-header position-relative">
								<table style="width: 100%;">
									<tbody>
										<tr>
											<td style="vertical-align: top;">
										 <a class="btn btn-info fa" onclick="addPackMode()" title="添加打包配置方案">+</a>  
									
											<a href="<%=request.getContextPath() %>/packmode/getallpackmode.do" style="color:#FFF;text-decoration:none;" class="btn btn-info fa fa-refresh" title="刷新列表"></a>
											</td>
											<td style="vertical-align: top;">
												 <c:if test="${packmodelist.total > 0}">
													<jsp:include page="/pager.jsp">
														<jsp:param value="${packmodelist.total }" name="totalRecord"/>
													</jsp:include>
												</c:if> 
											</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<%@ include file="../common/common_js.jsp"%>

<script src="<%=request.getContextPath() %>/resources/ace/assets/js/jquery.dataTables.js"></script>
<script src="<%=request.getContextPath() %>/resources/ace/assets/js/jquery.dataTables.bootstrap.js"></script>

</body>
</html>