package com.ust.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salaryinformation")
public class SalaryInformation {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name = "salaryinfoid")
	int salaryinfoId;
	
	public int getSalaryinfoId() {
		return salaryinfoId;
	}

	public void setSalaryinfoId(int salaryinfoId) {
		this.salaryinfoId = salaryinfoId;
	}
	
	@Column(name = "Employee_ID_Number")
	private int Employee_ID_Number;
	
	@Column(name = "Monthly_Salary")
	private int Monthly_Salary;
	
	@Column(name = "Monthly_Money_Currency")
	private int Monthly_Money_Currency;
	
	@Column(name = "monthly_Taxes")
	private int monthly_Taxes;
	
	@Column(name = "monthly_Deductions")
	private int monthly_Deductions;
	
	@Column(name = "monthly_Insurances")
	private int monthly_Insurances;
	
	@Column(name = "ms_From_Date_Day")
	private int ms_From_Date_Day;
	
	@Column(name = "ms_From_Date_Month")
	private int ms_From_Date_Month;
	
	@Column(name = "ms_From_Date_Year")
	private int ms_From_Date_Year;
	
	@Column(name = "ms_To_Date_Day")
	private int ms_To_Date_Day;
	
	@Column(name = "ms_To_Date_Month")
	private int ms_To_Date_Month;
	
	@Column(name = "ms_To_Date_Year")
	private int ms_To_Date_Year;
	
	@Column(name = "Weekly_Salary")
	private int Weekly_Salary;
	
	@Column(name = "Weekly_Money_Currency")
	private int Weekly_Money_Currency;
	
	@Column(name = "weekly_Taxes")
	private int weekly_Taxes;
	
	@Column(name = "weekly_Deductions")
	private int weekly_Deductions;
	
	@Column(name = "weekly_Insurances")
	private int weekly_Insurances;
	
	@Column(name = "ws_From_Date_Day")
	private int ws_From_Date_Day;
	
	@Column(name = "ws_From_Date_Month")
	private int ws_From_Date_Month;
	
	@Column(name = "ws_From_Date_Year")
	private int ws_From_Date_Year;
	
	@Column(name = "ws_To_Date_Day")
	private int ws_To_Date_Day;
	
	@Column(name = "ws_To_Date_Month")
	private int ws_To_Date_Month;
	
	@Column(name = "ws_To_Date_Year")
	private int ws_To_Date_Year;

	public int getEmployee_ID_Number() {
		return Employee_ID_Number;
	}

	public void setEmployee_ID_Number(int employee_ID_Number) {
		Employee_ID_Number = employee_ID_Number;
	}

	public int getMonthly_Salary() {
		return Monthly_Salary;
	}

	public void setMonthly_Salary(int monthly_Salary) {
		Monthly_Salary = monthly_Salary;
	}

	public int getMonthly_Money_Currency() {
		return Monthly_Money_Currency;
	}

	public void setMonthly_Money_Currency(int monthly_Money_Currency) {
		Monthly_Money_Currency = monthly_Money_Currency;
	}

	public int getMonthly_Taxes() {
		return monthly_Taxes;
	}

	public void setMonthly_Taxes(int monthly_Taxes) {
		this.monthly_Taxes = monthly_Taxes;
	}

	public int getMonthly_Deductions() {
		return monthly_Deductions;
	}

	public void setMonthly_Deductions(int monthly_Deductions) {
		this.monthly_Deductions = monthly_Deductions;
	}

	public int getMonthly_Insurances() {
		return monthly_Insurances;
	}

	public void setMonthly_Insurances(int monthly_Insurances) {
		this.monthly_Insurances = monthly_Insurances;
	}

	public int getMs_From_Date_Day() {
		return ms_From_Date_Day;
	}

	public void setMs_From_Date_Day(int ms_From_Date_Day) {
		this.ms_From_Date_Day = ms_From_Date_Day;
	}

	public int getMs_From_Date_Month() {
		return ms_From_Date_Month;
	}

	public void setMs_From_Date_Month(int ms_From_Date_Month) {
		this.ms_From_Date_Month = ms_From_Date_Month;
	}

	public int getMs_From_Date_Year() {
		return ms_From_Date_Year;
	}

	public void setMs_From_Date_Year(int ms_From_Date_Year) {
		this.ms_From_Date_Year = ms_From_Date_Year;
	}

	public int getMs_To_Date_Day() {
		return ms_To_Date_Day;
	}

	public void setMs_To_Date_Day(int ms_To_Date_Day) {
		this.ms_To_Date_Day = ms_To_Date_Day;
	}

	public int getMs_To_Date_Month() {
		return ms_To_Date_Month;
	}

	public void setMs_To_Date_Month(int ms_To_Date_Month) {
		this.ms_To_Date_Month = ms_To_Date_Month;
	}

	public int getMs_To_Date_Year() {
		return ms_To_Date_Year;
	}

	public void setMs_To_Date_Year(int ms_To_Date_Year) {
		this.ms_To_Date_Year = ms_To_Date_Year;
	}

	public int getWeekly_Salary() {
		return Weekly_Salary;
	}

	public void setWeekly_Salary(int weekly_Salary) {
		Weekly_Salary = weekly_Salary;
	}

	public int getWeekly_Money_Currency() {
		return Weekly_Money_Currency;
	}

	public void setWeekly_Money_Currency(int weekly_Money_Currency) {
		Weekly_Money_Currency = weekly_Money_Currency;
	}

	public int getWeekly_Taxes() {
		return weekly_Taxes;
	}

	public void setWeekly_Taxes(int weekly_Taxes) {
		this.weekly_Taxes = weekly_Taxes;
	}

	public int getWeekly_Deductions() {
		return weekly_Deductions;
	}

	public void setWeekly_Deductions(int weekly_Deductions) {
		this.weekly_Deductions = weekly_Deductions;
	}

	public int getWeekly_Insurances() {
		return weekly_Insurances;
	}

	public void setWeekly_Insurances(int weekly_Insurances) {
		this.weekly_Insurances = weekly_Insurances;
	}

	public int getWs_From_Date_Day() {
		return ws_From_Date_Day;
	}

	public void setWs_From_Date_Day(int ws_From_Date_Day) {
		this.ws_From_Date_Day = ws_From_Date_Day;
	}

	public int getWs_From_Date_Month() {
		return ws_From_Date_Month;
	}

	public void setWs_From_Date_Month(int ws_From_Date_Month) {
		this.ws_From_Date_Month = ws_From_Date_Month;
	}

	public int getWs_From_Date_Year() {
		return ws_From_Date_Year;
	}

	public void setWs_From_Date_Year(int ws_From_Date_Year) {
		this.ws_From_Date_Year = ws_From_Date_Year;
	}

	public int getWs_To_Date_Day() {
		return ws_To_Date_Day;
	}

	public void setWs_To_Date_Day(int ws_To_Date_Day) {
		this.ws_To_Date_Day = ws_To_Date_Day;
	}

	public int getWs_To_Date_Month() {
		return ws_To_Date_Month;
	}

	public void setWs_To_Date_Month(int ws_To_Date_Month) {
		this.ws_To_Date_Month = ws_To_Date_Month;
	}

	public int getWs_To_Date_Year() {
		return ws_To_Date_Year;
	}

	public void setWs_To_Date_Year(int ws_To_Date_Year) {
		this.ws_To_Date_Year = ws_To_Date_Year;
	}
}
