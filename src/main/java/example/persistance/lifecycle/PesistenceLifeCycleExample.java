package example.persistance.lifecycle;


import java.net.MalformedURLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.beans.UserInfo;
import com.dev.utils.HibernateUtils;

public class PesistenceLifeCycleExample {
	public static void main(String[] args) throws MalformedURLException {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		//get() is used to make an entity persistence
		UserInfo user = session.get(UserInfo.class, 1);
		boolean state = session.contains(user);
				System.out.println("User object present: "+state);
				
//		session.evict(user);
		session.detach(user);
		boolean state1 = session.contains(user);
		System.out.println("User object removed: "+state1);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
