package pack;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
     * index.jspからリクエストで回答を受け取り、null値が無いかチェックする。
     * nullまたは空欄の場合は"未回答"として値を変更する。
     * result.jspへ回答情報を転送する。
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // リクエストのエンコーディング方式を指定
        request.setCharacterEncoding("UTF-8");
        // Mapを用いてリクエストパラメータを管理        
        Map<String, String> param = new HashMap<>();

        // リクエストパラメータの取得
        param.put("name", request.getParameter("name"));
        param.put("age", request.getParameter("age"));
        param.put("address", request.getParameter("address"));
        param.put("q1", request.getParameter("q1"));
        param.put("q2", request.getParameter("q2"));
        param.put("q3", request.getParameter("q3"));

        // 空欄または未回答の場合は"未回答"を値とする
        for (String key : param.keySet()) {
            String prm = param.get(key);
            if (prm == null) {
              
                param.replace(key, "未回答");
            } else if (prm.equals("")) {
                param.replace(key, "未回答");

            }
        }

        // リクエストスコープへの属性の設定
        for (Map.Entry<String, String> prm : param.entrySet()) {
            request.setAttribute(prm.getKey(), prm.getValue());
        }
        // リクエストの転送
        RequestDispatcher rd = request.getRequestDispatcher("jsp/result.jsp");
        rd.forward(request, response);
    }
}
