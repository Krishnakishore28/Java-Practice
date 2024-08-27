 
package com.wipro.controllers.DTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class FormDTo {
	@NotBlank(message="	* username required")
	@Size(min=3,max=10,message=" * username size should be 3-15")
	private String username;
	@NotBlank(message="	* crushname required")
	@Size(min=3,max=10,message=" * crushname size should be 3-15")
	private String crushname;
	@AssertTrue(message="* you should agree terms and conditions")
	private Boolean termsAndConditions;
	public Boolean getTermsAndConditions() {
		return termsAndConditions;
	}
	public void setTermsAndConditions(Boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
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
