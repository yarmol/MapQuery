<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="15";URL="query/acync">
<title>Insert title here</title>
</head>
<body>
<%@ page import "me.jarad.bean.*" %>
<jsp:useBean  id = "start"  class = "me.jarad.bean.RouteQuery" scope = "session">
<jsp:setProperty name = "start" property = "*"/>
</jsp:useBean>
<h6>Cheсking your data</h6>
</body>
</html>