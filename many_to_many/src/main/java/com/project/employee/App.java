package com.project.employee;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	/*Write a program showing Many To Many relationship  between Employees and Project, where every
	 *  Employee is associated with more than 1 project and also many projects are assigned to 1 Employee.
	 */
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
      cfg.configure("hibernate.cfg.xml");	// configuruong xml file
      
      SessionFactory factory = cfg.buildSessionFactory();
      
      Emp e1 = new Emp();	//creating objects & initalize them
      e1.setEid(101);		//set the values
      e1.setEname("yash");
      
      Emp e2 = new Emp();
      e2.setEid(102);
      e2.setEname("Deepak");
      
      Emp e3 = new Emp();
      e3.setEid(103);
      e3.setEname("Saurabh");
      
      Emp e4 = new Emp();
      e4.setEid(104);
      e4.setEname("Ayaan");
      
      Emp e5 = new Emp();
      e5.setEid(105);
      e5.setEname("Aman");
      
      Emp e6 = new Emp();
      e6.setEid(106);
      e6.setEname("Amit");
      
      Emp e7 = new Emp();
      e7.setEid(107);
      e7.setEname("Avinash");
      
      Emp e8 = new Emp();
      e8.setEid(108);
      e8.setEname("Krishna");
      
      Emp e9 = new Emp();
      e9.setEid(109);
      e9.setEname("Mayur");
      
      Emp e10 = new Emp();
      e10.setEid(110);
      e10.setEname("sanket");
      
      Proj p1 = new Proj();	// creating projects object & intialize
      p1.setPid(201);
      p1.setPname("Social Networking");
      
      Proj p2 = new Proj();
      p2.setPid(202);
      p2.setPname("E-Commerce");
      
      Proj p3 = new Proj();
      p3.setPid(203);
      p3.setPname("Dairy Reminder");
      
      Proj p4 = new Proj();
      p4.setPid(204);
      p4.setPname("Weather Forecasting");
      
      Proj p5 = new Proj();
      p5.setPid(205);
      p5.setPname("Local Train Ticket System");
      
      // now creating a list of empoyees and map with project
      
      List<Emp> l1= new ArrayList<Emp>(); // using list to save multiple objects
      l1.add(e4);
      l1.add(e6);
      l1.add(e9);
      l1.add(e3);      
      p1.setEmployee(l1);	// map project with list of employees
      
      List<Emp> l2= new ArrayList<Emp>();
      l1.add(e1);
      l1.add(e6);
      l1.add(e3);
      l1.add(e4);      
      p2.setEmployee(l2);
      
      List<Emp> l3= new ArrayList<Emp>();
      l1.add(e2);
      l1.add(e8);
      l1.add(e5);
      l1.add(e4);      
      p3.setEmployee(l3);
      
      List<Emp> l4= new ArrayList<Emp>();
      l1.add(e10);
      l1.add(e9);
      l1.add(e8);
      l1.add(e7);
      p4.setEmployee(l4);
      
      List<Emp> l5= new ArrayList<Emp>();
      l1.add(e7);
      l1.add(e2);
      l1.add(e1);
      l1.add(e10);
      p5.setEmployee(l5);
      
      List<Proj> lp1 = new ArrayList<Proj>(); // now mapping list of projects with employee
      lp1.add(p1);
      lp1.add(p2);
      e3.setProj(lp1);
      e4.setProj(lp1);
      e6.setProj(lp1);
      
      List<Proj> lp2 = new ArrayList<Proj>();
      lp2.add(p2);
      lp2.add(p5);      
      e1.setProj(lp2);
      
      List<Proj> lp3 = new ArrayList<Proj>();
      lp3.add(p1);
      lp3.add(p4);
      e9.setProj(lp3);
      
      List<Proj> lp4 = new ArrayList<Proj>();
      lp4.add(p3);
      lp4.add(p5);
      e2.setProj(lp4);
      
      List<Proj> lp5 = new ArrayList<Proj>();
      lp5.add(p3);
      lp5.add(p4);
      e8.setProj(lp5);
      
      List<Proj> lp6 = new ArrayList<Proj>();
      lp6.add(p4);
      lp6.add(p5);
      e7.setProj(lp6);
      e10.setProj(lp6);
      
      Session s = factory.openSession(); //uing session 
      Transaction t = s.beginTransaction(); 
      s.save(p1);  //saving all objects
      s.save(p2);
      s.save(p3);
      s.save(p4);
      s.save(p5);
      s.save(e1);
      s.save(e2);
      s.save(e3);
      s.save(e4);
      s.save(e5);
      s.save(e6);
      s.save(e7);
      s.save(e8);
      s.save(e9);
      s.save(e10);
 
      t.commit(); // saving the objects permanantly
      factory.close();     //closing the factory
      
    }
}
