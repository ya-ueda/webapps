<%-- 
  - Author(s): 上田和
  - Date: 2022/07/08
  - Description: ログイン画面
  --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<title>ログインページ</title>
<link rel="stylesheet" type="text/css" href="/Lesson2-2/css/Lesson2.css">
</head>
<body>
	<form method="post" name="myForm" action="/Lesson2-2/Authentication">
		<h1>ログイン</h1>
		<p></p>
		<div class="center">
			<font color="red">ログインされていません。ログインしてください。aaaaaaaaaa</font>
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