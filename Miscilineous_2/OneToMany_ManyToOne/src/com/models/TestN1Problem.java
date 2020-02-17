package com.models;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestN1Problem {
	
	public static void main(String[] args) {
		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		
		Query query = session
				.createQuery("from Author a join fetch a.books");
		List<Author> authList = query.list();
		for(Author auth : authList) {
			for(Book books: auth.getBooks()) {
				System.out.println("::::"+books.getBookDescription());
			}
		}
		txn.commit();
		session.close();
	}

}
