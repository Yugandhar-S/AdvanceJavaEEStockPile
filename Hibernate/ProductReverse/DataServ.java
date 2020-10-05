

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import mypack.Department;
import mypack.DepartmentDAO;

/**
 * Servlet implementation class DataServ
 */
@WebServlet("/DataServ")
public class DataServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String loc=request.getParameter("location");
		
		List<Department> mylist=DepartmentDAO.getRecord(loc);
		
		if(mylist !=null) {
			request.setAttribute("records", mylist);
			request.getRequestDispatcher("Data.jsp").forward(request, response);
		}
		else
			out.println("Sorry couldnt find any");
	}

}
