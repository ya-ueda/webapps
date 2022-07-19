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
 * データベースへアクセスし、item_orderテーブルから商品注文データを取得。
 * 商品注文履歴一覧表示ページへ転送する。
 * 
 * @author 中山浩彰
 */
@WebServlet("/ShowItemOrder")
public class ShowItemOrder extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * コンストラクタ
     * @see HttpServlet#HttpServlet()
     */
    public ShowItemOrder() {
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
     * データベースへ接続してitem_orderテーブルから商品注文データを取得する。
     * リストでデータを保持し、一覧表示画面に転送する。
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<ItemOrderBean> OrderList = new ArrayList<>();
        ItemOrderDAO dao = new ItemOrderDAO();

        try {
            OrderList = dao.selectAll();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        request.setAttribute("orderList", OrderList);

        // 商品注文履歴一覧表示画面へ転送
        RequestDispatcher rd = request.getRequestDispatcher("jsp/resultItem_order.jsp");
        rd.forward(request, response);
    }

}
