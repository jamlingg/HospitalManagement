package com.jamlingproject;

import java.util.ArrayList;
import java.util.Date;

public class Patient {
	public String first_name,date, phone_number, insurance;

	
//\	ArrayList<Patient>personList = new ArrayList<Patient>();
	
	
	
	
	
	public String getdate() {
		return date;
	}


	public void setdate(String date) {
		this.date = date;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getInsurance() {
		return insurance;
	}


	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	
	
	public void getcheckin(String first_name){
		
		System.out.println(first_name+" has been Checked in");
		
		
		
		
	}
	public void checkout(String first_name){
		
		System.out.println(first_name+"Checked out");
		
		
	}
	public void bed_vacant()
	{
	
	
	}


}
