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

import com.ust.ems.entity.WorkHistory;
import com.ust.ems.service.WorkHistoryService;


// processing user requests.
 

@RestController
@RequestMapping("/work")
public class WorkHistoryController {

	@Autowired
	WorkHistoryService service;

	
	 // to get working history of all the employees.

	@GetMapping("/winfo")
	public ResponseEntity<List<WorkHistory>> getAllEmployeesWorkHistory() {
		try {
			List<WorkHistory> employeeWorkHistory = service.getAllEmployeesWorkHistory();
			if (employeeWorkHistory.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(employeeWorkHistory, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// to get the working history of an employee based on employeeIdNumber
	
	
	@GetMapping("/winfo/{work_id}")
	public ResponseEntity<WorkHistory> getEmployeeWorkHistoryById(@PathVariable("work_id") int id) {
		try {
			Optional<WorkHistory> entity = service.getEmployeeWorkHistoryById(id);
			if (entity.isPresent()) {
				return new ResponseEntity<>(entity.get(), HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	 // to create a new working history
	
	 
	@PostMapping("/winfo")
	public ResponseEntity<WorkHistory> createEmployeeWorkHistory(@RequestBody WorkHistory employeeWork) {
		try {
			return new ResponseEntity<>(service.createEmployeeWorkHistory(employeeWork), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	 // to update the working history of an existing employee
	 
	 
	@PutMapping("/winfo")
	public ResponseEntity<WorkHistory> updateEmployeeWorkHistory(@RequestBody WorkHistory employeeWork) {
		try {
			WorkHistory entity = service.updateEmployeeWorkHistory(employeeWork);
			if (entity != null) {
				return new ResponseEntity<>(entity, HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	 //  to delete the working history data of an employee based on employeeIdNumber
	 

	
	@DeleteMapping("/winfo/{work_id}")
	public ResponseEntity<HttpStatus> deleteEmployeeWorkHistoryById(@PathVariable("work_id") int id) {
		try {
			service.deleteEmployeeWorkHistoryById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}