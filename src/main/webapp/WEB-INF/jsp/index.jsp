<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>汽车管理首页</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" type="text/css" />
	<script src="${pageContext.request.contextPath}/static/js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<!-- 头部 -->
<div class="header">
	<div class="width1003">
		<div class="logo">

		</div>
		<div class="topLink">
			<a href="#" class="tl1">联系我们</a>
			<a href="#" class="tl2">投诉建议</a>
			<a href="#" class="tl3">人才招聘</a>
			<p class="phone">服务热线：<strong>854854854</strong></p>
		</div>
		<div class="right">
			<a href="login.jsp" class="login">登录</a>
			<span class="line">|</span>
			<a href="register.jsp" class="register">注册</a>
		</div>
	</div>
</div>
<div class="clearfix"></div>
<!-- 导航条 -->
<div class="nav">
	<ul class="width1003">
		<li><a href="#" class="navCur">首页</a></li>
		<li>
			<a href="#" class="carManger">车务管理</a>
			<div class="childNav">
				<a href="#">车牌代办</a>
				<a href="#">保险代码</a>
				<a href="#">验证代办</a>
				<a href="#">落户代办</a>
			</div>
		</li>
		<li>
			<a href="#">提醒服务</a>
			<div class="childNav">
				<a href="#">活动信息</a>
				<a href="#">添加提醒</a>
				<a href="#">删除提醒</a>
				<a href="#">修改提醒</a>
			</div>
		</li>
		<li>
			<a href="#">旅行服务</a>
			<div class="childNav">
				<a href="#">定制旅行服务</a>
				<a href="#">查看旅行记录</a>
				<a href="#">删除旅行记录</a>
				<a href="#">修改旅行记录</a>
			</div>
		</li>
		<li>
			<a href="#">救援服务</a>
			<div class="childNav">
				<a href="#">呼救记录</a>
				<a href="#">救援情况</a>
				<a href="#">救援车辆管理</a>
			</div>
		</li>
		<li>
			<a href="#">报表图表</a>
			<div class="childNav">
				<a href="#">服务信息</a>
				<a href="#">收费情况</a>
				<a href="#">报表汇总</a>
			</div>
		</li>
	</ul>
</div>
<!-- 轮播图 -->
<div class='avs'>
	<div id='mycarousel' class='carousel slide' data-ride='carousel'>
		<!-- 幻灯片图片 -->
		<div class='carousel-inner'>
			<div class="item active">
				<img src="${pageContext.request.contextPath}/static/images/banner1.jpg" alt="">
			</div>

			<div class="item">
				<img src="${pageContext.request.contextPath}/static/images/banner2.jpg" alt="">
			</div>
			<!-- 指示灯 -->
			<ol class='carousel-indicators'>
				<li data-target='#mycarousel' data-slide-to='0' class='active'></li>
				<li data-target='#mycarousel' data-slide-to='1'></li>
			</ol>
		</div>
	</div>
</div>
<!-- 内容区 -->
<div class="content">
	<div class="width1003">
		<h2 class="title">
			提醒与记录
			<span>/ notice & records</span>
		</h2>
		<div class="notice_info">
			<ul class="info">
				<li>
					<span class="carInfo">到北京市端州区交管所办理新车上牌业务</span>
					<span class="dateTime">2018-6-22</span>
				</li>
				<li>
					<span class="carInfo">到北京市端州区交管所办理新车上牌业务</span>
					<span class="dateTime">2018-6-22</span>
				</li>
				<li>
					<span class="carInfo">到北京市端州区交管所办理新车上牌业务</span>
					<span class="dateTime">2018-6-22</span>
				</li>
				<li>
					<span class="carInfo">到北京市端州区交管所办理新车上牌业务</span>
					<span class="dateTime">2018-6-22</span>
				</li>
				<li>
					<span class="carInfo">到北京市端州区交管所办理新车上牌业务</span>
					<span class="dateTime">2018-6-22</span>
				</li>
				<li>
					<span class="carInfo">到北京市端州区交管所办理新车上牌业务</span>
					<span class="dateTime">2018-6-22</span>
				</li>
			</ul>
		</div>
		<div class="save_info">
			<ul class="info2">
				<li>
					<span class="saveInfo">在xxxxx地方成功救援车辆xxxxx，与员工一起平安归来</span>
					<span class="saveTime">2018-6-22</span>
				</li>
				<li>
					<span class="saveInfo">在xxxxx地方成功救援车辆xxxxx，与员工一起平安归来</span>
					<span class="saveTime">2018-6-22</span>
				</li>
				<li>
					<span class="saveInfo">在xxxxx地方成功救援车辆xxxxx，与员工一起平安归来</span>
					<span class="saveTime">2018-6-22</span>
				</li>
				<li>
					<span class="saveInfo">在xxxxx地方成功救援车辆xxxxx，与员工一起平安归来</span>
					<span class="saveTime">2018-6-22</span>
				</li>
				<li>
					<span class="saveInfo">在xxxxx地方成功救援车辆xxxxx，与员工一起平安归来</span>
					<span class="saveTime">2018-6-22</span>
				</li>
				<li>
					<span class="saveInfo">在xxxxx地方成功救援车辆xxxxx，与员工一起平安归来</span>
					<span class="saveTime">2018-6-22</span>
				</li>
			</ul>
		</div>
	</div>
	<div class="clearfix"></div>
	<div class="width1003">
		<h2 class="title">
			旅游路线
			<span>/ Travel Routes</span>
		</h2>
		<div class="travelRoutes">
			<ul class="routes">
				<li>
					<a href="">清华 -> 云南 -> 广西 -> 西藏 -> 内蒙古</a>
					<span class="servePrice">定制价格:<span class="price" style="color:#f00">1000</span></span>
				</li>
				<li>
					<a href="">清华 -> 云南 -> 广西 -> 西藏 -> 内蒙古</a>
					<span class="servePrice">定制价格:<span class="price">1000</span></span>
				</li>
				<li>
					<a href="">清华 -> 云南 -> 广西 -> 西藏 -> 内蒙古</a>
					<span class="servePrice">定制价格:<span class="price">1000</span></span>
				</li>
				<li>
					<a href="">清华 -> 云南 -> 广西 -> 西藏 -> 内蒙古</a>
					<span class="servePrice">定制价格:<span class="price">1000</span></span>
				</li>
				<li>
					<a href="">清华 -> 云南 -> 广西 -> 西藏 -> 内蒙古</a>
					<span class="servePrice">定制价格:<span class="price">1000</span></span>
				</li>
				<li>
					<a href="">清华 -> 云南 -> 广西 -> 西藏 -> 内蒙古</a>
					<span class="servePrice">定制价格:<span class="price">1000</span></span>
				</li>
			</ul>
		</div>
		<div class='avs'>
			<div id='mycarousel2' class='carousel slide' data-ride='carousel'>
				<!-- 幻灯片图片 -->
				<div class='carousel-inner travel_img'>
					<div class="item active">
						<img src="${pageContext.request.contextPath}/static/images/n1.png" alt="">
					</div>

					<div class="item">
						<img src="${pageContext.request.contextPath}/static/images/n1.png" alt="">
					</div>
					<!-- 指示灯 -->
					<ol class='carousel-indicators'>
						<li data-target='#mycarousel2' data-slide-to='0' class='active'></li>
						<li data-target='#mycarousel2' data-slide-to='1'></li>
					</ol>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="clearfix"></div>
<!-- 底部 -->
<footer>
	<div class="width1003">
		<ul style="margin-left:150px">
			<li class="ft-title">服务大厅</li>
			<li><a href="service.html">新手入门</a></li>
			<li><a href="tousu.html">投诉建议</a></li>
			<li><a href="download.html">帮助中心</a></li>
		</ul>
		<ul>
			<li class="ft-title">新闻公告</li>
			<li><a href="news.html">嘉伟士新闻</a></li>
			<li><a href="news.html">嘉伟士公告</a></li>
			<li><a href="news.html">行业动态</a></li>
			<li><a href="news.html">企业视频</a></li>
			<li><a href="news.html">企业微博</a></li>
		</ul>
		<ul>
			<li class="ft-title">走进嘉伟士</li>
			<li><a href="about.html">嘉伟士简介</a></li>
			<li><a href="about.html">嘉伟士历程</a></li>
			<li><a href="about.html">嘉伟士文化</a></li>
			<li><a href="about.html">嘉伟士品牌</a></li>
			<li><a href="contact.html">联系我们</a></li>
			<li><a href="javascript:;">企业邮箱登陆</a></li>
		</ul>
		<div class="footcontact">
			<h2 class="ft-title">联系我们</h2>
			<div class="fttext">
				咨询热线：854854854、99999999<br />
				总部地址：北京市端州区清华大学主校区5区101<br />
				官方网站：www.xxx.com
			</div>
			<dl>
				<dt><img src="${pageContext.request.contextPath}/static/images/weixin.jpg" width="90" height="91" /></dt>
				<dd>
					公司微信公众号平台，最新资讯，一扫了之！敬请关注!
				</dd>
				<div class="clearfix"></div>
			</dl>
		</div><!--footcontact/-->
		<div class="clearfix"></div>
	</div><!--width1003/-->
</footer>
<div class="copy">
	Copyright © 2018     沪ICP备00000000号    北京市端州区清华大学主校区5区13幢101
</div>
</body>
<script src="../../static/js"></script>
</html>