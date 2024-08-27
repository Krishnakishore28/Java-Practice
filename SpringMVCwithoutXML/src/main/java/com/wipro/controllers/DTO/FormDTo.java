package com.wipro.controllers.DTO;

import javax.validation.constraints.NotNull;

public class FormDTo {
	@NotNull(message="* username shouldn't be null")
	private String username;
	private String crushname;
	public FormDTo(String username, String crushname) {
		super();
		this.username = username;
		this.crushname = crushname;
	}
	@Override
	public String toString() {
		return "FormDTo [username=" + username + ", crushname=" + crushname + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCrushname() {
		return crushname;
	}
	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}
	public FormDTo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
