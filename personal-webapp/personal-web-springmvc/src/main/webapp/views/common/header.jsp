<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<div class="span12">
	<div class="nav-bar">
		<div class="nav-bar-inner">
			<a href="<%=basePath%>views/index.jsp"> <span class="element brand">咔咔个人管理</span> </a><span class="divider"></span>
			<ul class="menu">
				<li data-role="dropdown"><a>Item 1</a>
					<ul class="dropdown-menu">
						<li><a href="#">SubItem 1</a>
						</li>
						<li><a href="#">SubItem 2</a>
						</li>
						<li><a href="#">SubItem 3</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">SubItem 4</a>
						</li>
					</ul></li>
				<li><a href="#">Item 2</a>
				</li>
				<li><a href="#">Item 3</a>
				</li>
				<li data-role="dropdown"><a>设置</a>
					<ul class="dropdown-menu">
						<li><a href="<%=basePath%>views/dictionary/index.jsp">数据字典</a>
						</li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
</div>
