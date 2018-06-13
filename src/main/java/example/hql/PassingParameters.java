package example.hql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.dev.beans.UserInfo;
import com.dev.utils.HibernateUtils;


public class PassingParameters 
{
	public static void main(String[] args)
	{
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		//Indexed Parameter Type
//		Query<Student> query = session.createQuery("FROM Student s WHERE s.regno=?",Student.class);
		
		//Named Parameter Type
		Query<UserInfo> query = session.createQuery("FROM UserInfo s WHERE s.user_id= :id ",UserInfo.class);
//		query.setParameter(0, args[0]); // for Indexed Parameter type
		query.setParameter("id", 2);
		/*
		 * SetParameter can set the type of value intelligently but you should be aware of 
		 * using Temporal type like date and time. You have to explicitly setDate or setTime
		 */
		List<UserInfo> user = query.list();
		for(UserInfo s:user){
			System.out.println(s);
		}
		session.getTransaction().commit();
		session.close();
	}
}