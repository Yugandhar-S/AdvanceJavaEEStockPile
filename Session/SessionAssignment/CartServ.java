

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServ
 */
@WebServlet(
		urlPatterns = { "/CartServ" }, 
		initParams = { 
				@WebInitParam(name = "driver", value = "com.mysql.jdbc.Driver"), 
				@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/mydb")
		})
public class CartServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection con=null;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName(config.getInitParameter("driver"));
			con=DriverManager.getConnection(config.getInitParameter("url"),"root","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String[] arr=request.getParameterValues("item");
		
		List<String> myItems=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			myItems.add(arr[i]);
		}
		
		try {
			session.setAttribute("cart", myItems);
			session.setMaxInactiveInterval(30*60);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		out.println("<br><br><a href= 'ViewServ'>View Cart</a>");
	}

}
