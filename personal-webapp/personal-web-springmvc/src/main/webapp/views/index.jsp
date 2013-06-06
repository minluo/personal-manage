<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/views/common/public-include.jsp" />
<title>咔咔个人管理</title>
</head>
<body class="metrouicss" onload="prettyPrint()">
	
	<div class="page secondary">
		<jsp:include page="/views/common/header.jsp" />
		<div class="row">
               <div class="span12 padding10 fg-color-darken text-center">
               个人工作台
               </div>
            </div>
		<div class="grid">
                <div class="row">
                    <div class="span8">
                        <div class="hero-unit">
                            <div id="carousel1" class="carousel" data-role="carousel" data-param-duration="300">
                                <div class="slides">

                                    <div class="slide" id="slide1">
                                        <h2>现在就创建一个Windows 8风格的网站!</h2>

                                        <p class="bg-color-blueDark padding20 fg-color-white">Metro UI CSS可以快速创建一个Windows 8风格的网站！</p>
                                        <h3>开始吧: 包括 modern.css</h3>
                                        <p class="tertiary-info-text">
                                            &lt;link href="modern.css" rel="stylesheet"&gt;
                                        </p>
                                    </div>

                                    <div class="slide" id="slide2">
                                        <h2 class="fg-color-darken">Metro UI CSS</h2>
                                        <p class="bg-color-pink padding20 fg-color-white">
                                            微软建议开发者创建用户界面，需要<strong>包括:</strong>
                                        </p>

                                        <div class="span3 place-left">
                                            <ul class="unstyled sprite-details">
                                                <li><i class="icon-checkmark"></i> 一般风格</li>
                                                <li><i class="icon-checkmark"></i> 网格和响应式</li>
                                                <li><i class="icon-checkmark"></i> 布局</li>
                                            </ul>
                                        </div>
                                        <div class="span3 place-left">
                                            <ul class="unstyled sprite-details">
                                                <li><i class="icon-checkmark"></i> 排版</li>
                                                <li><i class="icon-checkmark"></i> 很多功能组件</li>
                                                <li><i class="icon-checkmark"></i> 300+图标</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="slide" id="slide3">
                                        <h2>Metro UI CSS 是一个 BizSpark Startup</h2>
                                        <p class="bg-color-red fg-color-white padding20">
                                            Microsoft® BizSpark® 是一个全球性的项目,帮助软件创业公司通过他们获得软件开发工具,帮助他们联系行业的关键技术员,并提供营销能见度。
                                        </p>
                                        <p>现在就<a href="http://bizspark.com">加入</a>BizSpark。</p>
                                    </div>
                                </div>

                                <span class="control left"><i class="icon-arrow-left-3"></i></span>
                                <span class="control right"><i class="icon-arrow-right-3"></i></span>

                            </div>
                        </div>
                    </div>
                    <div class="span4">
                        <div class="span4 padding30 text-center place-left bg-color-blueLight" id="sponsorBlock">
                            <br />
                            <br />
                            <h2 class="">赞助 ?</h2>
                            <p class="">每天有2000+ <a class="" href="http://hit.ua/site_view/19154">用户</a></p>
                            <br />
                            <a href="sponsoring.php"><h1><i class="icon-arrow-right-3 fg-color-red"></i></h1></a>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="grid">
                <div class="row">
                    <div class="span4 bg-color-blue">
                        <img src="<%=basePath %>images/simple.png" class="place-right" style="margin: 10px;"/>
                        <h2 class="fg-color-white">&nbsp;简约</h2>
                    </div>

                    <div class="span4 bg-color-green">
                        <img src="<%=basePath %>images/grid.png" class="place-right" style="margin: 10px;"/>
                        <h2 class="fg-color-white">&nbsp;全面</h2>
                    </div>

                    <div class="span4 bg-color-yellow">
                        <img src="<%=basePath %>images/responsive.png" class="place-right" style="margin: 10px;"/>
                        <h2 class="fg-color-white">&nbsp;响应式</h2>
                    </div>
                </div>
            </div>
            
		<jsp:include page="/views/common/footer.jsp" />
	</div>
</body>
</html>