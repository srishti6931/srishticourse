<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String un=request.getParameter("t1");
out.println("Name is="+un);
%>
<%
String um=request.getParameter("t2");
out.println("Password is="+um);
%>
<%
String uv=request.getParameter("t3");
out.println("Email is="+uv);
%>
<%
String ur=request.getParameter("t4");
out.println("Mobile no. is="+ur);
%>
</body>
</html>