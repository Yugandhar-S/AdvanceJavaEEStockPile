package mypack;

import java.sql.*;

public class LoginDao {
	
	public static Boolean authenticate(int id, String pass) {
		int loginId;
		String password;
		Boolean flag=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			
			PreparedStatement pst=con.prepareStatement("select loginId, password from register");
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				loginId=rs.getInt("loginId");
				password=rs.getString("password");
				
				if(loginId==id && password.equals(pass)) {
					flag=true;
				}
				else
					flag=false;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
}
