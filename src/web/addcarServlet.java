package web;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.StringUtils;

import dao.CarDao;
import dao.CarDao_page;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/add.do")
public class addcarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public addcarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//提交的数据有可能有中文， 怎么处理。
				request.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				
				//1. 获取客户端提交的信息
				String name = request.getParameter("name");
				String color = request.getParameter("color");
				
				
				if(StringUtils.isNullOrEmpty(name)||StringUtils.isNullOrEmpty(color)) {

					//2. 重定向
					response.sendRedirect("add.jsp");
				}
				
				int flag=0 ;
					try {
						flag=new CarDao().add(name, color);
//						flag=new CarDao().updateById(name, color, id);
					}catch (Exception e) {
						response.sendRedirect("add.jsp");
					}
						
				if(flag>0) {
//					request.getSession().setAttribute("list", new CarDao().listAll());
					int startpage=1;
					request.getSession().setAttribute("startpage", startpage);
					request.getSession().setAttribute("list", new CarDao_page().listpage("2", startpage+""));
					response.sendRedirect("list_car.jsp");
				}
				
				
				
	}

}
