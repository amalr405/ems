package com.ust.ems.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.ems.model.SalaryInformation;
import com.ust.ems.service.SalaryInformationService;

/**
*Processing user requests.
*/

@RestController
@RequestMapping("/t")
public class SalaryInformationController {
	
	@Autowired
	SalaryInformationService service;
	
	/**
	* To get salary information of all the employees.
	*/

	@GetMapping("/salaryinfo")
	public ResponseEntity<List<SalaryInformation>> getAllEmployeesSalaryInformation() {
	try {
	List<SalaryInformation> employeeSalaryInformation = service.getAllEmployeesSalaryInformation();
	if (employeeSalaryInformation.isEmpty()) {
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<>(employeeSalaryInformation, HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	/**
	 * To get the salary information of an employee based on employeeIdNumber
	 */

	@GetMapping("/salaryinfo/{salary_id}")
	public ResponseEntity<SalaryInformation> getEmployeeSalaryInformationById(@PathVariable("salary_id") int id) {
	try {
	Optional<SalaryInformation> entity = service.getEmployeeSalaryInformationById(id);
	if (entity.isPresent()) {
	return new ResponseEntity<>(entity.get(), HttpStatus.OK);
	}
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	} catch (Exception e) {
	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

	/**
	* To create a new Salary information
	*/

	@PostMapping("/salaryinfo")
	public ResponseEntity<SalaryInformation> createEmployeeWorkHistory(@RequestBody SalaryInformation employeeSalary) {
	try {
	return new ResponseEntity<>(service.createEmployeeSalaryInformation(employeeSalary), HttpStatus.CREATED);
	} catch (Exception e) {
	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

	/**
	* To update the salary information of an existing employee
	*/


	@PutMapping("/salaryinfo")
	public ResponseEntity<SalaryInformation> updateEmployeeSalaryInformation(@RequestBody SalaryInformation employeeSalary) {
	try {
	SalaryInformation entity = service.updateEmployeeSalaryInformation(employeeSalary);
	if (entity != null) {
	return new ResponseEntity<>(entity, HttpStatus.OK);
	}
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	} catch (Exception e) {
	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

	/**
	*To delete the salary information data of an employee based on employeeIdNumber
	*/

	@DeleteMapping("/salaryinfo/{salary_id}")
	public ResponseEntity<HttpStatus> deleteEmployeeSalaryInformationById(@PathVariable("salary_id") int id) {
	try {
	service.deleteEmployeeSalaryInfoById(id);
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

}
