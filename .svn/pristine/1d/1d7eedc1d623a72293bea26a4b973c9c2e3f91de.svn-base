package web;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.StringUtils;

import bean.User;
import dao.CarDao;
import dao.CarDao_page;
import dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				request.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				
				//1. 获取客户端提交的信息
				String userName = request.getParameter("username");
				String password = request.getParameter("password");
				
				User student =null;
				try {
					student = new UserDao().login(userName, password);
				}catch (Exception e) {
					request.getSession().setAttribute("username_r", "<span style='color:red'>登录失败，用户名或密码错误</span>");
					//2. 重定向
					response.sendRedirect("index.jsp");
				}
				
				if(StringUtils.isNullOrEmpty(userName)||StringUtils.isNullOrEmpty(password)) {
					request.getSession().setAttribute("username_r", "<span style='color:red'>登录失败,用户名或密码为空</span>");
					//2. 重定向
					response.sendRedirect("index.jsp");
				}
				
				
				if(student!=null) {
					int startpage=1;
					request.getSession().setAttribute("startpage", startpage);
					request.getSession().setAttribute("list", new CarDao_page().listpage("2", startpage+""));
					response.sendRedirect("list_car.jsp");
				}else {
					request.getSession().setAttribute("username_r", "<span style='color:red'>登录失败，用户名或密码错误</span>");
					//2. 重定向
					response.sendRedirect("index.jsp");
				}
				
	}

}
