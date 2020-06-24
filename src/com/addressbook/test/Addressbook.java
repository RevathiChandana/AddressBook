package com.addressbook.test;
import com.addressbook.model.Person;
public class Addressbook{
	public static void main(String[] arg){
		Person newPerson=new Person();
		newPerson.setname("Revathi");
		newPerson.setEmailId("RevathiChandana30@gmail.com");
		newPerson.setMobileNumber(76809);
		System.out.println("person name : "+newPerson.getName());
		 System.out.println("person emailId : "+newPerson.getEmailId());

	}
}
