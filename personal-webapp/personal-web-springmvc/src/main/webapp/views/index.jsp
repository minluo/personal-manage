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
		个人工作台
	</div>
</body>
</html>