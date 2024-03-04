package com.example.office.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.office.bo.EmployeeBO;
import com.example.office.bo.Responce;
import com.example.office.dao.EmployedaoInterface;
import com.example.office.vo.EmployeeVO;



@Service
public class EmployeeServiceImpl  implements EmployeeServiceInterface{
	
	@Autowired
	private  EmployedaoInterface employedaoInterface;

	@Override
	public Responce saveEmploye(EmployeeBO employeeBO) {
		// TODO Auto-generated method stub
		EmployeeVO  employeeVO=new EmployeeVO();
		employeeVO.setId(employeeBO.getId());
		employeeVO.setEmpName(employeeBO.getEmpName());
		employeeVO.setEmpEmailID(employeeBO.getEmpEmailID());
		employeeVO.setEmpDesignation(employeeBO.getEmpDesignation());
		employeeVO.setEmpMobileNumber(employeeBO.getEmpMobileNumber());
		employeeVO.setEmpLocation(employeeBO.getEmpLocation());
		
		
		Responce responce=new Responce();
		
		try {
			EmployeeVO employeeID= employedaoInterface.save(employeeVO);
			if(0<employeeID.getId()) {
				responce.setMessage("OK working Fine");
				return responce;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		responce.setMessage("Not OK working Fine");
		return  responce;
		
		
	}

}
