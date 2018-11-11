package com.sanjay.springbootswagger.model;

public class User {
	private String userName;
	private int salary;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public User(String userName, int salary) {
		super();
		this.userName = userName;
		this.salary = salary;
	}
	
}