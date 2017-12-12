<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- #section:basics/sidebar -->
			<div id="sidebar" class="sidebar responsive">
				<ul class="nav nav-list">
					<li class="active">
						<a href="#">
							<i class="menu-icon fa fa-desktop"></i>
							<span class="menu-text"> 查看首页 </span>
						</a>

						<b class="arrow"></b>
					</li>
					

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa glyphicon-user fa-paypal"></i>
							<span class="menu-text">
								用户管理
							</span>

							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>
						<ul class="submenu">
							<li class="">
								<a href="<%=request.getContextPath() %>/person/getcurrentperon.do" target="mainFrame">
									<i class="menu-icon fa fa-caret-right"></i>
										用户信息
								</a>
							</li>	
							
						</ul>
												<b class="arrow"></b>
												
					</li>
					
					
					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa glyphicon-user fa-paypal"></i>
							<span class="menu-text">
								打包模块
							</span>

							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>
						<ul class="submenu">
							<li class="">
								<a href="<%=request.getContextPath() %>/packmode/getallpackmode.do" target="mainFrame">
									<i class="menu-icon fa fa-caret-right"></i>
										打包配置方案
								</a>
							</li>	
							
						</ul>
												
					</li>
					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa glyphicon-user fa-paypal"></i>
							<span class="menu-text">
								其他模块
							</span>

							<b class="arrow fa fa-angle-down"></b>
						</a>
						<b class="arrow"></b>
						<ul class="submenu">
							<li class="">
								<a href="<%=request.getContextPath() %>/loginfo/getallloginfo.do" target="mainFrame">
									<i class="menu-icon fa fa-caret-right"></i>
										打包记录
								</a>
							</li>	
							
						</ul>
												
					</li>
				</ul><!-- /.nav-list -->

				<!-- #section:basics/sidebar.layout.minimize -->
				<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
					<i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
				</div>

				<!-- /section:basics/sidebar.layout.minimize -->
				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
				</script>
			</div>