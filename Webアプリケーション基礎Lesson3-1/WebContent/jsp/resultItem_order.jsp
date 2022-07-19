<%-- 
  - Author(s): 中山浩彰
  - Date: 2021/07/05
  - Description: 商品注文履歴一覧表示画面
  --%>

<%@page import="java.util.List"%>
<%@page import="pack.ItemOrderBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品注文履歴一覧</title>
<link rel="stylesheet" type="text/css" href="/Lesson3-1/css/Lesson3.css">

</head>
<body>

	<h1>商品注文履歴一覧</h1>
	<div class="container">
		<div>
			<%
			List<ItemOrderBean> orderList = (List<ItemOrderBean>) request.getAttribute("orderList");
			if (!orderList.isEmpty()) {
			%>
			<table>
				<tr>
					<th>注文番号</th>
					<th>商品番号</th>
					<th>個数</th>
					<th>注文者</th>
					<th>注文日</th>
				</tr>
				<%
				for (ItemOrderBean order : orderList) {
				%>
				<tr>
					<td><%=order.getOrderNum()%></td>
					<td><%=order.getItemNum()%></td>
					<td><%=order.getQuantity()%></td>
					<td><%=order.getStaffNum()%></td>
					<td><%=order.getOrderDate()%></td>
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