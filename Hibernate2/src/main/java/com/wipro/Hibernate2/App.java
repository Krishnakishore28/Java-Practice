package com.wipro.Hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg=new Configuration().configure();
    	SessionFactory session=cfg.buildSessionFactory();
    	Session s=session.openSession();
    	Product p1=new Product();
    	p1.setProductName("laptop");
    	p1.setProductNumber(1);
    	Product p2=new Product();
    	p2.setProductName("phone");
    	p2.setProductNumber(2);
    	Product p3=new Product();
    	p3.setProductName("glouse");
    	p3.setProductNumber(3);
    	Product p4=new Product();
    	p4.setProductName("box");
    	p4.setProductNumber(4);
    	Product p5=new Product();
    	p5.setProductName("earphones");
    	p5.setProductNumber(1);
    	Transaction tx=s.beginTransaction();
    	s.save(p1);
    	s.save(p2);
    	s.save(p3);
    	s.save(p4);
    	s.save(p5);
    	tx.commit();
    	s.close();
    }
}
