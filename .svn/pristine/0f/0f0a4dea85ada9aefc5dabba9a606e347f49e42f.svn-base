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
@WebServlet("/uppage.do")
public class UpPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1. 获取客户端提交的信息
		int startpage =Integer.parseInt(request.getParameter("page"));
		if(startpage>1) {
			request.getSession().setAttribute("startpage",startpage-1);
			request.getSession().setAttribute("list", new CarDao_page().listpage("2", String.valueOf(request.getSession().getAttribute("startpage"))));
			response.sendRedirect("list_car.jsp");
			
		}else {
//			request.getSession().setAttribute("list", new CarDao_page().listpage("2", String.valueOf(request.getSession().getAttribute("startpage"))));
			response.sendRedirect("list_car.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
				
				
				
	}

}
