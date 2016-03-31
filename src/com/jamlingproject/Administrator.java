package com.jamlingproject;

import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.*;
public class Administrator extends JFrame{
	

    
	
	
	public Administrator() {
		

	
	}
	
	ArrayList<Patient>personList = new ArrayList<Patient>();
	
	HashMap <String,Patient> hashMap = new HashMap <String,Patient>();

	Scanner in = new Scanner(System.in);
	String pat;
	
	/*@Override
	public String toString(){
		return name;
		
	}*/

	public  void PatientInfo(){
		
		Patient patient = new Patient();
			JPanel form = new JPanel();
			
			
			
			setSize(400, 200);
	        setBackground(Color.BLACK);
	        setTitle("Patient Form");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //pnlButton.setLayout(null);
	        setVisible(true);
	        
	   /*try{
		
			System.out.println("Please entername");
			patient.setFirst_name(in.next());
			System.out.println("Please enter Date of Birth");
			patient.setdate(in.next());
			System.out.println("Please enter Phone number");
			patient.setPhone_number(in.next());
			System.out.println("Please enter Insurance Carrier");
			patient.setInsurance(in.next());

		}  catch (InputMismatchException e){
			System.out.println(" INVALID Error!");
			PatientInfo();
			
			}
		personList.add(patient);
		*/
			
		for (Patient newPatient : personList){
				hashMap.put(patient.getFirst_name(),newPatient);
				}
		
	
		}
		
		
	public void optionChecker(){
		
		int status;
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
				Set setOfKeys = hashMap.keySet();
				Iterator iterator = setOfKeys.iterator();
				
				while (iterator.hasNext()){
					String key = (String)iterator.next();
					System.out.println("Name:"+key+",Phone:"+hashMap.get(key).getPhone_number()+",DOB: "+hashMap.get(key).getdate()+",Insurance: "+hashMap.get(key).getInsurance());
		
					}
				
				}
			else if (status == 3){
				
				
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
