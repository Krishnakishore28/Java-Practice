package com.wipro.Hibernate4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {
	@Id
	@Column
	private int pid;
	@Column
	private int passportnumber;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPassportnumber() {
		return passportnumber;
	}
	public void setPassportnumber(int passportnumber) {
		this.passportnumber = passportnumber;
	}
	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", passportnumber=" + passportnumber + "]";
	}
	

}
