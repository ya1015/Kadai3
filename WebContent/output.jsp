<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getAttribute("etext") %></br>
<%=request.getAttribute("btext") %></br>
<%=request.getAttribute("stext") %></br>
<a href="RaceServlet?flg=true">clear</a>
</body>
</html>