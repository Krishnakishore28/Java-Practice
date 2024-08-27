package com.wipro.Hibernate4;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class HibernateQueries {
	public List<CarDetails> diplayRegNumber(SessionFactory sessionFactory) {
		Session session=sessionFactory.openSession();
		Query<CarDetails> car=session.createQuery("from CarDetails");
		return car.list();
	}
	public CarDetails carDetails(SessionFactory sessionFactory,String regNo) {
		Session session=sessionFactory.openSession();
		Query car=session.createQuery("from CarDetails car where car.regNo=?0");
		car.setParameter(0, regNo);
		System.out.println(car.list());
		return (CarDetails) car.list().get(0);
	}
	public List<CarDetails> carDetailsByManufacturer(SessionFactory sessionFactory,String manufacturer) {
		Session session=sessionFactory.openSession();
		System.out.println(manufacturer);
		Query car=session.createQuery("from CarDetails car where car.manufacturer=?0");
		car.setParameter(0, manufacturer);
		return car.list();
	}
	public List<CarDetails> carDetailsByManufacturerV(SessionFactory sessionFactory) {
		Session session=sessionFactory.openSession();
		Query car=session.createQuery("from CarDetails car where car.manufacturer like :manu");
		car.setParameter("manu", "V"+"%");
		return car.list();
	}
	
}
