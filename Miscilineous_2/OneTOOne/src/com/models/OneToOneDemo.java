package com.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student st = new Student();
		st.setName("Girish");
		
		PermanentAddress address = new PermanentAddress();
		address.setState("RR nagar");
		address.setState("Karnataka");
		address.setCountry("India");
		
		st.setPermanentAddress(address);
		address.setStudent(st);
		
		session.save(st);
		
		tx.commit();
		session.close();
		System.out.println("***** successfullly inserted ***");
		
		
		
		

	}

}
