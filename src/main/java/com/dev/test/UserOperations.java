package com.dev.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dev.beans.UserInfo;
import com.dev.beans.UserInfoDaoFactory;
import com.dev.dao.UserInfoDAO;
import com.dev.utils.HibernateUtils;

public class UserOperations {

	public static void main(String[] args)
	{
		/*Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();*/

		System.out.println("started");
		UserInfo user = new UserInfo();
		user.setUser_id(2);
		user.setFirstname("Ram");
		user.setLastname("kumar");
		user.setEmail("ram@g.com");
		user.setPassword("qwert");

		UserInfoDAO db = UserInfoDaoFactory.getDatabase();
		System.out.println("got db");
		boolean res = db.createProfile(user);

		if(res) {
			System.out.println("Success");
		}else {
			System.out.println("Failed");
		}
	}
}
