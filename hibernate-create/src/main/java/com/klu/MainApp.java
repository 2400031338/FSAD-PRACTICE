package com.klu;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp 
{

	public static void main(String[] args) 
	{
		// Load Configuration & crate the SessionFactory 
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		// Open Session
		
		Session session=factory.openSession();
		
		
		// Begin Transaction or operations
		
		Transaction tx=session.beginTransaction();
		
		
		// Create the Table/ Object
		
		Student s=new Student("BALA");
		
		
		// Save the data / object
		
		session.save(s);
		
		// commit
		
		tx.commit();
		
		
		// Close the connection
		
		session.close();
		factory.close();
		
		System.out.println("Student data inserted sucessfully");

	}

}
