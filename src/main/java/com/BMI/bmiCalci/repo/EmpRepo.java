package com.BMI.bmiCalci.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BMI.bmiCalci.pojo.Emp_Pojo;

public interface EmpRepo extends JpaRepository<Emp_Pojo, Integer>{

	public Emp_Pojo findByBmi(double bmi);
}
