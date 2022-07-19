<%-- 
  - Author(s): 中山浩彰
  - Date: 2021/07/05
  - Description: 商品一覧表示画面
  --%>

<%@page import="java.util.List"%>
<%@page import="pack.ItemBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>取扱商品一覧</title>
<link rel="stylesheet" type="text/css" href="/Lesson3-1/css/Lesson3.css">

</head>
<body>
	<h1>取扱商品一覧</h1>
	<div class="container">
<div>
		<%
		List<ItemBean> itemList = (List<ItemBean>) request.getAttribute("itemList");
		if (!itemList.isEmpty()) {
		%>
		<table>
			<tr>
				<th>商品番号</th>
				<th>商品名</th>
				<th>価格</th>
				<th>商品詳細</th>
			</tr>
			<%
			for (ItemBean item : itemList) {
			%>
			<tr>
				<td><%=item.getItemNum()%></td>
				<td><%=item.getItemName()%></td>
				<td><%=item.getPrice()%></td>
				<td><%=item.getItemDetail()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<%
		} else {
		%>
		<h2>指定されたテーブルにはデータが登録されていません。</h2>
		<%
		}
		%>
		<br>
		<form action="/Lesson3-1/jsp/top.jsp" style="text-align: center;">
			<input type="submit" value="トップページに戻る"class = "btn">
		</form>
		</div>
	</div>

</body>
</html>