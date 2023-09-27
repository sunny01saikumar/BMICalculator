package com.BMI.bmiCalci.service;

import java.util.List;

import com.BMI.bmiCalci.pojo.Emp_Pojo;

public interface EmpService {

	public Emp_Pojo create(Emp_Pojo emp_Pojo);
	
	public List<Emp_Pojo> get();
	
}
