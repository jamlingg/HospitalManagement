package com.jamlingproject;

import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
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
		
			final Patient patient = new Patient();
			
			JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel fname = new JLabel("First Name");
			JLabel dob = new JLabel("Date Of Birth");
			JLabel pn = new JLabel("Phone Number");
			JLabel insurance = new JLabel("Insurance Carrier");
			final JTextField FirstName = new JTextField(20);
			final JTextField dateOfBirth = new JTextField(20);
			final JTextField phoneNumber = new JTextField(10);
			final JTextField insuranceCarrier = new JTextField(15);
			JButton save = new JButton("Save");
			
			add(panel);
			panel.add(fname);
			FirstName.setFont(FirstName.getFont().deriveFont(15f));
			panel.add(FirstName);//
			panel.add(dob);
			dateOfBirth.setFont(dateOfBirth.getFont().deriveFont(15f));
			panel.add(dateOfBirth);//
			panel.add(pn);
			phoneNumber.setFont(phoneNumber.getFont().deriveFont(15f));
			panel.add(phoneNumber);//
			panel.add(insurance);
			insuranceCarrier.setFont(insuranceCarrier.getFont().deriveFont(15f));
			panel.add(insuranceCarrier);//
			panel.add(Box.createRigidArea(new Dimension(100,0)));
			panel.add(save);
			
			
			setSize(800, 200);
	        setBackground(Color.BLACK);
	        setTitle("Patient Form");
	        setLocationRelativeTo(null);
	        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	        pack();
	        setVisible(true);
	        
	        save.addActionListener(new ActionListener(){
		        public void actionPerformed(ActionEvent e)
		        {
		            String patientName = FirstName.getText();
		            
		            String date = dateOfBirth.getText();
		            String phone = phoneNumber.getText();
		            String carrier = insuranceCarrier.getText();
		            patient.setFirst_name(patientName);
		            patient.setdate(date);
		            patient.setPhone_number(phone);
		            patient.setInsurance(carrier);
		          
		            personList.add(patient);
		            for (Patient newPatient : personList){
						hashMap.put(patientName,newPatient);
						}
		            
		            
//		            Set setOfKeys = hashMap.keySet();
//					Iterator iterator = setOfKeys.iterator();
//					
//					while (iterator.hasNext()){
//						String key = (String)iterator.next();
//						//System.out.println("Name:"+key+",Phone:"+hashMap.get(key).getPhone_number()+",DOB: "+hashMap.get(key).getdate()+",Insurance: "+hashMap.get(key).getInsurance());
//			
//						}
					
					JTable t = new JTable(toTableModel(hashMap));
		            JPanel myPanel = new JPanel();
		            myPanel.add(new JScrollPane(t));
		            myPanel.add(t);
		            JFrame f=new JFrame("Confirmation");
		            f.add(myPanel);
		          
		            
		            //f.setSize(400,400);
		            f.pack();
		           // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		            f.setVisible(true);
		            
					//Confirmation confirmation = new Confirmation();
		            //confirmation.getConfirmation(patientName,date,phone,carrier);
		            
		            
		            
		        }
		    	});
	        
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
		
			
		for (Patient newPatient : personList){
				hashMap.put(patient.getFirst_name(),newPatient);
				}
		*/
		
	
		}
		
	public static TableModel toTableModel (Map<String,Patient>map){
		DefaultTableModel model = new DefaultTableModel(new Object[]{"Key","Value","Value","Value"},0);
		for (Map.Entry<String, Patient>entry : map.entrySet()){
			model.addRow(new Object[]{
					entry.getKey(),entry.getValue().getdate(),entry.getValue().getPhone_number(),entry.getValue().getInsurance()
					} );
			return model;
			
		}
		
		return model;
		
		
		 
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
					//System.out.println("Name:"+key+",Phone:"+hashMap.get(key).getPhone_number()+",DOB: "+hashMap.get(key).getdate()+",Insurance: "+hashMap.get(key).getInsurance());
		
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
