package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formAllServlet
 */
@WebServlet("/formAllServlet")
public class formAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String addr = request.getParameter("addr");
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		
		String interest[] = request.getParameterValues("interest");	// 여러개 가져오는 경우(checkbox 형태) 배열형태로 값 얻어오기
		String job = request.getParameter("job");
		String interest2[] = request.getParameterValues("interest2");
		String content = request.getParameter("content");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form 관련태그 결과</title></head>");
		out.println("<body>");
		out.println("<h2>당신이 입력한 정보입니다.</h2>");
		
		out.println("<p><b> 이  름 : </b>"+name+"</p>");
		out.println("<p><b> 아이디 : </b>"+id+"</p>");
		out.println("<p><b> 비밀번호 : </b>"+pw+"</p>");
		out.println("<p><b> 주  소  : </b>"+addr+"</p>");
		out.println("<p><b> 성  별 : </b>"+gender+"</p>");
		out.println("<p><b> 메일정보수신 여부 : </b>"+chk_mail+"</p>");
		
		out.println("<p><b> 관심분야1 : </b>");
		if(interest == null) {
			out.print("선택항목이 없습니다.");
		}else {
			out.println("당신이 선택한 항목입니다. <hr/>");
			
			for(String i : interest) {
				out.print(i + ", ");
			}
			out.print("</p>");
		}
		
		out.println("<p><b> 직  업 : </b>"+job+"</p>");
		out.println("<p><b> 관심분야2 : </b>");
		if(interest2 == null) {
			out.print("선택항목이 없습니다.");
		}else {
			out.println("당신이 선택한 항목입니다. <hr/>");
			
			for(String i : interest2) {
				out.print(i + ", ");
			}
			out.print("</p>");
		}
		
		out.println("<p><b> 가입인사 : </b><pre>"+content+"</pre></p>");
		
		out.println("<a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
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
