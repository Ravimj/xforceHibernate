package relation.one.to.many;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;

public class OneToMany_Uni {

	public static void main(String[] args) 
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		PencilBox_UniDirectional pen = new PencilBox_UniDirectional();
		
		pen.setSize("3");
		
		
		
		Pencil p = new Pencil();
		p.setName("rq");
		
		
		Pencil  p1 = new Pencil();
		p1.setName("ar");
		
		
		List<Pencil> li = new ArrayList();
		li.add(p);
		li.add(p1);
		
		
		pen.setPencils(li);
		
	
		
		session.beginTransaction();
		session.save(pen);
		session.getTransaction().commit();
		session.close();
		factory.close();

		
		
	}

}
