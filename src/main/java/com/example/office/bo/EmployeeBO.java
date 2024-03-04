package com.example.office.bo;

public class EmployeeBO {
	
	private int id;
	private String empName;
	private String empEmailID;
	private String empDesignation;
	private String empLocation;
	private long empMobileNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmailID() {
		return empEmailID;
	}
	public void setEmpEmailID(String empEmailID) {
		this.empEmailID = empEmailID;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public long getEmpMobileNumber() {
		return empMobileNumber;
	}
	public void setEmpMobileNumber(long empMobileNumber) {
		this.empMobileNumber = empMobileNumber;
	}
	
}
