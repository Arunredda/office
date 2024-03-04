package com.example.office.vo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "empName",nullable = false)
	private String empName;
	
	@Column(name = "empEmailID")
	private String empEmailID;
	
	@Column(name = "empDesignation")
	private String empDesignation;
	
	@Column(name = "empLocation")
	private String empLocation;
	
	@Column(name = "empMobileNumber")
	private long empMobileNumber;
	
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
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
