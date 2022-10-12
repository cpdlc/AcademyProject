package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class memberShipFormServlet
 */
@WebServlet("/memberShipFormServlet")
public class memberShipFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public memberShipFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name");
		String jumin = request.getParameter("jumin_1") + "-" +request.getParameter("jumin_2");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		
		if(request.getParameter("email_dns").trim()=="") {
			email += "@"+request.getParameter("emailaddr");
		}else {
			email += "@"+request.getParameter("email_dns");
		}
		
		String zip = request.getParameter("zip");
		String addr = request.getParameter("addr1")+ request.getParameter("addr2");
		String phone = request.getParameter("phone");
		String job = request.getParameter("job");
		String chk_mail = request.getParameter("chk_mail");
		String interests[] = request.getParameterValues("interest");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.println("<head><title>회원가입 출력결과</title></head>");
		out.println("<body>");
		out.println("<p> 이름 : <b>"+name+"</b></p>");
		out.println("<p> 주민번호 : <b>"+jumin+"</b></p>");
		out.println("<p> 아 이 디 : <b>"+id+"</b></p>");
		out.println("<p> 비밀번호 : <b>"+pwd+"</b></p>");
		out.println("<p> 이 메 일 : <b>"+email+"</b></p>");
		out.println("<p> 이메일수신여부 : <b>"+chk_mail+"</b></p>");
		out.println("<p> 우편번호 : <b>"+zip+"</b></p>");
		out.println("<p> 주 소 : <b>"+addr+"</b></p>");
		out.println("<p> 전화번호 : <b>"+phone+"</b></p>");
		out.println("<p> 직 업 : <b>"+job+"</b></p>");
		
		out.println("<p> 관심분야 : <b>");
		if(interests == null) {
			out.print("선택항목이 없습니다.");
		}else {
			for(String i : interests) {
				out.print(i+", ");
			}
		}
		out.print("</b></p>");
		
		out.print("<a href='javascript:history.go(-1)'>다시</a>");
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
