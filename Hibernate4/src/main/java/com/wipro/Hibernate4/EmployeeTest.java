package com.wipro.Hibernate4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
	public static void main(String args[]) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session s=sessionFactory.openSession();
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("sumanth");
		Passport p1=new Passport();
		p1.setPassportnumber(4444);
		p1.setPid(3);
		e1.setPassport(p1);
		Employee e2=new Employee();
		e2.setId(4);
		e2.setName("siraj");
		Passport p2=new Passport();
		p2.setPassportnumber(444400);
		p2.setPid(4);
		e2.setPassport(p2);
		Transaction tx=s.beginTransaction();
		
		s.persist(e1);
		s.persist(e2);
		
		tx.commit();
		s.close();
		
	}

}
