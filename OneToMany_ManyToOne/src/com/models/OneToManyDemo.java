package com.models;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDemo {
	public static void main(String[] args) {
		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();

		Author chetanBagat = new Author();
		chetanBagat.setAuthorName("ChetanBagat");

		Book book1 = new Book();
		book1.setBookDescription("Fiction Novel");
		book1.setBookTitle("HalfGirlFriend");
		book1.setAuthor(chetanBagat);

		Book book2 = new Book();
		book2.setAuthor(chetanBagat);
		book2.setBookDescription("True Story");
		book2.setBookTitle("Two states");
		book2.setAuthor(chetanBagat);

		Set<Book> books = new HashSet<>();
		books.add(book1);
		books.add(book2);
		chetanBagat.setBooks(books);
		session.save(chetanBagat);

		txn.commit();
		session.close();
		System.out.println("****** sucessfully inserted data****");

/**		// ------------Lazy loading exception------------
		Session session1 = sf.openSession();
		Transaction txn1 = session1.beginTransaction();
		Query query1 = session1.createQuery("from Author where authorId=" + chetanBagat.getAuthorId());
		Author author1 = (Author) query1.uniqueResult();
		session1.close();
		txn1.commit();
		for (Book book : author1.getBooks()) {
			System.out.println(book.getBookTitle());
		} **/

		// ----------------Lazy loading exception fix -------
		Session session2 = sf.openSession();
		Transaction txn2 = session2.beginTransaction();
		Query query2 = session2
				.createQuery("from Author a join fetch a.books where a.authorId=" + chetanBagat.getAuthorId());
		Author author2 = (Author) query2.uniqueResult();
		session2.close();
		txn2.commit();
		for (Book book : author2.getBooks()) {
			System.out.println(book.getBookTitle());
		}

		// difference between persist() and save()
		/**
		 * 1)Save return type serializable obj 
		 *   persist return type void
		 * 2)persist() ->JPA specification 
		 *   save() -> hibernate Specification 
		 * 3)transaction boundaries:
		 *   persist -> cannot be executed outside transaction boundaries 
		 *   save -> can be executed outside transaction boundaries 
		 * 4)identifier value persit -> may or may not assign identifier value immediately, will assign at flush time
		 *  save -> will assign identifier value immediately
		 **/
		//1)Return type
		Session session3 = sf.openSession();
		Transaction txn3 = session3.beginTransaction();
		
		Author rosie = new Author();
		rosie.setAuthorName("rosie");
		
		Book book3 = new Book();
		book3.setBookDescription("Love story");
		book3.setBookTitle("The Rosie Project");
		book3.setAuthor(rosie);
		
		Set<Book> books3 = new HashSet<>();
		books3.add(book3);
		
		rosie.setBooks(books3);
		int identifierValue = (int) session3.save(rosie);
		System.out.println("save() - identifier value : "+identifierValue);
		//persist
		//session3.persist(rosie);
		txn3.commit();
		//3) Transaction boundaries
		System.out.println("----transaction boudaries--------");
		session3.save(rosie); //will execute insert queries but are not flushed to db
		//session3.persist(rosie);
		System.out.println("------------");
		session3.close();

		
		

		
		
		
		

	}

}
