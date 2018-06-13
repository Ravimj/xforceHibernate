package example.new_annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;

public class FormulaTest1 
{

	public static void main(String[] args) 
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		/*Formula1 test = new Formula1();
		test.setChemistry(12);
		test.setMaths(25);
		test.setPhysics(24);
		*/
		Formula1 t = session.get(Formula1.class, 14);
		System.out.println(t.getAvg());
		session.beginTransaction();
		
		session.getTransaction().commit();
		session.close();
		
	}

}
