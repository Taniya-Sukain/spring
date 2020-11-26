package com.epsilon.training.webservices.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID=-4980206847383335245L;
	private int Id;
	private String Name;
	private int Salary;
	private String Gender;
	
	public Employee() {
		
	
	}

	public Employee(int id, String name, int salary, String gender) {
		
		this.Id = id;
		this.Name = name;
		this.Salary = salary;
		this.Gender = gender;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
	
	public String toString() {
		return "Name: " +Name+ "Salary: " +Salary+ "Gender:" +Gender;
	}
}
