<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'LOGIN.jsp' starting page</title>
  </head>
  <body>
    	<h3>方式一：Aciton作为表单模型，提供属性和属性对应的getter方法和setter方法</h3>
    	<form action="${pageContext.request.contextPath}/login1.action" method="post">
    		username:<input type="text" name="name"><br />
    		password:<input type="password" name="passworld"><br />
    		<input type="submit" value="登录">
    	</form>
  </body>
</html>