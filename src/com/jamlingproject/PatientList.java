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

	public PatientList() {

		// Constructor

	}

	// //HashMap <String,Patient> hashMap = new HashMap <String,Patient>();

	public static TableModel toTableModel(Map<String, Patient> map) {

		Administrator admin = new Administrator();
		// //System.out.println("Well Hello there");

		DefaultTableModel model = new DefaultTableModel(new Object[] {
				"First Name", "Last Name", "Date Of Birth", "Phone Number",
				"Insurance", "Patient Type", "BED" }, 0);
		for (Map.Entry<String, Patient> entry : map.entrySet()) {
			if (entry.getValue().getPatientType() == "INPATIENT") {
				model.addRow(new Object[] {
						entry.getKey().substring(0, 1).toUpperCase()
								+ entry.getKey().substring(1),
						entry.getValue().getLast_name().substring(0, 1)
								.toUpperCase()
								+ entry.getValue().getLast_name().substring(1),
						entry.getValue().getdate(),
						entry.getValue().getPhone_number(),
						entry.getValue().getInsurance().substring(0, 1)
								.toUpperCase()
								+ entry.getValue().getInsurance().substring(1),
						entry.getValue().getPatientType(),
						entry.getValue().getAssignedBed() });
			} else if (entry.getValue().getPatientType() == "OUTPATIENT") {
				model.addRow(new Object[] {
						entry.getKey().substring(0, 1).toUpperCase()
								+ entry.getKey().substring(1),
						entry.getValue().getLast_name().substring(0, 1)
								.toUpperCase()
								+ entry.getValue().getLast_name().substring(1),
						entry.getValue().getdate(),
						entry.getValue().getPhone_number(),
						entry.getValue().getInsurance().substring(0, 1)
								.toUpperCase()
								+ entry.getValue().getInsurance().substring(1),
						entry.getValue().getPatientType(),
						entry.getValue().getPatientType() });

			}
			System.out.println(entry.getValue());
			// return model;
		}

		return model;
	}

}
