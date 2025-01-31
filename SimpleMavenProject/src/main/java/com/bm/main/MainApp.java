package com.bm.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bm.entity.User;

public class MainApp {
	public static void main(String[] args) {
		User user = new User("BNM", "0787");

		// MORE READABLE CODE
//		Configuration conf = new Configuration();
//		conf.configure("configdb.xml");
//		SessionFactory factory = conf.buildSessionFactory();
//		Session ses = factory.openSession();

		// More faster to type
		Session session = new Configuration().configure("configdb.xml").buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(user); // Adds new record in DB :::::::::: creates insert query internally
		transaction.commit();
		session.close();
	}

}
