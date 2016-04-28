package com.jamlingproject;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PatientList extends JFrame {
	
	public PatientList(){
		
		
		//Constructor
		
	} 
		
////HashMap <String,Patient> hashMap = new HashMap <String,Patient>();
	
public static TableModel toTableModel (Map<String,Patient>map){

		Administrator admin = new Administrator();
		////System.out.println("Well Hello there");

		DefaultTableModel model = new DefaultTableModel(new Object[]{"Name","Date Of Birth","Phone Number","Insurance","Patient Type","BED"},0);
		for (Map.Entry<String, Patient>entry : map.entrySet()){
			model.addRow(new Object[]{
					entry.getKey(),entry.getValue().getdate(),entry.getValue().getPhone_number(),entry.getValue().getInsurance(),entry.getValue().getPatientType()
					} );
			System.out.println(entry.getValue());
			return model;
			//System.out.println("Well Hello there");
		}
		
		return model;
		}

}
