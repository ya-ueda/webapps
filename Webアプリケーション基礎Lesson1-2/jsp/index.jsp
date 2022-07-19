<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<title>送信ページ</title>
<link rel="stylesheet" type="text/css" href="/Lesson1-2/css/Lesson1.css">
</head>
<body>
	<form method="post" action="/Lesson1-2/Servlet">
		<h1>アンケート内容の送信</h1>
		<h2>基本情報</h2>
		<ul>
			<li>名前：<input type="text" name="name" size="20"></li>
			<li>年齢：<input type="text" name="age" size="3"></li>
			<li>住所：
				<select name="address">
					<option>東京都</option>
					<option>神奈川県</option>
					<option>埼玉県</option>
					<option>千葉県</option>
					<option>茨城県</option>
					<option>愛媛県</option>
				</select>
			</li>
		</ul>

		<h2>アンケート</h2>
		<ul>
			<li>毎日、朝食を食べていますか？&nbsp;
				<input type="radio" name="q1" value="はい">はい
				<input type="radio" name="q1" value="いいえ">いいえ
			<li>睡眠は6時間以上とっていますか？&nbsp;
				<input type="radio" name="q2" value="はい">はい
				<input type="radio" name="q2" value="いいえ">いいえ
			<li>週に1時間以上運動していますか？&nbsp;
				<input type="radio" name="q3" value="はい">はい
				<input type="radio" name="q3" value="いいえ">いいえ
		</ul>
		<input type="submit" value="アンケート送信">
	</form>
</html>