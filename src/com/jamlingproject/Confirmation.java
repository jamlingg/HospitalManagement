package com.jamlingproject;

import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;







//import javax.swing.JFrame;
import javax.swing.*;

public class Confirmation extends JFrame {
	
	public Confirmation(){
		
		}
	//HashMap <String,String> hashMap = new HashMap <String,String>();
		Patient patient = new Patient();
	public void getConfirmation(String name,String date,String phone,String carrier){
		//System.out.println("Name");
		HashMap <String,Patient> hashMap = new HashMap <String,Patient>();
		ArrayList<String> personList = new ArrayList<String>();
		JFrame myFrame = new JFrame("Confirmation");
		patient.setFirst_name(name);
		patient.setdate(date);
        patient.setPhone_number(phone);
        patient.setInsurance(carrier);
        
        Set setOfKeys = hashMap.keySet();
		Iterator iterator = setOfKeys.iterator();
		
		while (iterator.hasNext()){
			String key = (String)iterator.next();
			System.out.println("Name:"+key+",Phone:"+hashMap.get(key).getPhone_number()+",DOB: "+hashMap.get(key).getdate()+",Insurance: "+hashMap.get(key).getInsurance());

			}
        
		JTable table = new JTable();
		personList.add(name);
        personList.add(date);
        personList.add(phone);
        personList.add(carrier);
        
		
		myFrame.setSize(300,400);

		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		myFrame.setVisible(true);
		
		
	}
	

}
