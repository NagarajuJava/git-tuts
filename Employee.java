package com.ojas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {
	
	public int id;
	public String name;
	public int age;
	public String gender;
	public String dept;
	public int yearofjoin;
	public double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYearofjoin() {
		return yearofjoin;
	}

	public void setYearofjoin(int yearofjoin) {
		this.yearofjoin = yearofjoin;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, int age, String gender, String dept, int yearofjoin, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.yearofjoin = yearofjoin;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + age + "\t" + gender + "\t" + dept + "\t" + yearofjoin + "\t" + salary;

	}

}

 

