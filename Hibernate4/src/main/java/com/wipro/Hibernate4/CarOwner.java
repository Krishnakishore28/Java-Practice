package com.wipro.Hibernate4;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="carowner")
public class CarOwner {
	@Id
	@Column
	private int ownerId;
	@Column
	private String OwnerName;
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="regNo")  
	@OrderColumn(name="type")  
	private List<CarDetails> cars;
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public List<CarDetails> getCars() {
		return cars;
	}
	public void setCars(List<CarDetails> cars) {
		this.cars = cars;
	}
	public CarOwner() {
		super();
	}
	@Override
	public String toString() {
		return "CarOwner [ownerId=" + ownerId + ", OwnerName=" + OwnerName + ", cars=" + cars + "]";
	}
	
}
