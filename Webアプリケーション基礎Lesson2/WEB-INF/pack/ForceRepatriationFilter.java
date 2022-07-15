package pack;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class ForceRepatriationFilter
 */
@WebFilter(urlPatterns = {
		"/ForceRepatriationFilter",
		"/jsp/top.jsp",
		"/Logout"
}, servletNames = { "Logout" })
public class ForceRepatriationFilter implements Filter {

	/**
	 * Default constructor. 
	 */
	public ForceRepatriationFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		//statusの取得
		HttpSession session = ((HttpServletRequest) request).getSession(false);

		//statusの状態を確認し、ログインしていないならログインページに戻す
		if (session == null || session.getAttribute("status") != "login") {
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
