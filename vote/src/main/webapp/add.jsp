
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布新投票</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript">
var isIE = !!document.all;
function AddOption()
{
	var voteoptions = document.getElementById("voteoptions");
	var _p = document.createElement("p");
	var _input = document.createElement("input");
	_input.type = "text";
	_input.className = "input-text";
	_input.setAttribute("name", "options");
	_p.appendChild(_input);
	var _a = document.createElement("a");
	_a.className = "del";
	_a.setAttribute("href", "javascript:;");
	if(isIE) {
		_a.attachEvent("onclick", DelOption);
	} else {
		_a.addEventListener("click", DelOption, false);
	}
	_a.appendChild(document.createTextNode("删除"));
	_p.appendChild(_a);
	voteoptions.appendChild(_p);
}
function DelOption(e)
{
	if(!e) e = window.event;
	var a = e.srcElement || e.target;
	var obj = a.parentNode;
	obj.parentNode.removeChild(obj);
}
</script>
</head>
<body>


 
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		您好，a
		<span class="return"><a href="Login_seacher.action">返回列表</a></span>
		<span class="addnew"><a href="Subject!read.action">添加新投票</a></span>
		<span class="modify"><a href="Subject!modify.action">维护</a></span>
		
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>

<div id="voteManage" class="box">
	<h2>添加新投票</h2>
	<div class="content">
	<form method="post" action="subject_save.action">
			<dl>
				<dt>投票内容：</dt>
				<dd>
				  
				   <input type="text" class="input-text" name="VS_TITLE"  value=""/>
				</dd>
				<dt>投票类型：</dt>
				<dd>
		  		   <input type="radio" name="VS_TYPE"  checked="checked" value="1" />单选
				   <input type="radio" name="VS_TYPE" value="2" />多选
				</dd>
				<dt>投票选项：</dt>
				
				<dd id="voteoptions">
					<p><input type="text" class="input-text" name="options" /></p>
					<p><input type="text" class="input-text" name="options" /></p>
				</dd>
				
				
				<dt></dt>
				<dd class="button">
					<input type="image" src="images/button_submit.gif" />
					<a href="javascript:;" onclick="AddOption()">增加选项</a>
					<a href="Login_seacher.action">取消操作</a>
				</dd>
			</dl>
		</form>
	</div>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>

