package realations.many.to.many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;

public class UniDir 
{
	public static void main(String[] args) 
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		Students_Unidirectional s1= new Students_Unidirectional();
		s1.setName("ram");
		s1.setAge(23);
		
		Teacher t = new Teacher();
		t.setName("Magala");
		t.setSubject("Kannada");
		
		Teacher t1 = new Teacher();
		t1.setName("Amma");
		t1.setSubject("craft");
		
		Set<Teacher> set = new HashSet<Teacher>();
		
		set.add(t);
		set.add(t1);
		
		s1.setList(set);
		
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
	}
}
