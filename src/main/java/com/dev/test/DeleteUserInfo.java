package com.dev.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dev.beans.UserInfo;

public class DeleteUserInfo {

	public static void main(String[] args) 
	{
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		
		session.getTransaction().begin();
		//Transaction tx =session.getTransaction();//or session.beginTransaction();
		//tx.begin();
		UserInfo user = session.get(UserInfo.class, 1);// getting data
		
		session.delete(user);							//deleting data
		
		
		
		session.getTransaction().commit();
		
		session.close();
		
		factory.close();

	}

}
