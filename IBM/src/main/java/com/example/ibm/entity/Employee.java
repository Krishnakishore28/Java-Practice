package com.example.ibm.entity;

public class Employee {
	private Integer empId;
	private String empName;
	private String project;
	private String location;
	private String odc;
	private Integer floor;
	private String projectApprover;
	private String locationApprover;
	private String floorAssigner;
	public String getProjectApprover() {
		return projectApprover;
	}
	public void setProjectApprover(String projectApprover) {
		this.projectApprover = projectApprover;
	}
	public String getLocationApprover() {
		return locationApprover;
	}
	public void setLocationApprover(String locationApprover) {
		this.locationApprover = locationApprover;
	}
	public String getFloorAssigner() {
		return floorAssigner;
	}
	public void setFloorAssigner(String floorAssigner) {
		this.floorAssigner = floorAssigner;
	}
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOdc() {
		return odc;
	}
	public void setOdc(String odc) {
		this.odc = odc;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", project=" + project + ", location=" + location
				+ ", odc=" + odc + ", floor=" + floor + ", projectApprover=" + projectApprover + ", locationApprover="
				+ locationApprover + ", floorAssigner=" + floorAssigner + ", status=" + status + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}