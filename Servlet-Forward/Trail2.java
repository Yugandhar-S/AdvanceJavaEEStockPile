

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Trail2
 */
@WebServlet("/Trail2")
public class Trail2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String name=(String)request.getAttribute("name");
		out.println(name);
		out.println((String)request.getAttribute("book"));
		
		out.println("<br>");
		ServletContext context=getServletContext();
		out.println("The Song is "+(String) context.getAttribute("song"));
	}

}
