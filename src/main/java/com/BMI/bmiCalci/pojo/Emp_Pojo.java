package com.BMI.bmiCalci.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Emp_Pojo {
	@Id
	@GeneratedValue
	private int id;
	private String empName;
	private int age;
	private String gender;
	private double weight;
	private double height;
	private double bmi;
	private String password;
	private String mail;

	public Emp_Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp_Pojo(int id, String empName, int age, String gender, double weight, double height, double bmi,
			String password, String mail) {
		super();
		this.id = id;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;
		this.password = password;
		this.mail = mail;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Emp_Pojo [id=" + id + ", empName=" + empName + ", age=" + age + ", gender=" + gender + ", weight="
				+ weight + ", height=" + height + ", bmi=" + bmi + ", password=" + password + ", mail=" + mail + "]";
	}
	
	

	}
