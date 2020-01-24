package com.app.arraylist;


public class Employee {

	int id;
	String name;
	Double salary;
	Double jd;
	
	
	
	public Employee(int id, String name, Double salary, double jd) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.jd = jd;
	}
	public Employee() {
		super();
	}
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getJd() {
		return jd;
	}
	public void setJd(Double jd) {
		this.jd = jd;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", jd=" + jd + "]";
	}
	
	
	
}
