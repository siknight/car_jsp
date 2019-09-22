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
@WebServlet("/delete.do")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1. 获取客户端提交的信息
		String id = request.getParameter("id");
		System.out.println("id="+id);
		int id2 =new CarDao().deleteById(id);
		System.out.println("id2="+id2);
		if(id2>0) {
			
//			request.getSession().setAttribute("list", new CarDao().listAll());
			int startpage=1;
			request.getSession().setAttribute("startpage", startpage);
			request.getSession().setAttribute("list", new CarDao_page().listpage("2", startpage+""));
			response.sendRedirect("list_car.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				
				
				
				
	}

}
