package web;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.StringUtils;

import bean.Car;
import dao.CarDao;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/toupdate.do")
public class Toupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Toupdateservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1. 获取客户端提交的信息
		String id = request.getParameter("id");
		
		Car car = new CarDao().findById(id);
		
		request.getSession().setAttribute("car", car);
			//2. 重定向
		response.sendRedirect("update.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				
				
	}

}
