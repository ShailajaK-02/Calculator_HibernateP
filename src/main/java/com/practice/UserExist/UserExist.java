package com.practice.UserExist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.UserDetails;
import com.practice.Utility.HibernateUtility;
//User exist Details
public class UserExist {
	
	public int count=0;
	public int cost = 20;
	//UserDetails user = new UserDetails();
	
	public void userExist(String name) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		UserDetails user = session.find(UserDetails.class, name);		
		if(user == null) {
			//new user
			user = new UserDetails();
			
			user.setUsername(name);
			user.setTotalOprPerformed(1);
			//set cost per calculation
			user.setCost(cost);
			session.persist(user);
		}
		//count total operation performed * with new count
		else {
			 count = user.getTotalOprPerformed();
		     int newcount = count + 1;
		     user.setTotalOprPerformed(newcount);
		     user.setCost(cost * newcount);

			//session.persist(user);
		     //to update existing details we use merge 
			session.merge(user);
		}
				
		transaction.commit();
		session.close();
		
		//return user.getCost();
	}
}
