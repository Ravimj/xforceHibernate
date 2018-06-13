package example.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.dev.beans.UserInfo;
import com.dev.utils.HibernateUtils;


public class WritingQueries
{
	public static void main(String[] args)
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
//		Query<Student> query = session.createQuery("select s from Student s",Student.class);
		Query<String> query = session.createQuery("select u.firstname from UserInfo u  ");
		
		List<String> students = query.list();
		
		for(String s:students){
			System.out.println(s);
		}
		session.getTransaction().commit();
		session.close();
	}
}
