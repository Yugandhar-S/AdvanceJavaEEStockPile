

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import mypack.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.LoginDao;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet(
		urlPatterns = { "/LoginServ" }, 
		initParams = { 
				@WebInitParam(name = "driver", value = "com.mysql.cj.jdbc.Driver"), 
				@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/mydb")
		})
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		String driver=config.getInitParameter("driver");
		String url=config.getInitParameter("url");
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,"root","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("login_id"));
		String pass=request.getParameter("password");
		
		if(LoginDao.authenticate(id, pass)) {
			out.println("Welcome");
			
		}
		else
			out.println("Fail");
	}

}
