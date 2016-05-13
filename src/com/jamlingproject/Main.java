package com.jamlingproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {


	public static void main(String[] args) {
		
		final Administrator admin = new Administrator();
		final PatientList patientList = new PatientList();
		
		JFrame myframe = new JFrame();
		
	    // JPanel
	    JPanel pnlButton = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    // Buttons
	    JButton checkIn = new JButton("Check In");
	    checkIn.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e)
	        {
	            admin.PatientInfo();
	        }
	    	});
	    
	    JButton list = new JButton("List Of Patient");
	    list.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				JFrame f=new JFrame("Patient List");
				JPanel panel = new JPanel();
				JTable t = new JTable(PatientList.toTableModel(admin.hashMap));
				panel.add(new JScrollPane(t));
				f.add(panel);
		        f.pack();
		        f.setVisible(true);
				
			
				
			}
	    	
	    });
	    JButton checkOut = new JButton("Check Out");
	    JButton feedBack = new JButton("Feed Back");
	    JButton Exit = new JButton("Exit");
		
		   // FlightInfo setbounds
		checkIn.setBounds(60, 400, 220, 30);

        // JPanel bounds
      
        pnlButton.setBounds(0, 500, 100, 100);
        // Adding to JFrame
        pnlButton.add(checkIn);
        pnlButton.add(list);
        pnlButton.add(checkOut);
        pnlButton.add(feedBack);
        pnlButton.add(Exit);
        myframe.add(pnlButton);
        
        

        // JFrame properties
        myframe.setSize(400, 200);
        myframe.setBackground(Color.BLACK);
        myframe.setTitle("Hospital Management System");
        myframe.setLocationRelativeTo(null);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pnlButton.setLayout(null);
        myframe.setVisible(true);
        myframe.pack();
		//JFrame myFrame = new JFrame("This is my frame");

		//myFrame.setSize(300,400);

		//myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//myFrame.setVisible(true);

		
		
		//admin.optionChecker();
		//admin.PatientInfo();
	
	
	}
		
}
