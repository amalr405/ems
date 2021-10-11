package com.ust.ems.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 

@Entity
@Table(name = "time_information")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TimeInformation {
	
	@Id
	@Column(name = "Employee_ID_Number")
	private int Employee_ID_Number;

   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;*/

	@Column(name = "Worked_Hours")
	private int Worked_Hours;
	
	
	@Column(name = "Off_Hours")
	private int Off_Hours;
	
	@Column(name = "Days_off")
	private int Days_off;
	
	@Column(name = "Over_Time")
	private int Over_Time;
	
	@Column(name = "Extra_Days")
	private int Extra_Days;
	
	@Column(name = "w_From_Date_Day")
	private int w_From_Date_Day;
	
	
	@Column(name = "w_From_Date_Month")
	private int w_From_Date_Month;
	
	@Column(name = "w_From_Date_Year")
	private int w_From_Date_Year;
	
	@Column(name = "w_To_Date_Day")
	private int w_To_Date_Day;
	
	@Column(name = "w_To_Date_Month")
	private int w_To_Date_Month;
	
	@Column(name = "w_To_Date_Year")
	private int w_To_Date_Year;
	

	public int getEmployee_ID_Number() {
		return Employee_ID_Number;
	}

	public void setEmployee_ID_Number(int employee_ID_Number) {
		Employee_ID_Number = employee_ID_Number;
	}

	public int getWorked_Hours() {
		return Worked_Hours;
	}

	public void setWorked_Hours(int worked_Hours) {
		Worked_Hours = worked_Hours;
	}

	public int getOff_Hours() {
		return Off_Hours;
	}

	public void setOff_Hours(int off_Hours) {
		Off_Hours = off_Hours;
	}

	public int getDays_off() {
		return Days_off;
	}

	public void setDays_off(int days_off) {
		Days_off = days_off;
	}

	public int getOver_Time() {
		return Over_Time;
	}

	public void setOver_Time(int over_Time) {
		Over_Time = over_Time;
	}

	public int getExtra_Days() {
		return Extra_Days;
	}

	public void setExtra_Days(int extra_Days) {
		Extra_Days = extra_Days;
	}

	public int getW_From_Date_Day() {
		return w_From_Date_Day;
	}

	public void setW_From_Date_Day(int w_From_Date_Day) {
		this.w_From_Date_Day = w_From_Date_Day;
	}

	public int getW_From_Date_Month() {
		return w_From_Date_Month;
	}

	public void setW_From_Date_Month(int w_From_Date_Month) {
		this.w_From_Date_Month = w_From_Date_Month;
	}

	public int getW_From_Date_Year() {
		return w_From_Date_Year;
	}

	public void setW_From_Date_Year(int w_From_Date_Year) {
		this.w_From_Date_Year = w_From_Date_Year;
	}

	public int getW_To_Date_Day() {
		return w_To_Date_Day;
	}

	public void setW_To_Date_Day(int w_To_Date_Day) {
		this.w_To_Date_Day = w_To_Date_Day;
	}

	public int getW_To_Date_Month() {
		return w_To_Date_Month;
	}

	public void setW_To_Date_Month(int w_To_Date_Month) {
		this.w_To_Date_Month = w_To_Date_Month;
	}

	public int getW_To_Date_Year() {
		return w_To_Date_Year;
	}

	public void setW_To_Date_Year(int w_To_Date_Year) {
		this.w_To_Date_Year = w_To_Date_Year;
	}
	
	

}