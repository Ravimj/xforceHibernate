package example.new_annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;

public class TransientTest
{

	public static void main(String[] args) 
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		Transient1 t = new Transient1();
		t.setFieldOne("rav");
		t.setFieldTwo("ram");
		t.setFieldThree("krish");
		t.setState(true);
		
		session.save(t);
		
		session.getTransaction().commit();
		
		session.close();

	}

}
