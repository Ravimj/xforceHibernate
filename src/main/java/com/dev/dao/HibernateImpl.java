package com.dev.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.beans.UserInfo;
import com.dev.utils.HibernateUtils;

public class HibernateImpl implements UserInfoDAO 
{
	SessionFactory factory = HibernateUtils.getSessionFactory();

	
	
	@Override
	public UserInfo login(int id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean UpdatePassword(int id, String Opassword, String npass, String npass2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteUser(int id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createProfile(UserInfo user)
	{
		Session session = null;
		System.out.println("inside create profile");
		try
		{
			session = factory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Pass");
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("somethings wrong");
			return false;
		}
		finally 
		{
			if(session != null)
				session.close();
		}
	}

	
	}

