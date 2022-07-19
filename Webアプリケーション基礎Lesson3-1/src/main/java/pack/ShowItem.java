package pack;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * データベースへアクセスし、itemテーブルから商品データを取得。
 * 商品一覧表示ページへ転送する。
 * @author 上田和
 */
@WebServlet("/ShowItem")
public class ShowItem extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * コンストラクタ
     * @see HttpServlet#HttpServlet()
     */
    public ShowItem() {
        super();
    }

    /**
     * 今回の課題では未使用
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * データベースへ接続してitemテーブルから商品データを取得する。
     * リストでデータを保持し、一覧表示画面に転送する。
     * 商品詳細が未記入の場合は「なし」とする。
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<ItemBean> itemList = new ArrayList<>();
        ItemDAO dao = new ItemDAO();

        try {
            itemList = dao.selectAll();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        request.setAttribute("itemList", itemList);

        // 商品データの詳細がnullの場合「なし」に変更
        for (ItemBean itemBean : itemList) {
            if (itemBean.getItemDetail() == null) {
                itemBean.setItemDetail("なし");
            }
        }
        // 商品一覧表示画面へ転送
        RequestDispatcher rd = request.getRequestDispatcher("jsp/resultItem.jsp");
        rd.forward(request, response);
    }

}
