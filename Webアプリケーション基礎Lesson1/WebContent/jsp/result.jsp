<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<title>送信結果</title>
<link rel="stylesheet" type="text/css" href="/Lesson1-1/css/Lesson1.css">
</head>
<body>
	<h1>アンケート結果</h1>
	<h2>基本情報</h2>
	<ul>
		<li>名前：<%=request.getAttribute("name") %>さん
		<li>年齢：<%=request.getAttribute("age") %>歳
		<li>住所：<%=request.getAttribute("address") %>
	</ul>

	<h2>アンケート</h2>
	<ul>
		<li>毎日、朝食を食べていますか？&nbsp;&nbsp;回答：<%=request.getAttribute("q1") %>
		<li>睡眠は6時間以上とっていますか？&nbsp;&nbsp;回答：<%=request.getAttribute("q2") %>
		<li>週に1時間以上運動していますか？&nbsp;&nbsp;回答：<%=request.getAttribute("q3") %>
	</ul>
</html>