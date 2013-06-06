<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
			    <h2>数据字典</h2>
				<a href="javascript:window.history.go(-1);" class="back-button big page-back"></a>
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
    </div>

</body>
</html>