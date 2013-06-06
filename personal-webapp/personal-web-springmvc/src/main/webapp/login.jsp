<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/views/common/public-include.jsp" />
<title>咔咔个人管理</title>
<style>
    body {
       background: #1d1d1d;
    }
</style>
</head>
<body class="metrouicss">

	<div class="page secondary fixed-header">
	    <div class="page-header ">
	        <div class="page-header-content">
	            <div class="user-login">
	                <a href="#">
	                    <div class="name">
	                        <span class="first-name">Sergey</span>
	                        <span class="last-name">Pimenov</span>
	                    </div>
	                    <div class="avatar">
	                        <!--<img src="images/myface.jpg"/>-->
	                        <i class="icon-user fg-color-white"></i>
	                    </div>
	                </a>
	            </div>
	
	            <h1 class="fg-color-white">Start</h1>
	        </div>
	    </div>
	
	    <div class="page-region">
	        <div class="page-region-content tiles">
	            <div class="tile-group tile-drag">
	
	                <a target="_blank" id="qq" href="/" onclick="console.log('clicked')" class="tile image outline-color-green">
	                    <div class="tile-content">
	                        <img src="images/myface.jpg" alt="">
	                    </div>
	                </a>
	
	                <div class="tile icon">
	                    <div class="tile-content">
	                        <img src="images/Mail128.png"/>
	                    </div>
	                    <div class="brand">
	                        <div class="badge">10</div>
	                        <div class="name">Mail</div>
	                    </div>
	                </div>
	
	                <div class="tile bg-color-orangeDark icon">
	                    <b class="check"></b>
	                    <div class="tile-content">
	                        <img src="images/Video128.png" alt="" />
	                    </div>
	                    <div class="brand">
	                        <span class="name">Video</span>
	                    </div>
	                </div>
	
	                <div class="tile double image">
	                    <div class="tile-content">
	                        <img src="images/5.jpg" alt="" />
	                    </div>
	                    <div class="brand">
	                        <span class="name">Pictures</span>
	                        <div class="badge bg-color-orange">5</div>
	                    </div>
	                </div>
	
	                <div class="tile bg-color-green icon">
	                    <div class="tile-content">
	                        <img src="images/Market128.png"/>
	                    </div>
	                    <div class="brand">
	                        <span class="name">Store</span>
	                        <span class="badge">6</span>
	                    </div>
	                </div>
	
	                <div class="tile bg-color-red icon">
	                    <div class="tile-content">
	                        <img src="images/Music128.png" alt="" />
	                    </div>
	                    <div class="brand">
	                        <span class="name">Music</span>
	                    </div>
	                </div>
	
	                <div class="tile double bg-color-blueDark">
	                    <div class="tile-content">
	                        <img src="images/michael.jpg" class="place-left"/>
	                        <h3 style="margin-bottom: 5px;">michael_angiulo</h3>
	                        <p>
	                            I just saw Thor last night. It was awesome! I think you'd love it.
	                        </p>
	                        <h5>RT @julie_green</h5>
	
	                    </div>
	                    <div class="brand">
	                        <span class="name">Tweet@rama</span>
	                    </div>
	                </div>
	
	            </div>
	
	            <div class="tile-group">
	                <div class="tile double image">
	                    <div class="tile-content">
	                        <img src="images/4.jpg" alt="" />
	                    </div>
	                    <div class="brand bg-color-orange">
	                        <img class="icon" src="images/Rss128.png"/>
	                        <p class="text">This is a desert eagle. He is very hungry and angry bird.</p>
	                        <div class="badge">10</div>
	                    </div>
	                </div>
	
	                <div class="tile bg-color-blue icon">
	                    <div class="tile-content">
	                        <img src="images/InternetExplorer128.png"/>
	                    </div>
	                    <div class="brand">
	                        <span class="name">Internet Explorer</span>
	                    </div>
	                </div>
	
	                <div class="tile icon">
	                    <div class="tile-content">
	                        <img src="images/excel2013icon.png"/>
	                    </div>
	                    <div class="brand">
	                        <span class="name">Excel 2013</span>
	                    </div>
	                </div>
	
	                <div class="tile icon">
	                    <div class="tile-content">
	                        <img src="images/word2013icon.png"/>
	                    </div>
	                    <div class="brand">
	                        <span class="name">Word 2013</span>
	                    </div>
	                </div>
	
	            </div>
	
	        </div>
	    </div>
	</div>

</body>
</html>