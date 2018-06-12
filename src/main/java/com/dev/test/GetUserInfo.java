package com.dev.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dev.beans.UserInfo;

public class GetUserInfo {

	public static void main(String[] args) 
	{
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		/*UserInfo us = new UserInfo();
		us.setUser_id(2);
		us.setFirstname("Ram");
		us.setLastname("kumar");
		us.setEmail("ram@g.com");
		us.setPassword("qwert");*/
		
		session.getTransaction().begin();
		
		UserInfo user = session.get(UserInfo.class, 2);//getting data
		
		//printing data
		System.out.println(user.getUser_id());
		System.out.println(user.getFirstname());
		System.out.println(user.getLastname());
		
		session.getTransaction().commit();
		
		session.close();
		
		factory.close();

	}

}
