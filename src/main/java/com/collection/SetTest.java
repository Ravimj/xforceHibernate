package com.collection;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;



public class SetTest
{
  public static void main(String[] args)
  {
	  SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
	  UserSet user=new UserSet();
	  
	  user.setName("suman");
	  Set<String> address=new HashSet<String>();  
	  address.add("bangalore");  
	  address.add("bangalore");
	  address.add("hyderabad");
	      user.setAddress(address);
	     session.save(user);
	   
	    session.getTransaction().commit();
	    System.out.println(user);
		session.close();
		factory.close();
	
}
}
