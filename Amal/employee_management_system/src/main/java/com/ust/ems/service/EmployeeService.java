package com.ust.ems.service;

import java.util.Map;
import java.util.Optional;

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
	
	public String updateemployee(EmployeeDetails entity) {
		Optional<EmployeeDetails> emp = repo.findById(entity.getEmployee_ID_Number());

		if(emp.isPresent()) {
			EmployeeDetails newEntity = emp.get();
			newEntity.setEmployee_ID_Number(entity.getEmployee_ID_Number());
			newEntity.setPersonal_ID_Number(entity.getPersonal_ID_Number());
			newEntity.setFirst_Name(entity.getFirst_Name());
			newEntity.setMiddle_Name(entity.getMiddle_Name());
			newEntity.setLast_Name(entity.getLast_Name());
			newEntity.setDay_of_Birth(entity.getDay_of_Birth());
			newEntity.setMonth_of_Birth(entity.getMonth_of_Birth());
			newEntity.setYear_of_Birth(entity.getYear_of_Birth());
			newEntity.setCellular_Phone(entity.getCellular_Phone());
			newEntity.setHome_Phone(entity.getHome_Phone());
			newEntity.setCity(entity.getCity());
			newEntity.setAddress(entity.getAddress());
			newEntity.setPostal_code(entity.getPostal_code());
			newEntity.setQualification(entity.getQualification());
			newEntity.setCurrent_Experience(entity.getCurrent_Experience());
			newEntity.setStart_Date_Day(entity.getStart_Date_Day());
			newEntity.setStart_Date_Month(entity.getStart_Date_Month());
			newEntity.setStart_Date_Year(entity.getStart_Date_Year());
			newEntity.setEnd_Date_Day(entity.getEnd_Date_Day());
			newEntity.setEnd_Date_Month(entity.getEnd_Date_Month());
			newEntity.setEnd_Date_Year(entity.getEnd_Date_Year());
			newEntity.setType_of_Employee(entity.getType_of_Employee());
			newEntity.setGender(entity.getGender());
			newEntity.setMarital_Status(entity.getMarital_Status());
			 repo.save(newEntity);
			 return "Successfully updated Employee Details";
		}
		else {
			entity = null;
			return "Not Found";
		}
	}

}
