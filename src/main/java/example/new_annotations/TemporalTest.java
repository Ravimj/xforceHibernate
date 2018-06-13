package example.new_annotations;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;

public class TemporalTest 
{

	public static void main(String[] args) 
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		Temporal1 t1 = new Temporal1(new Date());
		session.save(t1);
		session.getTransaction().commit();
		session.close();
	}
	
}
