package com.example.SpringBoot2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot2.entity.Employee;
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
