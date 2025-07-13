package com.practice.UserExist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.UserDetails;
import com.practice.Utility.HibernateUtility;

public class UserExist {
	
	public int count=0;
	//UserDetails user = new UserDetails();
	
	public void userExist(String name) {
		
		SessionFactory factory =HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		UserDetails user = session.find(UserDetails.class, name);		
		if(user == null) {
			//new user
			user = new UserDetails();
			
			user.setUsername(name);
			user.setTotalOprPerformed(1);
			session.persist(user);
		}
		else {
			count = user.getTotalOprPerformed();
			user.setTotalOprPerformed(count+1);
			session.persist(user);
		}
		transaction.commit();
		session.close();
	}
	
	
}
