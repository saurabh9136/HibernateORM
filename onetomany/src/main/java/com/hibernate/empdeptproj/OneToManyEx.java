package com.hibernate.empdeptproj;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//** Write a program to show One to Many relationship. Show One to Many relationship between Employee and Department.**


public class OneToManyEx
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration(); // configuring with .xml file
        cfg.configure("Hibernate.cfg.xml");		// set the url as name of the xml file
        
        SessionFactory f = cfg.buildSessionFactory();	// building a session factory
       
        Dept d1 = new Dept();	// creating and initalizing object of department
        d1.setDip(201);
        d1.setDname("Dev-Ops");
        
        Dept d2 = new Dept();
        d2.setDip(202);
        d2.setDname("Designer");
        
        Dept d3 = new Dept();
        d3.setDip(203);
        d3.setDname("Software Developer");
        
        Dept d4 = new Dept();
        d4.setDip(204);
        d4.setDname("Data-scientist");
        
        
        // creating object and initializing Employee object
        Emp e1 = new Emp();
        e1.setEid(101);
        e1.setEname("saurabh");
        e1.setDept(d1);
        
        Emp e2 = new Emp();
        e2.setEid(102);
        e2.setEname("Amit"); 
        e2.setDept(d2);
        
        Emp e3 = new Emp();
        e3.setEid(103);
        e3.setEname("Avinash"); 
        e3.setDept(d4);
        
        Emp e4 = new Emp();
        e4.setEid(104);
        e4.setEname("Krishna");  
        e4.setDept(d2);
        
        Emp e5 = new Emp();
        e5.setEid(105);
        e5.setEname("Rupesh");  
        e5.setDept(d1);
        
        Emp e6 = new Emp();
        e6.setEid(106);
        e6.setEname("Vijay");
        e6.setDept(d3);
        
        Emp e7 = new Emp();
        e7.setEid(107);
        e7.setEname("Ricky"); 
        e7.setDept(d3);
        
        Emp e8 = new Emp();
        e8.setEid(108);
        e8.setEname("Deepak");
        e8.setDept(d3);
        
        List<Emp> l1 = new ArrayList<Emp>(); //creating list of employees and map with department
        l1.add(e1);
        l1.add(e5);
        
        d1.setEmp(l1);       
        
        List<Emp> l2 = new ArrayList<Emp>();//creating list of employees and map with department
        l2.add(e2);
        l2.add(e4);
        
        d2.setEmp(l2);
        
        List<Emp> l3 = new ArrayList<Emp>();//creating list of employees and map with department
        l3.add(e6);
        l3.add(e7);
        l3.add(e8);
        
        d3.setEmp(l3);
        
        List<Emp> l4 = new ArrayList<Emp>(); //creating list of employees and map with department
        l4.add(e3);
        
        d4.setEmp(l4);
        
        Session s = f.openSession();
        Transaction tx = s.beginTransaction();
        // saving all objects
        s.save(d1);
        s.save(d2);
        s.save(d3);
        s.save(d4);
        s.save(e1);
        s.save(e2);
        s.save(e3);
        s.save(e4);
        s.save(e5);
        s.save(e6);
        s.save(e7);
        s.save(e8);
        tx.commit(); // permanantly saving
        s.close();
        f.close();
               
        
    }
}
