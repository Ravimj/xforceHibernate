package com.collection;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.utils.HibernateUtils;



public class ListTest
{
  public static void main(String[] args) 
  {
	  SessionFactory factory =HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
	  UserInfo user=new UserInfo();
	  
	  user.setName("ajit");
	  List<String> nikNames=new ArrayList<String>();  
	  nikNames.add("vicky");  
	  nikNames.add("ajju");
	  nikNames.add("ajju");
	      user.setNickNames(nikNames);
	     session.save(user);
	   
	    session.getTransaction().commit();
	    System.out.println(user);
		session.close();
		factory.close();
	
}
}
