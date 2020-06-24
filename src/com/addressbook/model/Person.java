package com.addressbook.model;
public class Person{
	String emailId;
	String name;
	double mobileNumber;
	String city;
	int zipCode;

	public String getEmailId(){
	 return this.emailId;
	}

	public String getName(){
	return this.name;
	}

	public double getMobileNumber(){
	return this.mobileNumber;
	}

	public String getCity(){
	return this.city;
	}

	public int getZipCode(){
	return this.zipCode;
	}

	public void setEmailId(String emailId){
		this.emailId=emailId;
	}

	public void setname(String name){
		this.name=name;
	}

	public void setMobileNumber(double mobileNumber){
		this.mobileNumber=mobileNumber;
	}

	public void setcity(String city){
		this.city=city;
	}

	public void setZipCode(int zipCode){
		this.zipCode=zipCode;
	}
}
