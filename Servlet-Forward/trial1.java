

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Trial1
 */
@WebServlet("/Trial1")
public class Trial1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("name", "Yugandhar");
		
		
//		request.setAttribute("book","java");
//		response.sendRedirect("Trail2");
		
		ServletContext context=getServletContext();
		context.setAttribute("song", "Can't find me");
		
		RequestDispatcher rd=request.getRequestDispatcher("Trail2");
		rd.forward(request, response);
	}

}
