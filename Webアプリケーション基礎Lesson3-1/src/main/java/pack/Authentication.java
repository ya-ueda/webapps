package pack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Authentication
 */
@WebServlet("/Authentication")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String id = "NSK";
	private String password = "1234";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Authentication() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		//idとpasswordをlogin.jspから取得
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		//sessionを作成
		HttpSession session = request.getSession(true);
		//idとpasswordが一致していたらsessionをlogin状態にし、topページへ
		//そうでなければsessionをlogout状態にし、loginページへ
		if (this.id.equals(id) && this.password.equals(password)) {
			session.setAttribute("status", "login");
			session.setAttribute("id", id);
			response.sendRedirect("/Lesson3-1/jsp/top.jsp");
		} else {
			session.setAttribute("status", "logout");
			response.sendRedirect("/Lesson3-1/jsp/login.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
