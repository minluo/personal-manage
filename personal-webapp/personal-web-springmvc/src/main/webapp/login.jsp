<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div class="page secondary" style="margin-top: 100px;">
		<div class="row span12">
			<div class="span12">
				<div class="info-bar bg-color-blue">
					<table border="0">
						<tr>
							<td width="25"><img class="place-left"
								src="<%=basePath%>resources/images/common/logo.png"
								height="70px" /></td>
							<td><span class="element brand" style="font-size: 30px;">咔咔个人管理</span>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="border-color-blue" style="margin-top:117px; background-color: #ccc; height: 300px;">
				<br><br>
				<div class="input-control text span6 as-block" style="margin: auto;">
                     <input type="text" id="username" placeholder="用户名"/>
                     <button class="helper"></button>
                </div>
                <br>
				<div class="input-control text span6 as-block" style="margin: auto;">
                     <input type="password" id="password" placeholder="密码"/>
                     <button class="helper"></button>
                </div>
                <br>
				<div class="input-control text span6 as-block" style="margin: auto;">
    				 <input type="submit" value="登录" id="loginBtu"/>
                </div>
			</div>
		</div>
		<jsp:include page="/views/common/footer.jsp" />
	</div>
	
	<script type="text/javascript">
		
		$(function(){
			$('#loginBtu').click(function(){
				login();
			});
		});
	
		function login() {
			var username = $('#username').val();
			var password = $('#password').val();
			var url = '<%=basePath %>login?username=' + username + '&password=' + password;
			$.post(url, null, function(data){
				var result = data.result;
				if (data.result) {
					document.location.href = '<%=basePath %>views/index.jsp';
				} else {
					alert(data.msg);
				}
			}, 'json');
		}
		
		document.onkeydown = function(event){ 
	        e = event ? event :(window.event ? window.event : null); 
	        if(e.keyCode==13){ 
	        	login();
	        } 
	    }
		
	</script>
	
</body>
</html>