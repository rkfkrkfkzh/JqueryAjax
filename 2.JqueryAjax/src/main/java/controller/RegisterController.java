package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;
import service.Service;
import service.ServiceImpl;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Service service =  new ServiceImpl(); 
		    String id = request.getParameter("id");
			String pwd = request.getParameter("password");
			String addr = request.getParameter("address");
			String name = request.getParameter("name");
	
			MemberVO m = new MemberVO(id, pwd, addr,name);
			System.out.println("con:"+m);
			//������ ȸ������ ��� ����
			service.registerMember(m);
            request.setAttribute("m", m);
			//�α��� ������ �̵�
			RequestDispatcher dispatcher = request.getRequestDispatcher("6.register_result.jsp");
			if (dispatcher != null) {
				dispatcher.forward(request, response);
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
