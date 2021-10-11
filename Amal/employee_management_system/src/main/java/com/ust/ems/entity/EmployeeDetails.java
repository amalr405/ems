package com.ust.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name="Employee")
@JsonIgnoreProperties({"address","employee_ID_Number","personal_ID_Number","month_of_Birth","cellular_Phone","end_Date_Day","gender","end_Date_Year","year_of_Birth","postal_code","qualification","city","first_Name","middle_Name","home_Phone","last_Name","day_of_Birth","marital_Status","start_Date_Year","type_of_Employee","end_Date_Month","start_Date_Day","start_Date_Month","current_Experience",})
@JsonInclude(value=Include.NON_NULL)
public class EmployeeDetails {
	@Id
	@Column(columnDefinition = "int")
	public Integer Employee_ID_Number;
	@Column(columnDefinition = "int")
	public Integer Personal_ID_Number;
	@Column(columnDefinition = "varchar(255)")
	public String First_Name;
	@Column(columnDefinition = "varchar(255)")
	public String Middle_Name;
	@Column(columnDefinition = "varchar(255)")
	public String Last_Name;
	@Column(columnDefinition = "int")
	public int Day_of_Birth;
	@Column(columnDefinition = "varchar(255)")
	public String Month_of_Birth; 
	@Column(columnDefinition = "int")
	public int Year_of_Birth;
	@Column(columnDefinition = "bigint")
	public long Cellular_Phone;
	@Column(columnDefinition = "bigint")
	public Long Home_Phone;
	@Column(columnDefinition = "varchar(255)")
	public String City; 
	@Column(columnDefinition = "varchar(255)")
	public String Address;
	@Column(columnDefinition = "int")
	public Integer Postal_code; 
	@Column(columnDefinition = "varchar(255)")
	public String Qualification;
	@Column(columnDefinition = "int")
	public Integer Current_Experience;
	@Column(columnDefinition = "int")
	public int Start_Date_Day;
	@Column(columnDefinition = "varchar(255)")
	public String Start_Date_Month;
	@Column(columnDefinition = "int")
	public int Start_Date_Year;
	@Column(columnDefinition = "int")
	public Integer End_Date_Day; 
	@Column(columnDefinition = "varchar(255)")
	public String End_Date_Month;
	@Column(columnDefinition = "int")
	public Integer End_Date_Year;
	@Column(columnDefinition = "varchar(255)")
	public String Type_of_Employee;
	@Column(columnDefinition = "varchar(255)")
	public String Gender;
	@Column(columnDefinition = "varchar(255)")
	public String Marital_Status;	
	public Integer getEmployee_ID_Number() {
		return Employee_ID_Number;
	}
	public void setEmployee_ID_Number(Integer employee_ID_Number) {
		Employee_ID_Number = employee_ID_Number;
	}
	public Integer getPersonal_ID_Number() {
		return Personal_ID_Number;
	}
	public void setPersonal_ID_Number(Integer personal_ID_Number) {
		Personal_ID_Number = personal_ID_Number;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getMiddle_Name() {
		return Middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public int getDay_of_Birth() {
		return Day_of_Birth;
	}
	public void setDay_of_Birth(int day_of_Birth) {
		Day_of_Birth = day_of_Birth;
	}
	public String getMonth_of_Birth() {
		return Month_of_Birth;
	}
	public void setMonth_of_Birth(String month_of_Birth) {
		Month_of_Birth = month_of_Birth;
	}
	public int getYear_of_Birth() {
		return Year_of_Birth;
	}
	public void setYear_of_Birth(int year_of_Birth) {
		Year_of_Birth = year_of_Birth;
	}
	public long getCellular_Phone() {
		return Cellular_Phone;
	}
	public void setCellular_Phone(long cellular_Phone) {
		Cellular_Phone = cellular_Phone;
	}
	public Long getHome_Phone() {
		return Home_Phone;
	}
	public void setHome_Phone(Long home_Phone) {
		Home_Phone = home_Phone;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Integer getPostal_code() {
		return Postal_code;
	}
	public void setPostal_code(Integer postal_code) {
		Postal_code = postal_code;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public Integer getCurrent_Experience() {
		return Current_Experience;
	}
	public void setCurrent_Experience(Integer current_Experience) {
		Current_Experience = current_Experience;
	}
	public int getStart_Date_Day() {
		return Start_Date_Day;
	}
	public void setStart_Date_Day(int start_Date_Day) {
		Start_Date_Day = start_Date_Day;
	}
	public String getStart_Date_Month() {
		return Start_Date_Month;
	}
	public void setStart_Date_Month(String start_Date_Month) {
		Start_Date_Month = start_Date_Month;
	}
	public int getStart_Date_Year() {
		return Start_Date_Year;
	}
	public void setStart_Date_Year(int start_Date_Year) {
		Start_Date_Year = start_Date_Year;
	}
	public Integer getEnd_Date_Day() {
		return End_Date_Day;
	}
	public void setEnd_Date_Day(Integer end_Date_Day) {
		End_Date_Day = end_Date_Day;
	}
	public String getEnd_Date_Month() {
		return End_Date_Month;
	}
	public void setEnd_Date_Month(String end_Date_Month) {
		End_Date_Month = end_Date_Month;
	}
	public Integer getEnd_Date_Year() {
		return End_Date_Year;
	}
	public void setEnd_Date_Year(Integer end_Date_Year) {
		End_Date_Year = end_Date_Year;
	}
	public String getType_of_Employee() {
		return Type_of_Employee;
	}
	public void setType_of_Employee(String type_of_Employee) {
		Type_of_Employee = type_of_Employee;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMarital_Status() {
		return Marital_Status;
	}
	public void setMarital_Status(String marital_Status) {
		Marital_Status = marital_Status;
	}
	public EmployeeDetails(Integer employee_ID_Number, Integer personal_ID_Number, String first_Name,
			String middle_Name, String last_Name, int day_of_Birth, String month_of_Birth, int year_of_Birth,
			long cellular_Phone, Long home_Phone, String city, String address, Integer postal_code,
			String qualification, Integer current_Experience, int start_Date_Day, String start_Date_Month,
			int start_Date_Year, Integer end_Date_Day, String end_Date_Month, Integer end_Date_Year,
			String type_of_Employee, String gender, String marital_Status) {
		super();
		Employee_ID_Number = employee_ID_Number;
		Personal_ID_Number = personal_ID_Number;
		First_Name = first_Name;
		Middle_Name = middle_Name;
		Last_Name = last_Name;
		Day_of_Birth = day_of_Birth;
		Month_of_Birth = month_of_Birth;
		Year_of_Birth = year_of_Birth;
		Cellular_Phone = cellular_Phone;
		Home_Phone = home_Phone;
		City = city;
		Address = address;
		Postal_code = postal_code;
		Qualification = qualification;
		Current_Experience = current_Experience;
		Start_Date_Day = start_Date_Day;
		Start_Date_Month = start_Date_Month;
		Start_Date_Year = start_Date_Year;
		End_Date_Day = end_Date_Day;
		End_Date_Month = end_Date_Month;
		End_Date_Year = end_Date_Year;
		Type_of_Employee = type_of_Employee;
		Gender = gender;
		Marital_Status = marital_Status;
	}
	@Override
	public String toString() {
		return "EmployeeDetails ["
				+ (Employee_ID_Number != null ? "Employee_ID_Number=" + Employee_ID_Number + ", " : "")
				+ (Personal_ID_Number != null ? "Personal_ID_Number=" + Personal_ID_Number + ", " : "")
				+ (First_Name != null ? "First_Name=" + First_Name + ", " : "")
				+ (Middle_Name != null ? "Middle_Name=" + Middle_Name + ", " : "")
				+ (Last_Name != null ? "Last_Name=" + Last_Name + ", " : "") + "Day_of_Birth=" + Day_of_Birth + ", "
				+ (Month_of_Birth != null ? "Month_of_Birth=" + Month_of_Birth + ", " : "") + "Year_of_Birth="
				+ Year_of_Birth + ", Cellular_Phone=" + Cellular_Phone + ", "
				+ (Home_Phone != null ? "Home_Phone=" + Home_Phone + ", " : "")
				+ (City != null ? "City=" + City + ", " : "") + (Address != null ? "Address=" + Address + ", " : "")
				+ (Postal_code != null ? "Postal_code=" + Postal_code + ", " : "")
				+ (Qualification != null ? "Qualification=" + Qualification + ", " : "")
				+ (Current_Experience != null ? "Current_Experience=" + Current_Experience + ", " : "")
				+ "Start_Date_Day=" + Start_Date_Day + ", "
				+ (Start_Date_Month != null ? "Start_Date_Month=" + Start_Date_Month + ", " : "") + "Start_Date_Year="
				+ Start_Date_Year + ", " + (End_Date_Day != null ? "End_Date_Day=" + End_Date_Day + ", " : "")
				+ (End_Date_Month != null ? "End_Date_Month=" + End_Date_Month + ", " : "")
				+ (End_Date_Year != null ? "End_Date_Year=" + End_Date_Year + ", " : "")
				+ (Type_of_Employee != null ? "Type_of_Employee=" + Type_of_Employee + ", " : "")
				+ (Gender != null ? "Gender=" + Gender + ", " : "")
				+ (Marital_Status != null ? "Marital_Status=" + Marital_Status : "") + "]";
	}
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}	
}
