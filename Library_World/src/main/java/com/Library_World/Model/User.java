package com.Library_World.Model;

public class User {
	private String Name,Gender,Email,password,dob;
	private String Dept,UnivRoll;
	private int clgcode;	
	public User(String name, String gender, String email, String password, String dob, String dept,int clgcode,String univRoll) 
	{
		super();
		Name = name;
		Gender = gender;
		Email = email;
		this.password = password;
		this.dob = dob;
		Dept = dept;
		UnivRoll = univRoll;
		this.clgcode = clgcode;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getUnivRoll() {
		return UnivRoll;
	}
	public void setUnivRoll(String univRoll) {
		UnivRoll = univRoll;
	}
	public int getClgcode() {
		return clgcode;
	}
	public void setClgcode(int clgcode) {
		this.clgcode = clgcode;
	}
}
