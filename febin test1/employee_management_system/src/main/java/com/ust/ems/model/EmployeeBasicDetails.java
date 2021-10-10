package com.ust.ems.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "employee_basic_details")
public class EmployeeBasicDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employeeIdNumber" )
	int employeeIdNumber;

	@Column(name = "personalIdNumber" )
	int personalIdNumber;

	@Column(name = "firstName")
	String firstName;

	@Column(name = "middleName")
	String middleName;

	@Column(name = "lastName")
	String lastName;

	@Column(name = "dayOfBirth")
	int dayOfBirth;

	@Column(name = "monthOfBirth")
	int monthOfBirth;

	@Column(name = "yearOfBirth")
	int yearOfBirth;

	@Column(name = "cellularPhone")
	String cellularPhone;

	@Column(name = "homePhone")
	String homePhone;

	@Column(name = "city")
	String city;

	@Column(name = "address")
	String address;

	@Column(name = "postalCode")
	String postalCode;

	@Column(name = "qualification")
	String qualification;

	@Column(name = "currentExperience")
	String currentExperience;

	@Column(name = "startDateDay")
	int startDateDay;

	@Column(name = "startDateMonth")
	int startDateMonth;

	@Column(name = "startDateYear")
	int startDateYear;

	public int getEmployeeIdNumber() {
		return employeeIdNumber;
	}

	public void setEmployeeIdNumber(int employeeIdNumber) {
		this.employeeIdNumber = employeeIdNumber;
	}

	public int getPersonalIdNumber() {
		return personalIdNumber;
	}

	public void setPersonalIdNumber(int personalIdNumber) {
		this.personalIdNumber = personalIdNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getCellularPhone() {
		return cellularPhone;
	}

	public void setCellularPhone(String cellularPhone) {
		this.cellularPhone = cellularPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCurrentExperience() {
		return currentExperience;
	}

	public void setCurrentExperience(String currentExperience) {
		this.currentExperience = currentExperience;
	}

	public int getStartDateDay() {
		return startDateDay;
	}

	public void setStartDateDay(int startDateDay) {
		this.startDateDay = startDateDay;
	}

	public int getStartDateMonth() {
		return startDateMonth;
	}

	public void setStartDateMonth(int startDateMonth) {
		this.startDateMonth = startDateMonth;
	}

	public int getStartDateYear() {
		return startDateYear;
	}

	public void setStartDateYear(int startDateYear) {
		this.startDateYear = startDateYear;
	}

	public int getEndDateDay() {
		return endDateDay;
	}

	public void setEndDateDay(int endDateDay) {
		this.endDateDay = endDateDay;
	}

	public int getEndDateMonth() {
		return endDateMonth;
	}

	public void setEndDateMonth(int endDateMonth) {
		this.endDateMonth = endDateMonth;
	}

	public int getEndDateYear() {
		return endDateYear;
	}

	public void setEndDateYear(int endDateYear) {
		this.endDateYear = endDateYear;
	}

	public String getTypeOfEmployee() {
		return typeOfEmployee;
	}

	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(name = "endDateDay")
	int endDateDay;

	@Column(name = "endDateMonth")
	int endDateMonth;

	@Column(name = "endDateYear")
	int endDateYear;

	@Column(name = "typeOfEmployee")
	String typeOfEmployee;

	@Column(name = "gender")
	String gender;

	@Column(name = "maritalStatus")
	String maritalStatus;
	
//	@OneToMany(targetEntity = ContactPerson.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "employeeIdNumber",referencedColumnName = "employeeIdNumber")
//	private List<ContactPerson> contacts;
//	
//	@OneToMany(targetEntity = WorkingHistory.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "employeeIdNumber",referencedColumnName = "employeeIdNumber")
//	private List<WorkingHistory> workHistory;
//	
//	@OneToMany(targetEntity = Salary.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "employeeIdNumber",referencedColumnName = "employeeIdNumber")
//	private List<Salary> salary;
//	
//	@OneToMany(targetEntity = Time.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "employeeIdNumber",referencedColumnName = "employeeIdNumber")
//	private List<Time> time;
}
