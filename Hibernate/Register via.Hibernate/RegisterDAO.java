package mypack;

import java.util.*;
import org.hibernate.*;

public class RegisterDAO {
	
	public static Boolean registerUser(String name, String address,String email, String password) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			Register r=new Register();
			r.setName(name);
			r.setAddress(address);
			r.setEmail(email);
			r.setPassword(password);
			tx.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
