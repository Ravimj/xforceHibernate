package com.dev.beans;

import com.dev.dao.HibernateImpl;
import com.dev.dao.JDBCImpl;
import com.dev.dao.UserInfoDAO;

public class UserInfoDaoFactory {

	private final static String DATABASE = "HIBERNATE";
	private UserInfoDaoFactory() {
		
	}
	private  static final UserInfoDAO ref = getDao();
	
	private static UserInfoDAO getDao()
	{
		UserInfoDAO db = null;
		if(DATABASE.equals("JDBC"))
		{
			db = new JDBCImpl();		    
		}
		else if(DATABASE.equals("HIBERNATE"))
		{
			System.out.println("return hibernateimpl");
			db = new HibernateImpl();
		}
		return db;
	}
	public static UserInfoDAO getDatabase()
	{
		return ref;
	}
}