package com.ust.ems.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ems.entity.EmployeeDetails;
import com.ust.ems.repository.ProjectRepository;

@Service
public class EmployeeService {

	@Autowired
	ProjectRepository repo;
	
	//Adding Employee into Repository
  
	public String addemployee(Map<String,Object>  mp) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmployee_ID_Number((Integer) mp.get("eid"));
		emp.setPersonal_ID_Number((Integer) mp.get("pid"));
		emp.setFirst_Name((String) mp.get("fname"));
		emp.setMiddle_Name((String) mp.get("mname"));
		emp.setLast_Name((String) mp.get("lname"));
		emp.setDay_of_Birth((int) mp.get("dob"));
		emp.setMonth_of_Birth((String) mp.get("mob"));
		emp.setYear_of_Birth((int) mp.get("yob"));
		emp.setCellular_Phone((long) mp.get("cellno"));
		emp.setHome_Phone((Long) mp.get("hno"));
		emp.setCity((String) mp.get("city"));
		emp.setAddress((String) mp.get("addr"));
		emp.setPostal_code((Integer) mp.get("pcode"));
		emp.setQualification((String) mp.get("qualif"));
		emp.setCurrent_Experience((Integer) mp.get("exp"));
		emp.setStart_Date_Day((int) mp.get("stday"));
		emp.setStart_Date_Month((String) mp.get("stmon"));
		emp.setStart_Date_Year((int) mp.get("styear"));
		emp.setEnd_Date_Day((Integer) mp.get("enday"));
		emp.setEnd_Date_Month((String) mp.get("enmon"));
		emp.setEnd_Date_Year((Integer) mp.get("enyear"));
		emp.setType_of_Employee((String) mp.get("typeofemp"));
		emp.setGender((String) mp.get("gender"));
		emp.setMarital_Status((String) mp.get("status"));
		repo.save(emp);
		return "Successfully Entered new Employee "+emp.toString();
	}

	//Selecting List of Employees
	
	public Object getemployee() {
		return repo.findAll();
	}
	
	//Selecting Employee by Id
	
	public Object getemployeebyid(Integer id) {
		return repo.findById(id); 
	}
	
	//Deleting all Employees
	
	public String deleteemployees() {
		repo.deleteAll();
		return "deleted all employees";
	}
	
	//Delete Employee By id
	
	public String deleteemployeebyid(int id) {
		repo.deleteById(id);
		return "deleted employee with id "+id;
	}
	
	//Updating Employee Details
	
	public String updateemployee(Map<String,Object> mp) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmployee_ID_Number((Integer) mp.get("eid"));
		emp.setPersonal_ID_Number((Integer) mp.get("pid"));
		emp.setFirst_Name((String) mp.get("fname"));
		emp.setMiddle_Name((String) mp.get("mname"));
		emp.setLast_Name((String) mp.get("lname"));
		emp.setDay_of_Birth((int) mp.get("dob"));
		emp.setMonth_of_Birth((String) mp.get("mob"));
		emp.setYear_of_Birth((int) mp.get("yob"));
		emp.setCellular_Phone((long) mp.get("cellno"));
		emp.setHome_Phone((Long) mp.get("hno"));
		emp.setCity((String) mp.get("city"));
		emp.setAddress((String) mp.get("addr"));
		emp.setPostal_code((Integer) mp.get("pcode"));
		emp.setQualification((String) mp.get("qualif"));
		emp.setCurrent_Experience((Integer) mp.get("exp"));
		emp.setStart_Date_Day((int) mp.get("stday"));
		emp.setStart_Date_Month((String) mp.get("stmon"));
		emp.setStart_Date_Year((int) mp.get("styear"));
		emp.setEnd_Date_Day((Integer) mp.get("enday"));
		emp.setEnd_Date_Month((String) mp.get("enmon"));
		emp.setEnd_Date_Year((Integer) mp.get("enyear"));
		emp.setType_of_Employee((String) mp.get("typeofemp"));
		emp.setGender((String) mp.get("gender"));
		emp.setMarital_Status((String) mp.get("status"));
	    repo.save(emp);
		return "updated employee details successfully"; 
	}
	
}
