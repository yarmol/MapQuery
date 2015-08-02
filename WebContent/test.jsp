<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>You host is here:</title>
</head>
<body>
	<br>
	
	<%= 2 + 2%><br>
	<%out.println(request.getRemoteHost());%><br>
	<%out.println(request.getSession().getId());%><br>
	<%out.println(session.getCreationTime());%>
	<br><jsp:fallback></jsp:fallback><br>


	
	
	
	</jsp:useBean></html>