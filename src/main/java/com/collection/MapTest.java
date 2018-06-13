package com.collection;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;


public class MapTest
{
  public static void main(String[] args)
  {
	  SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
	  UserMap user=new UserMap();
	  
	  user.setName("suman");
	  Map<Integer,String> qrCodes=new HashMap<Integer,String>(); 
	  qrCodes.put(1,"ssv@gmail.com");
	  qrCodes.put(2,"hj452");
	  qrCodes.put(3,"998845");
	  user.setQrCodes(qrCodes);
	      
	     session.save(user);
	   
	    session.getTransaction().commit();
	    System.out.println(user);
		session.close();
		factory.close();
	
}
}
