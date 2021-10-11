package com.ust.ems.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




  //contains the working history data of the employee.

@Entity
@Table(name = "employee_working_history")
public class WorkHistory {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Employee_Id_Number" )
	int Employee_Id_Number;

	@Column(name = "companyName")
	String companyName;

	@Column(name = "employerName")
	String employerName;

	@Column(name = "employerAddress")
	String employerAddress;

	@Column(name = "employerCellularPhone")
	String employerCellularPhone;

	@Column(name = "employerOfficePhone")
	String employerOfficePhone;

	@Column(name = "previousQualification")
	String previousQualification;

	@Column(name = "previousExperience")
	String previousExperience;

	@Column(name = "pStartDateDay")
	int pStartDateDay;

	@Column(name = "pStartDateMonth")
	int pStartDateMonth;

	@Column(name = "pStartDateYear")
	int pStartDateYear;

	@Column(name = "pEndDateDay")
	int pEndDateDay;

	@Column(name = "pEndDateMonth")
	int pEndDateMonth;

	@Column(name = "pEndDateYear")
	int pEndDateYear;

	public int getEmployeeIdNumber() {
		return Employee_Id_Number;
	}

	public void setEmployeeIdNumber(int Employee_Id_Number) {
		this.Employee_Id_Number = Employee_Id_Number;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployerAddress() {
		return employerAddress;
	}

	public void setEmployerAddress(String employerAddress) {
		this.employerAddress = employerAddress;
	}

	public String getEmployerCellularPhone() {
		return employerCellularPhone;
	}

	public void setEmployerCellularPhone(String employerCellularPhone) {
		this.employerCellularPhone = employerCellularPhone;
	}

	public String getEmployerOfficePhone() {
		return employerOfficePhone;
	}

	public void setEmployerOfficePhone(String employerOfficePhone) {
		this.employerOfficePhone = employerOfficePhone;
	}

	public String getPreviousQualification() {
		return previousQualification;
	}

	public void setPreviousQualification(String previousQualification) {
		this.previousQualification = previousQualification;
	}

	public String getPreviousExperience() {
		return previousExperience;
	}

	public void setPreviousExperience(String previousExperience) {
		this.previousExperience = previousExperience;
	}

	public int getpStartDateDay() {
		return pStartDateDay;
	}

	public void setpStartDateDay(int pStartDateDay) {
		this.pStartDateDay = pStartDateDay;
	}

	public int getpStartDateMonth() {
		return pStartDateMonth;
	}

	public void setpStartDateMonth(int pStartDateMonth) {
		this.pStartDateMonth = pStartDateMonth;
	}

	public int getpStartDateYear() {
		return pStartDateYear;
	}

	public void setpStartDateYear(int pStartDateYear) {
		this.pStartDateYear = pStartDateYear;
	}

	public int getpEndDateDay() {
		return pEndDateDay;
	}

	public void setpEndDateDay(int pEndDateDay) {
		this.pEndDateDay = pEndDateDay;
	}

	public int getpEndDateMonth() {
		return pEndDateMonth;
	}

	public void setpEndDateMonth(int pEndDateMonth) {
		this.pEndDateMonth = pEndDateMonth;
	}

	public int getpEndDateYear() {
		return pEndDateYear;
	}

	public void setpEndDateYear(int pEndDateYear) {
		this.pEndDateYear = pEndDateYear;
	}

 

}