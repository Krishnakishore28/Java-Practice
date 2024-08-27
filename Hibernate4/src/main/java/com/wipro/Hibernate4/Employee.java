package com.wipro.Hibernate4;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmployeePassport")
public class Employee {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@OneToOne(targetEntity = Passport.class,cascade = CascadeType.ALL)
	private Passport passport;
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", passport=" + passport + "]";
	}
	
	

}
