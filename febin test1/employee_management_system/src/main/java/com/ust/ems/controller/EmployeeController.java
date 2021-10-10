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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.ems.model.EmployeeBasicDetails;
import com.ust.ems.service.EmployeeService;

/*
 * EmployeeBasicDetailsController
 */

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	/*
	 *  to get all the employee details
	 */
	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeBasicDetails>> getAllEmployees() {
		try {
			List<EmployeeBasicDetails> employeeList = service.getAllEmployees();
			if (employeeList.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(employeeList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/*
	 * to get the employee details based on employeeIdNumber
	 */
	@GetMapping("/employees/{emp_id}")
	public ResponseEntity<EmployeeBasicDetails> getEmployeeById(@PathVariable("emp_id") int id) {
		try {
			Optional<EmployeeBasicDetails> entity = service.getEmployeeById(id);
			if (entity.isPresent()) {
				return new ResponseEntity<>(entity.get(), HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/*
	 * is used to create a new employee 
	 */
	@PostMapping("/employees")
	public ResponseEntity<EmployeeBasicDetails> createorUpdateEmployee(@RequestBody EmployeeBasicDetails employee) {
		try {
			return new ResponseEntity<>(service.createOrUpdateEmployee(employee), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/*
	 * to delete the employee data 
	 */
	@DeleteMapping("/employees/{emp_id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable("emp_id") int id) {
		try {
			service.deleteEmployeeById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

