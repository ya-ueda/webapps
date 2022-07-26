package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * item_orderテーブルのDAO
 * @author 上田和
 *
 */
public class ItemOrderDAO {
	/**
	 * 全ての商品注文データを返す。
	 * @return データベースに登録されている商品注文データのリスト
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<ItemOrderBean> selectAll() throws SQLException, ClassNotFoundException {
		List<ItemOrderBean> orderList = new ArrayList<>();

		// データベースへ接続し、SQL文の実行
		Connection connection = null;
		Statement statement = null;
		ResultSet res = null;

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		//-----------------
		// 接続
		//-----------------
		connection = DriverManager.getConnection("jdbc:postgresql://webapp3-ueda.cncasnoxwaem.ap-northeast-1.rds.amazonaws.com:5432/postgres", // "jdbc:postgresql://[場所(Domain)]:[ポート番号]/[DB名]"
				"postgres", // ログインロール
				"postgres"); // パスワード

		statement = connection.createStatement();

		//-----------------
		// SQLの発行
		//-----------------
		res = statement.executeQuery("SELECT * FROM item_order ORDER BY order_no");

		// 1レコードずつリストに追加
		while (res.next()) {
			int orderNum = res.getInt("order_no");
			String itemNum = res.getString("item_no");
			int quantity = res.getInt("quantity");
			String staffNum = res.getString("staff_no");
			Date orderDate = res.getDate("order_date");

			ItemOrderBean itemOrder = new ItemOrderBean();

			itemOrder.setOrderNum(orderNum);
			itemOrder.setItemNum(itemNum);
			itemOrder.setQuantity(quantity);
			itemOrder.setStaffNum(staffNum);
			itemOrder.setOrderDate(orderDate);

			orderList.add(itemOrder);
		}

		return orderList;
	}

}
