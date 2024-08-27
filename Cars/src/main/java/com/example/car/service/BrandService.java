package com.example.car.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.car.entity.Car;
import com.example.car.repository.BrandRepo;

@Service
public class BrandService {
	@Autowired
	private BrandRepo repo;

	public List<Car> byBrand(String Brand) {
		List<Car> cars=repo.findAll();
		List<Car> cars1=new ArrayList<Car>();
		for(Car cars2:cars) {
			if(cars2.getBrand().equals(Brand)) {
				cars1.add(cars2);
			}
		}
		return cars1;
	}
	public Car getById(int id) {
		return repo.findById(id).get();
	}
	public List<Car> byPrice(int price) {
		List<Car> cars=repo.findAll();
		List<Car> cars1=new ArrayList<Car>();
		for(Car cars2:cars) {
			if(price==4) {
				if(cars2.getPrice()<500000) {
					cars1.add(cars2);
				}
			}
			else {
				if(cars2.getPrice()>500000) {
					cars1.add(cars2);
				}
			}
		}
		return cars1;
	}
}
