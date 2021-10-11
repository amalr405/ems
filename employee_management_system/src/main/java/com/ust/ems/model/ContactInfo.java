package com.ust.ems.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * EmployeeBasicDetails model class 

 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Contact_Information")
public class ContactInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	

	@Column(name = "Employee_ID_Number" )
	int Employee_ID_Number;

	@Column(name = "c_First_Name")
	String c_First_Name;
	@Column(name = "c_Middle_Name")
	String c_Middle_Name;

	@Column(name = "c_Last_Name")
	String c_Last_Name;

	@Column(name = "c_Cellular_Phone")
	int c_Cellular_Phone;

	@Column(name = "c_Home_Phone")
	int c_Home_Phone;

	
	

	@Column(name = "c_City")
	String c_City;

	@Column(name = "c_Address")
	String c_Address;

	

	public int getEmployee_ID_Number() {
		return Employee_ID_Number;
	}

	public void setEmployee_ID_Number(int Employee_ID_Number) {
		this.Employee_ID_Number = Employee_ID_Number;
	}

	

	public String getc_First_Name() {
		return c_First_Name;
	}

	public void setc_First_Name(String c_First_Name) {
		this.c_First_Name = c_First_Name;
	}
	public String getc_Middle_Name() {
		return c_Middle_Name;
	}

	public void setc_Middle_Name(String c_Middle_Name) {
		this.c_Middle_Name= c_Middle_Name;
	}
	public String getc_Last_Name() {
		return c_First_Name;
	}

	public void setc_Last_Name(String c_Last_Name) {
		this.c_Last_Name = c_Last_Name;
	}

	

	public int getc_Cellular_Phone() {
		return c_Cellular_Phone;
	}

	public void setc_Cellular_Phone(int c_Cellular_Phone) {
		this.c_Cellular_Phone = c_Cellular_Phone;
	}

	public int getc_Home_Phone() {
		return c_Home_Phone;
	}

	public void setc_Home_Phone(int c_Home_Phone) {
		this.c_Home_Phone = c_Home_Phone;
	}
	public String getc_City() {
		return c_City;
	}

	public void setc_City(String c_City) {
		this.c_City = c_City;
	}
	public String getc_Address() {
		return c_Address;
	}

	public void setc_Address(String c_Address) {
		this.c_Address = c_Address;
	}
	
	}



