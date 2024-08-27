package com.wipro.Hibernate4;

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
    	SessionFactory s=cfg.buildSessionFactory();
    	Session session=s.openSession();
    	Transaction tx=session.beginTransaction();
    	CarDetails car1=new CarDetails();
    	car1.setRegNo("KL-07");
    	car1.setColor("white");
    	car1.setModel("AB 123 POLO");
    	car1.setManufacturer("Volkswagon");
    	CarDetails car2=new CarDetails();
    	car2.setRegNo("KL-08");
    	car2.setColor("Black");
    	car2.setModel("AB 234 VENTO");
    	car2.setManufacturer("Volkswagon");
    	CarDetails car3=new CarDetails();
    	car3.setRegNo("KL-09");
    	car3.setColor("silver");
    	car3.setModel("AC 345 koralla");
    	car3.setManufacturer("toyato");
    	session.save(car3);
    	session.save(car1);
    	session.save(car2);
    	tx.commit();
    	session.close();
    	
    }
}
