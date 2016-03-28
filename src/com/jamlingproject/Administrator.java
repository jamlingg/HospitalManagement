package com.jamlingproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.*;

public class Administrator{
	
	public Administrator() {
	
	
	}
	
	ArrayList<Patient>personList = new ArrayList<Patient>();
	
	HashMap <String,Patient> hashMap = new HashMap <String,Patient>();

	Scanner in = new Scanner(System.in);
	String name,dob,phone,insurance;
	
	/*@Override
	public String toString(){
		return name;
		
	}*/

	public  void PatientInfo(){
		
		Patient patient = new Patient();
		
		System.out.println("Please entername");
		patient.setFirst_name(in.next());
		System.out.println("Please enter Date of Birth");
		patient.setdate(in.next());
		System.out.println("Please enter Phone number");
		patient.setPhone_number(in.next());
		System.out.println("Please enter Insurance Carrier");
		patient.setInsurance(in.next());
		personList.add(patient);
		
		
		for (Patient newPatient : personList){
			hashMap.put(patient.getFirst_name(),newPatient);
		}

		
	
	}
		
		
	public void optionChecker(){
		
		int status;
		for(int i=0;i<personList.size();i++){
			
			name=personList.get(i).getFirst_name();
			dob=personList.get(i).getdate();
			phone=personList.get(i).getPhone_number();
			insurance=personList.get(i).getInsurance();
		
			}
		
		do {
			System.out.println("-----------------------choose any one of the following");
			
			System.out.println(" 1.Check in");
			System.out.println(" 2.List");
			System.out.println(" 3.Check out");
			System.out.println(" 4.Feedback");
			System.out.println(" 5.exit");
			status = in.nextInt();
		
			if(status == 1){
				
				PatientInfo();
				optionChecker();
						
				}
			else if (status == 2 ){
				System.out.print(" Name ");System.out.print(" DOB ");System.out.print(" Phone ");System.out.println(" Insurance ");
				Set setOfKeys = hashMap.keySet();
				Iterator iterator = setOfKeys.iterator();
				
				while (iterator.hasNext()){
					String key = (String)iterator.next();
					System.out.println("Key:"+key+",Value:"+hashMap.get(key).getFirst_name());
				}
				
				/*
				for(int i=0;i<personList.size();i++){
					
					System.out.print(personList.get(i).getFirst_name());System.out.print("|");
					System.out.print(personList.get(i).getdate());System.out.print("|");
					System.out.print(personList.get(i).getPhone_number());System.out.print("|");
					System.out.print(personList.get(i).getInsurance());System.out.println("|");
				
				
					}*/
				
				
				}
			else if (status == 3){
				
				{
					
					
					
				}
				
				
			}
			
			else if (status == 5){
				System.out.println(" Exiting....");
				System.exit(0);
				
			}
			else {
				System.out.println(" Bad input");
				optionChecker();
					
				
			}
				
			
				
		} while (status == 5);{
			
			System.exit(0);
			
			}
		
		
			
		
		in.close();
	}
	
	

	
	}
