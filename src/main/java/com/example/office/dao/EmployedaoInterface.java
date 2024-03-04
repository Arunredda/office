package com.example.office.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.office.vo.EmployeeVO;

public interface EmployedaoInterface extends JpaRepository<EmployeeVO, Integer> {
	
	

}
