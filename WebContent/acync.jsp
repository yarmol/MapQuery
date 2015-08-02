<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Async route</title>
</head>
<body>
<h3 style="height: 28px; ">Map query project utf8<br></h3>Enter points:
<jsp:useBean id = "route" class = "me.jarad.beans.RouteQuery" scope = "session">
<jsp:setProperty name = "route" property = "*"/>
</jsp:useBean>
<form action=acync.jsp method=Post accept-charset="UTF-8">
<input type=Text name=sourceDescription><br>
<input type=Text name=destinationDesription><br>
<input type=Submit value=send><br></form>
</body>

</html>-->