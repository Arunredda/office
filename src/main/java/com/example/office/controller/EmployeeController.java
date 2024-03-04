package com.example.office.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.office.bo.EmployeeBO;
import com.example.office.bo.Responce;
import com.example.office.service.EmployeeServiceInterface;


@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api") 
public class EmployeeController {
	
	/*
	 * @Autowired private EmployeeServiceInterface employeeServiceInterface;
	 */
	
	
	@Autowired	
	private EmployeeServiceInterface employeeServiceInterface;
	
	
@GetMapping("/")
public String firstMethod() {
	return "My First Method";
	
}

@PostMapping("/createEmploye")
 public  ResponseEntity<Responce>  createEmploye(@RequestBody EmployeeBO  employeeBO) {
	System.out.println(employeeBO.getEmpDesignation());
	System.out.println(employeeBO.getEmpEmailID());
	System.out.println(employeeBO.getEmpMobileNumber());
	System.out.println(employeeBO.getEmpName());
	//String message=employeeServiceInterface.saveEmploye(employeeBO);
	 return  ResponseEntity.ok(employeeServiceInterface.saveEmploye(employeeBO));
	 
 }


}
