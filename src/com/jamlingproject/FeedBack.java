package com.jamlingproject;


import java.util.Date;
import java.util.Scanner;

public class FeedBack extends Patient {


	public void getFeedback(String first_name, String admittance_date,String Comments) {

		this.first_name = first_name;

		System.out.println("enter the date of Admittance");
		Scanner in = new Scanner(System.in);
		String date = in.next();
		// DateFormat dateformatter = new SimpleDateFormat("dd/mm/yyyy");
		// try {
		// admittance_date = new Date();
		// admittance_date = dateformatter.parse(date);
		//
		// } catch (ParseException e) {
		// System.out.println("Unable to parse " + date);
		// }

		System.out.println("Please enter some Comments");
		String comments = in.next();

		System.out.println(first_name + "was admitted on " + admittance_date
				+ " and commented " + comments);

	}
	
	public void getFeedbackDetails()
	{
		
		
		
		
	}

}
