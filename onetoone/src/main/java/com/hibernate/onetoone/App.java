package com.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	/* Write a program to show One To One Relationship
		between Student and Laptop. It should be bi-directional */
	
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();  // creating cfg object
    	cfg.configure("hibernate1.cfg.xml");	// linking configuration file for configure
    	
    	SessionFactory factory = cfg.buildSessionFactory();  // building a session factory
    	System.out.println(factory.isClosed());
    	
    	Laptop l1 = new Laptop(); // creating a objects
    	l1.setLid(101);	// setting id
    	l1.setL_model("HP");	// set the name
    	
    	Laptop l2 = new Laptop();
    	l2.setLid(102);
    	l2.setL_model("DELL");
    	
    	Laptop l3 = new Laptop();
    	l3.setLid(103);
    	l3.setL_model("MACBOOK");
    	
    	Laptop l4 = new Laptop();
    	l4.setLid(104);
    	l4.setL_model("ACCER");
    	
    	Laptop l5 = new Laptop();
    	l5.setLid(105);
    	l5.setL_model("LENOVO");
    	
    	Student s1 = new Student();
    	s1.setSid(201);
    	s1.setSname("SAURABH");
    	
    	Student s2 = new Student();
    	s2.setSid(202);
    	s2.setSname("AMIT");
    	
    	Student s3 = new Student();
    	s3.setSid(203);
    	s3.setSname("SUMIT");
    	
    	Student s4 = new Student();
    	s4.setSid(204);
    	s4.setSname("ASIF");
    	
    	Student s5 = new Student();
    	s5.setSid(205);
    	s5.setSname("AYAN");
    	
    	// because it is bi-deirectional so we map student to laptop & laptop to student
        	
    	s1.setLaptop(l5);  // mapping laptop with student
    	l5.setStudent(s1);	// mapping student with laptop
    	
    	s2.setLaptop(l4);
    	l4.setStudent(s2);
    	
    	s3.setLaptop(l3);
    	l3.setStudent(s3);
    	
    	s4.setLaptop(l2);
    	l2.setStudent(s4);
    	
    	s5.setLaptop(l1);
    	l1.setStudent(s5);
    	
    	// now open a session to save objects
    	Session s = factory.openSession();
    	// using transaction class to save it permanantly
    	Transaction tx = s.beginTransaction();
    	
    	s.save(s1);	// saving the objects
    	s.save(s2);
    	s.save(s3);
    	s.save(s4);
    	s.save(s5);
    	
    	s.save(l1);
    	s.save(l2);
    	s.save(l3);
    	s.save(l4);
    	s.save(l5);  	
    	
    	tx.commit();	// by committing the object will save permanently
    	factory.close();	// closing the factory
    	
    }
}
