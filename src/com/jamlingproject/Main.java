package com.jamlingproject;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//JFrame myFrame = new JFrame("This is my frame");

		//myFrame.setSize(300,400);

		//myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//myFrame.setVisible(true);

		
		Administrator admin = new Administrator();
		admin.optionChecker();
		admin.PatientInfo();
	
	
	}
		
}
