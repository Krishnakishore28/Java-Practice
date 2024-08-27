package com.wipro.HibernateOne;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.HibernateOne.Entity.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration config=new Configuration().configure();
    	SessionFactory session= config.buildSessionFactory();
    	Session ss=session.openSession();
    	Employee e1=new Employee();
    	e1.setDesignation("farmer");
    	e1.setName("satya");
    	e1.setSalary(400.00);
    	Employee e2=new Employee();
    	e1.setDesignation("farmer");
    	e1.setName("satya");
    	e1.setSalary(400.00);
    	Employee e3=new Employee();
    	e1.setDesignation("farmer");
    	e1.setName("satya");
    	e1.setSalary(400.00);
    	Employee e4=new Employee();
    	e1.setDesignation("farmer");
    	e1.setName("satya");
    	e1.setSalary(400.00);
    	Employee e5=new Employee();
    	e1.setDesignation("farmer");
    	e1.setName("satya");
    	e1.setSalary(400.00);
    	Transaction tx=ss.beginTransaction();
    	ss.save(e1);
    	ss.save(e2);
    	ss.save(e3);
    	ss.save(e4);
    	ss.save(e5);
    	
    	tx.commit();
    	session.close();
    	
    	
    }
}
