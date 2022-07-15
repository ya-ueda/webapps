<%-- 
  - Author(s): 上田和
  - Date: 2022/07/08
  - Description: トップ画面
  --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
response.setHeader("pragma", "no-cache");
response.setHeader("Cache-Control", "no-cache");
%>
<!DOCTYPE html>
<html>
<head>
<title>トップページ</title>
<link rel="stylesheet" type="text/css" href="/Lesson2-2/css/Lesson2.css">
</head>
<body>
	<h1>トップ</h1>
	<div>
		ようこそ、ログインID<%=request.getAttribute("id")%>さん
	</div>
	<form method="get" action="/Lesson2-2/Logout">
		<input type="submit" value="ログアウト">
	</form>
</html>
