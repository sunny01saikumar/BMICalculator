package com.BMI.bmiCalci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BMI.bmiCalci.pojo.Emp_Pojo;
import com.BMI.bmiCalci.service.EmpServiceImpl;

@RestController
@CrossOrigin
public class EmpController {
	
	@Autowired
	private EmpServiceImpl empServiceImpl;
	
	@PostMapping("/insert")
	public ResponseEntity<Emp_Pojo> createData(@RequestBody Emp_Pojo emp_Pojo){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(empServiceImpl.create(emp_Pojo));
		
	}
	
	@GetMapping("/getData")
	public ResponseEntity<List<Emp_Pojo>> getData(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(empServiceImpl.get());
		
	}
	
	@GetMapping("/bmi/{bmi}")
	public ResponseEntity<Emp_Pojo> bybmi(@PathVariable double bmi){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(empServiceImpl.findEmpByBmi(bmi));
		
	}

}
