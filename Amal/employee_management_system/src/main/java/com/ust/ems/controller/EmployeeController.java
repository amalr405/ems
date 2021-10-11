package com.ust.ems.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.ems.entity.EmployeeDetails;
import com.ust.ems.repository.ProjectRepository;
import com.ust.ems.service.EmployeeService;

//Employee Controller

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService serv;
	@Autowired
	ProjectRepository repo;
	

	//HomePage
	
	@GetMapping(value="/")
	public String homepage() {
		return "EmployeeManagementSystem";
	}
	
	//Inserting Employee Details  
	
	@PostMapping(value="/empinfo")
	public String addemployee(@RequestBody Map<String,Object> emp) {		 
		return serv.addemployee(emp);
	}
	
	//Selecting Employee Details
	
	@GetMapping(value="/empinfo")
	public Object getemployee() {
		try {
			return serv.getemployee();
		}catch(Exception e) {
			return "Nothing to display";
		}

	}
	
	//Selecting Employee by First Name
	
	@GetMapping(value="/empbyname/{name}")
	public Object getbyname(@PathVariable String name) {
		Object obj = repo.findByFirst_nameAll(name);
		try {
			if(obj==null) {
			return "No Employee is found in this Name";
		}else {
			return obj;		
		}
		}catch(Exception e) {
			return "Not found";
		}
		
	}
	
	//Selecting Employee Details By Employee Id 
	
	@GetMapping(value="/empinfo/{id}")
	public Object getemployeebyid(@PathVariable Integer id) {
		try {
			Object obj = serv.getemployeebyid(id);
			return obj;	
		}catch(Exception e) {
			return "No Employee is found in this Id";
		}
	}
	
	//Selecting Employee By Gender
	
	@GetMapping(value="/empbygender/{gender}")
	public Object getbygender(@PathVariable String gender) {
		try {
			Object obj = repo.findByGenderAll(gender);
			if(repo.findByGenderAll(gender).isEmpty()) {
				return "Not found Employee by this gender";
			}else {
				return obj;
			}	
		}catch(Exception e) {
			return "Not found Employee by this gender";
		}
	}
	
	//Selecting Employee Details By City
	
	@GetMapping(value="/empbycity/{city}")
	public Object geteployeebycity(@PathVariable String city) {
		try {
			Object obj = repo.findByCityAll(city);
			if(obj == null) {
				return "No Employee is found";
			}else {
				return obj;
			}
		}catch(Exception e) {
			return "No Employee is found"; 
		}
	}

	//Deleting all Employee Details
	
	@DeleteMapping(value="/empinfo")
	public String deleteemployees() {
		try {
			return serv.deleteemployees();	
		}catch(Exception e) {
			return "Nothing to delete";
		}
	}
	
	//Deleting Employee Details by Employee Id
	
	@DeleteMapping(value="/empinfo/{id}")
	public String deleteemployeebyid(@PathVariable("id") Integer id) {
		try {
			String obj = serv.deleteemployeebyid(id);
			return obj;
		}catch(Exception e ) {
			return "No Employee is found in this Id";
		}
	}
	
	//Updating Employee Details
 
	@PutMapping("/empinfo/{id}")
	public String updateemployes(@RequestBody EmployeeDetails emp , @PathVariable(value="id") Integer id) {
		try {
//			repo.getById(id).setEmployee_ID_Number((Integer) mp.get("eid"));
//			repo.getById(id).setFirst_Name((String)mp.get("fname"));
//			repo.getById(id).setMiddle_Name((String)mp.get("mname"));
//			repo.getById(id).setLast_Name((String)mp.get("lname"));
//			repo.getById(id).setDay_of_Birth((int)mp.get("dob"));
//			repo.getById(id).setMonth_of_Birth((String)mp.get("mob"));
//			repo.getById(id).setYear_of_Birth((int)mp.get("yob"));
//			repo.getById(id).setCellular_Phone((long)mp.get("cellno"));
//			repo.getById(id).setHome_Phone((Long)mp.get("hno"));
//			repo.getById(id).setCity((String)mp.get("city"));
//			repo.getById(id).setAddress((String)mp.get("addr"));
//			repo.getById(id).setPostal_code((Integer)mp.get("pcode"));
//			repo.getById(id).setQualification((String)mp.get("qualif"));
//			repo.getById(id).setCurrent_Experience((Integer)mp.get("exp"));
//			repo.getById(id).setStart_Date_Day((int)mp.get("stday"));
//			repo.getById(id).setStart_Date_Month((String)mp.get("stmon"));
//			repo.getById(id).setStart_Date_Year((int)mp.get("styear"));
//			repo.getById(id).setEnd_Date_Day((Integer)mp.get("enday"));
//			repo.getById(id).setEnd_Date_Month((String)mp.get("enmon"));
//			repo.getById(id).setEnd_Date_Year((Integer)mp.get("enyear"));
//			repo.getById(id).setType_of_Employee((String)mp.get("typeofemp"));
//			repo.getById(id).setGender((String)mp.get("gender"));
//			repo.getById(id).setMarital_Status((String)mp.get("status"));
//			repo.save(repo.getById(id));
			serv.updateemployee(emp);
			 return "Updated";
		}catch(Exception e) {
			System.out.println(e);
			return "Not Found";
		}
		
	}
 
}
