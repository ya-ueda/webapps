package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * itemテーブルのDAO
 * @author 上田和
 *
 */
public class ItemDAO {
	/**
	 * 全ての商品データを返す。
	 * @return データベースに登録されている商品データのリスト
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<ItemBean> selectAll() throws SQLException, ClassNotFoundException {
		List<ItemBean> itemList = new ArrayList<>();

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
		connection = DriverManager.getConnection("jdbc:postgresql://10.0.2.15:5432/postgres", // "jdbc:postgresql://[場所(Domain)]:[ポート番号]/[DB名]"
				"postgres", // ログインロール
				""); // パスワード

		statement = connection.createStatement();

		//-----------------
		// SQLの発行
		//-----------------
		//item情報のテーブル
		res = statement.executeQuery("SELECT * FROM item ORDER BY item_no");
		// 1レコードずつリストに追加
		while (res.next()) {
			String itemNum = res.getString("item_no");
			String itemName = res.getString("item_name");
			int price = res.getInt("price");
			String itemDetail = res.getString("item_detail");

			ItemBean item = new ItemBean();

			item.setItemNum(itemNum);
			item.setItemName(itemName);
			item.setPrice(price);
			item.setItemDetail(itemDetail);

			itemList.add(item);
		}

		return itemList;
	}
}
