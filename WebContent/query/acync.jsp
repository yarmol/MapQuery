<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href ="start.css" rel='stylesheet' type='text/css'>
<title>Async route</title>
</head>
<body>
<h2 style="height: 28px; ">Ruta project 0.0.1<br></h2>
<jsp:useBean id = "route" class = "me.jarad.bean.RouteQuery" scope = "session">
<jsp:setProperty name = "route" property = "*"/>
</jsp:useBean>
<form id = "route" action=question method=Post accept-charset="UTF-8">
<input type=Text name=sourceDescription><br>
<input type=Text name=destinationDesription><br>
<input type=Submit value=send><br>
</form>
</body>
</html>