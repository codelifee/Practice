<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>HELLO JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%
		int x = 25; 
		out.print(x);
	%>
</body>
</html>