package mypack;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentDAO {

	public static List<Department> getRecord(String loc) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=null;
		
		try {
			transaction=session.beginTransaction();
			
			Query<Department> query=session.createQuery("from Department d where d.loc= :loc");
			query.setParameter("loc", loc);
			List<Department> mylist=query.list();
			transaction.commit();
			return mylist;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
