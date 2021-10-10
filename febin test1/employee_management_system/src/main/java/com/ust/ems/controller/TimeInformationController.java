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

import com.ust.ems.model.TimeInformation;
import com.ust.ems.service.TimeInformationService;


// processing user requests.
 

@RestController
@RequestMapping("/t")
public class TimeInformationController {

	@Autowired
	TimeInformationService service;

	
	 // to get time info of all the employees.

	@GetMapping("/timeinfo")
	public ResponseEntity<List<TimeInformation>> getAllEmployeesTimeInformation() {
		try {
			List<TimeInformation> employeeTimeInformation = service.getAllEmployeesTimeInformation();
			if (employeeTimeInformation.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(employeeTimeInformation, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// to get the time info of an employee based on employeeIdNumber
	
	
	@GetMapping("/timeinfo/{time_id}")
	public ResponseEntity<TimeInformation> getEmployeeTimeInformationById(@PathVariable("time_id") int id) {
		try {
			Optional<TimeInformation> entity = service.getEmployeeTimeInformationById(id);
			if (entity.isPresent()) {
				return new ResponseEntity<>(entity.get(), HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	 // to create a new timeinfo
	
	 
	@PostMapping("/timeinfo")
	public ResponseEntity<TimeInformation> createEmployeeWorkHistory(@RequestBody TimeInformation employeeTime) {
		try {
			return new ResponseEntity<>(service.createEmployeeTimeInformation(employeeTime), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	 // to update the timeinfo of an existing employee 
	 
	 
	@PutMapping("/timeinfo")
	public ResponseEntity<TimeInformation> updateEmployeeTimeInformation(@RequestBody TimeInformation employeeTime) {
		try {
			TimeInformation entity = service.updateEmployeeTimeInformation(employeeTime);
			if (entity != null) {
				return new ResponseEntity<>(entity, HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	 //  to delete the timeinfo data of an employee based on employeeIdNumber
	 

	
	@DeleteMapping("/timeinfo/{time_id}")
	public ResponseEntity<HttpStatus> deleteEmployeeTimeInformationById(@PathVariable("time_id") int id) {
		try {
			service.deleteEmployeeTimeInfoById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}