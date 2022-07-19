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
<link rel="stylesheet" type="text/css" href="/Lesson3-1/css/Lesson3.css">
</head>
<body>
	<h1>トップ</h1>
	<div>
		ようこそ、ログインID「<%=session.getAttribute("id")%>」さん
	</div>
	<form method="post" action="/Lesson3-1/ShowItem">
		<input type="submit" value="itemテーブルを見る">
	</form>
	<form method="post" action="/Lesson3-1/ShowItemOrder">
		<input type="submit" value="item_orderテーブルを見る">
	</form>
	<form method="get" action="/Lesson3-1/Logout">
		<input type="submit" value="ログアウト">
	</form>
</html>
