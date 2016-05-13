package com.jamlingproject;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Patient {
	public String first_name,date, phone_number, insurance,type;
	public int bed;
	
	
	
	
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
	
	public String getPatientType() {
		return type;
	}


	public void setPatientType(String type) {
		this.type = type;
	}
	
	public  void setAssignBed(int bed){
	
		this.bed = bed;
	}
	public int getAssignedBed(){
		return bed;
		
		
	}
	public void getcheckin(String firstName){
		
		JFrame frame = new JFrame();
		JOptionPane optionPane= new JOptionPane(firstName+" has checked in ");
		JDialog dialog=optionPane.createDialog(frame," ");
		dialog.setVisible(true);
		dialog.dispose();
		
}

	
	
	public void checkout(String first_name){
		
		System.out.println(first_name+"Checked out");
		
		
	}
	public void bed_vacant()
	{
	
	
	}


}
