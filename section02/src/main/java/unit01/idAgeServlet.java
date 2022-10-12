package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class idAgeServlet
 */
@WebServlet("/idAgeServlet")
public class idAgeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public idAgeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");					//문자를 받을때
		int age = Integer.parseInt(request.getParameter("age"));//숫자를 받을때->문자로오기때문에 숫자로변경
		
		PrintWriter out = response.getWriter();		
		
		out.println("<html>");
		out.println("<head><title>아이디와 나이를 입력해주세요.</title></head>");
		out.println("<body>");
		out.println("당신이 입력한 정보입니다.<br/>");
		out.println("아이디 : "+ id + "<br/>");
		out.println("나 이  :"+ age + "<br/>");
		out.println("<a href='javascript:history.go(-1)'>이전으로</a>");
		out.println("</body></html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
