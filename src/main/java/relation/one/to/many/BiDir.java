package relation.one.to.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;

public class BiDir 
{

	public static void main(String[] args)
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Bucket_Bidirectional b1= new Bucket_Bidirectional();
		b1.setBucket_id(101);
		b1.setName("aaa");
		
		IceCube i = new IceCube();
		i.setBucket(b1);
		i.setIceCubeId(1111);
		i.setSize("25");
		
		
		IceCube i1 = new IceCube();
		i1.setBucket(b1);
		i1.setIceCubeId(1112);
		i1.setSize("25");
		
		List<IceCube> l1 =new ArrayList<>();
		l1.add(i);
		l1.add(i1);
		
		b1.setIceCube(l1);
		
		session.beginTransaction();
		session.save(b1);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
