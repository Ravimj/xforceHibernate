package realations.many.to.many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;

public class BiDir
{
	public static void main(String[] args) 
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		Teacher_Bidirectional t1 = new Teacher_Bidirectional();
		t1.setName("bomb");
		t1.setSubject("chemistry");
		
		Teacher_Bidirectional t2 = new Teacher_Bidirectional();
		t2.setName("bmb");
		t2.setSubject("histry");
		
		HashSet<Teacher_Bidirectional> ts = new HashSet<Teacher_Bidirectional>();
		ts.add(t1);
		ts.add(t2);
		
		
		
		Students_Bidirectional s1 = new Students_Bidirectional();
		s1.setAge(25);
		s1.setName("ravi");
		
		Students_Bidirectional s2 = new Students_Bidirectional();
		s2.setAge(35);
		s2.setName("avi");
		
		Set<Students_Bidirectional> st = new HashSet<Students_Bidirectional>();
		st.add(s1);
		st.add(s2);
		
		t1.setStudents(st);
		s1.setTeachers(ts);
		
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
