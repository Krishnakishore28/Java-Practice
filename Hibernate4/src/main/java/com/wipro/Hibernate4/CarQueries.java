package com.wipro.Hibernate4;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CarQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
    	SessionFactory s=cfg.buildSessionFactory();
    	HibernateQueries carQueries=new HibernateQueries();
    	List<CarDetails> cars=carQueries.diplayRegNumber(s);
    	for(CarDetails car:cars) {
    		System.out.println(car.getRegNo()+" "+car.getManufacturer());
    	}
    	String regNo="KL-07";
    	CarDetails car=carQueries.carDetails(s, regNo);
    	String manufacturer="Volkswagon";
    	List<CarDetails> car1=(List<CarDetails>) carQueries.carDetailsByManufacturer(s, manufacturer);
    	System.out.println(car1);
    	List<CarDetails> car2=(List<CarDetails>) carQueries.carDetailsByManufacturerV(s);
    	System.out.println(car2);
    	
	}

}
