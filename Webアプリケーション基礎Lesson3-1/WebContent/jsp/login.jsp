<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
response.setHeader("pragma", "no-cache");
response.setHeader("Cache-Control", "no-cache");
%>
<!DOCTYPE html>

<html>
<head>
<title>ログインページ</title>
<link rel="stylesheet" type="text/css" href="/Lesson3-1/css/Lesson3.css">
</head>
<body>
	<form method="post" name="myForm" action="/Lesson3-1/Authentication">
		<h1>ログイン</h1>
		<p></p>
		<div class="center">
		<% if (session.getAttribute("status") == "logout") { %>
			<font color="red">ログインされていません。ログインしてください。</font>
			<%} %>
		</div>
		<table>
			<tr>
				<td>ログインID：</td>
				<td><input type="text" name="id" size="20"></td>
			</tr>
			<tr>
				<td>パスワード：</td>
				<td><input type="password" name="password" size="15"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="ログイン"></td>
			</tr>
		</table>
	</form>
</html>