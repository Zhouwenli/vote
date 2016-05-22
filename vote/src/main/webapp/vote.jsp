<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %><!-- 数据的格式化 -->
<base href="/vote/">
<title>参与投票</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>

<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		您好，${loginUser.VU_USER_NAME}
		<span class="return"><a href="Subject!list.action">返回列表</a></span>
		<span class="addnew"><a href="add.jsp">添加新投票</a></span>
		<span class="modify"><a href="Subject!modify.action">维护</a></span>
		
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>

<div id="vote" class="wrap">
	<h2>参与投票</h2>
	<ul class="list">
		<li>
			<h4>${sessionScope.voteBean.VS_TITLE}</h4>
			<p class="info">共有 ${sessionScope.voteBean.optionCount}个选项，已有 ${sessionScope.voteBean.voteUserCount} 个网友参与了投票。</p>
			<label style ="color: red">${sessionScope.saveMsg}</label>
			<c:remove var="saveMag" scope="session"/>
			<form method="post" action="Vote_save.action">
			    <input type="hidden" name="VS_ID" value=" ${sessionScope.voteBean.VS_ID}"/>
			    <input type="hidden" name="VU_USER_ID" value=" ${sessionScope.loginUser.VU_USER_ID}"/> 
				<ol>
					<c:set var="stype" value="${sessionScope.voteBean.VS_TYPE eq 1 ? 'radio' :'checkbox' }"/>
				   <c:forEach items="${sessionScope.voteBean.options }" var="options">
					<li><input type="${stype }" name="VO_ID"  value="${options.VO_ID}"/>${options.VO_OPTION }</li>
				   </c:forEach>
				</ol>
				<p class="voteView"><input type="image" src="images/button_vote.gif" /><a href="Vote!view.action?entityId=103"><img src="images/button_view.gif" /></a></p>
			</form>
		</li>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
