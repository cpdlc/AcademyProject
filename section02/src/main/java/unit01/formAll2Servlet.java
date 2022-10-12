package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formAll2Servlet
 */
@WebServlet("/formAll2Servlet")
public class formAll2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formAll2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		String name = request.getParameter("name");
		String jnum[] = request.getParameterValues("jnum");
		String id = request.getParameter("id");
		String pw1 = request.getParameter("pw1");
		String pw2 = request.getParameter("pw2");
		String email[] = request.getParameterValues("email");
		String addrnum = request.getParameter("addrnum");
		String addr[] = request.getParameterValues("addr");
		String phone = request.getParameter("phone");
		String job = request.getParameter("job");
		String chk_mail = request.getParameter("chk_mail");
		String interest[] = request.getParameterValues("interest");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form 관련태그 결과</title></head>");
		out.println("<body>");
		out.println("<h2>당신이 입력한 정보입니다.</h2>");
		out.println("<p><b> 이  름 : </b>"+name+"</p>");

		out.println("<p><b> 주민번호 : </b>");
		if(jnum == null) {
			out.print("선택항목이 없습니다.");
		}else {
			out.println("당신이 선택한 항목입니다. <hr/>");
			
			
				out.print(jnum[0] + "-"+jnum[1]);
			
			out.print("</p>");
		}
		out.println("<p><b> 아이디 : </b>"+id+"</p>");
		out.println("<p><b> 비밀번호1 : </b>"+pw1+"</p>");
		out.println("<p><b> 비밀번호2 : </b>"+pw2+"</p>");
		
		out.println("<p><b> 이메일 : </b>");
		if(email == null) {
			out.print("선택항목이 없습니다.");
		}else {
			out.println("당신이 선택한 항목입니다. <hr/>");
			
			if(email[2]=="") {
				out.print(email[0] + "@"+email[1]);
			}else {
				out.print(email[0] + "@"+email[2]);
			}

			out.print("</p>");
		}
		
		out.println("<p><b> 우편번호  : </b>"+addrnum+"</p>");
		
		out.println("<p><b> 주소 : </b>");
		if(addr == null) {
			out.print("선택항목이 없습니다.");
		}else {
			out.println("당신이 선택한 항목입니다. <hr/>");
			
			out.print(addr[0] + " "+addr[1]);
			
			out.print("</p>");
		}
		out.println("<p><b> 핸드폰번호 : </b>"+phone+"</p>");
		out.println("<p><b> 직업 : </b>"+job+"</p>");
		out.println("<p><b> 메일정보수신여부 : </b>"+chk_mail+"</p>");
		
		out.println("<p><b> 관심분야 : </b>");
		if(interest == null) {
			out.print("선택항목이 없습니다.");
		}else {
			out.println("당신이 선택한 항목입니다. <hr/>");
			
			for(int i=0;i<interest.length-1;i++) {
				out.print(i+", ");
			}
			out.print(interest[interest.length-1]);
			out.print("</p>");
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
