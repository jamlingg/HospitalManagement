package com.jamlingproject;

import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
public class Administrator extends JFrame{
	

    
	
	
	public Administrator() {
		

	
	}
	
	ArrayList<Patient>personList = new ArrayList<Patient>();
	
	HashMap <String,Patient> hashMap = new HashMap <String,Patient>();
	Patient patient = new Patient();
	Scanner in = new Scanner(System.in);
	String pat;
	int bed = 200;
	
	
	/*@Override
	public String toString(){
		return name;
		
	}*/
	
    
	List<JTextField> tfList= new ArrayList<JTextField>();
	String[] options={" ","INPATIENT","OUTPATIENT"};
	JLabel type = new JLabel("Patient Type");

	public  void PatientInfo(){
			
			//final Patient patient = new Patient();
			//final List<JTextField> tfList= new ArrayList<JTextField>();
			JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JLabel fname = new JLabel("First Name");
			JLabel dob = new JLabel("Date Of Birth");
			JLabel pn = new JLabel("Phone Number");
			JLabel insurance = new JLabel("Insurance Carrier");
			JLabel type = new JLabel("Patient Type");
			final JTextField FirstName = new JTextField(20);
			final JTextField dateOfBirth = new JTextField(20);
			final JTextField phoneNumber = new JTextField(10);
			final JTextField insuranceCarrier = new JTextField(15);
			final JComboBox patientType=new JComboBox(options);
			
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
			panel.add(type);
			panel.add(patientType);
			
			panel.add(Box.createRigidArea(new Dimension(100,0)));
			panel.add(save);
			tfList.add(FirstName);
			tfList.add(dateOfBirth);
			tfList.add(phoneNumber);
			tfList.add(insuranceCarrier);
			
			setSize(800, 200);
	        setBackground(Color.BLACK);
	        setTitle("Patient Form");
	        setLocationRelativeTo(null);
	        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	        pack();
	        ///dispose();
	        setVisible(true);
	       // final int bed = 200;
	        save.addActionListener(new ActionListener(){
		        public void actionPerformed(ActionEvent e)
		        {
		        	Patient patient1 = new Patient();
		            String patientName = FirstName.getText();
		            String date = dateOfBirth.getText();
		            String phone = phoneNumber.getText();
		            String carrier = insuranceCarrier.getText();
		            String ptype = (String) patientType.getSelectedItem();
		            patient1.setFirst_name(patientName);
		            patient1.setdate(date);
		            patient1.setPhone_number(phone);
		            patient1.setInsurance(carrier);
		            patient1.setPatientType(ptype);
		            patient.setFirst_name(patientName);
		            patient.setdate(date);
		            patient.setPhone_number(phone);
		            patient.setInsurance(carrier);
		            patient.setPatientType(ptype);
		            if (ptype =="INPATIENT"){
		            	
		            	System.out.println("Bed No."+bed+" is assigned to "+patientName);
		            	patient1.setAssignBed(bed);
		            	patient.setAssignBed(bed);
		            	bed++;
		            }
					hashMap.put(patient1.getFirst_name(),patient1);
					
		            final JFrame f=new JFrame("Confirmation");
		            JButton confirm = new JButton("Confirm");
		            JTable IPT = new JTable(InpatientTable());
		            JTable OPT = new JTable(OutpatientTable());
		            JPanel myPanel = new JPanel();
		            if (ptype =="INPATIENT"){
		            	myPanel.add(new JScrollPane(IPT));
		            }
		            else{
		            	myPanel.add(new JScrollPane(OPT));
		            }
		      
		            myPanel.add(confirm);
		            confirm.addActionListener(new ActionListener(){
		            	public void actionPerformed(ActionEvent e){
		            		
		            		
		            		for (JTextField tf : tfList){
		            			tf.setText("");
		            			
		            		}
		            		//patient.getcheckin(patient.getFirst_name());
		            		dispose();
		            		f.dispose();
		            		
		  		
		            	}
		            	
		      
		            });
		            
		            f.add(myPanel);
		            f.pack();
		            f.setVisible(true);
		            
		            
		            
		            
		        }
		    	});
		
	
		}

		
	public TableModel InpatientTable (){
		Administrator admin = new Administrator();
		
		DefaultTableModel model = new DefaultTableModel(new Object[]{"Name","Date Of Birth","Phone Number","Insurance","Patient Type","BED"},0);
		
			model.addRow(new Object[]{patient.getFirst_name(),patient.getdate(),patient.getPhone_number(),patient.getInsurance(),patient.getPatientType(),patient.getAssignedBed()});
				
		
		return model;
		
		
		 
	}
	public  TableModel OutpatientTable (){
		//Patient patient = new Patient();
		
		DefaultTableModel model = new DefaultTableModel(new Object[]{"Name","Date Of Birth","Phone Number","Insurance","Patient Type"},0);
		
			model.addRow(new Object[]{patient.getFirst_name(),patient.getdate(),patient.getPhone_number(),patient.getInsurance(),patient.getPatientType()});
				
				
		
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
