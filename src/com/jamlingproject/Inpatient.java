package com.jamlingproject;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Inpatient extends Patient {
//	
//	ArrayList<Patient>inPatient_list=new ArrayList();

	public Inpatient(String first_name,String date,
			String phone_number, String insurance) {

		this.first_name = first_name;

		this.date = date;
		this.phone_number = phone_number;
		this.insurance = insurance;

	}

	public void getbed_assigned(String first_name) {

		System.out.println(first_name + " assigned a bed");
	}

	
}
