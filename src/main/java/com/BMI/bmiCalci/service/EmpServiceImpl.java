package com.BMI.bmiCalci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.BMI.bmiCalci.pojo.Emp_Pojo;
import com.BMI.bmiCalci.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private EmpServiceImpl(JavaMailSender javaMailSender) {
		this.javaMailSender=javaMailSender;
	}
	
	public void sendMail(String empName, int age, double height, double weight, double bmi, String mali) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(mali);
		sm.setSubject("BMI Calculator");
		sm.setText("Thank you MR/MISS "+empName+ " for checking your BMI...... your height is "+height+ " Your weight is " +weight+ 
				" your BMI is "+ bmi);
		javaMailSender.send(sm);
		
	}

	@Override
	public Emp_Pojo create(Emp_Pojo emp_Pojo) {
		
		double heightInMeters = emp_Pojo.getHeight() / 100.0;
		double weight = emp_Pojo.getWeight();

		if (heightInMeters > 0) {
		    double bmi = weight / (heightInMeters * heightInMeters);
		    emp_Pojo.setBmi(bmi);
		} else {
		    emp_Pojo.setBmi(0.0);
		}
		
		EmpServiceImpl impl = new EmpServiceImpl(javaMailSender);
			impl.sendMail(emp_Pojo.getEmpName(), emp_Pojo.getAge(), emp_Pojo.getHeight(), emp_Pojo.getWeight(), emp_Pojo.getBmi(), emp_Pojo.getMail());
		

		return empRepo.save(emp_Pojo);
	}

	@Override
	public List<Emp_Pojo> get() {
		return empRepo.findAll();
	}

	public Emp_Pojo findEmpByBmi(double bmi) {
		return empRepo.findByBmi(bmi);
	}


}
