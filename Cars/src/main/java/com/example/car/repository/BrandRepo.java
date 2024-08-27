package com.example.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.car.entity.Car;

@Repository
public interface BrandRepo extends JpaRepository<Car, Integer>{

}
