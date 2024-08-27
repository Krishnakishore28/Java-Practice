package com.wipro.Hibernate3;

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
    	Flower f=session.get(Flower.class,3);
    	if(f!=null) {
    		System.out.println(f);
    	}
    	else {
    		System.out.println("no flower present with the givrn id");
    	}
    	tx.commit();
    	session.close(); 
    }
}
