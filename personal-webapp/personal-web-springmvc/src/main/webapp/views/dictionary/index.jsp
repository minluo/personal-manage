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
<body class="metrouicss">

   <div class="page secondary">
		<jsp:include page="/views/common/header.jsp" />
		<div class="page-header">
			<div class="page-header-content">
			    <h1>数据字典<small><a href="">添加</a></small></h1>
				<a href="javascript:window.history.go(-1);" class="back-button big page-back" title="返回"></a>
			</div>
		</div>

        <div class="page-region">
            <div class="page-region-content">
                <div class="span10">
	                <table class="hovered striped">
	                    <thead>
	                        <tr>
	                            <th>类型</th>
	                            <th>文本</th>
	                            <th>排序</th>
	                        </tr>
	                    </thead>
	                    <tbody>
	                        <tr><td>支出</td><td>家用</td><td>100</td></tr>
	                        <tr><td>支出</td><td>家用</td><td>100</td></tr>
	                        <tr><td>支出</td><td>家用</td><td>100</td></tr>
	                        <tr><td>支出</td><td>家用</td><td>100</td></tr>
	                    </tbody>
	                </table>
            	</div>
            </div>
        </div>
        <jsp:include page="/views/common/footer.jsp" />
    </div>
	
	<script type="text/javascript">
		
		$(function(){
			getData("");
		});
	
		function getData(category) {
			var url = "<%=basePath %>dictionary/findByCategory"
			if (category != "") {
				url += "?category=" + category;
			}
			$.post(url, null, function(data){
				alert(data);
			}, "json");
		}
		
	</script>	
</body>
</html>