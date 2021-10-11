package com.ust.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ems.entity.TimeInformation;
import com.ust.ems.repository.TimeInformationRepository;


 //perform service tasks.

@Service
@Transactional
public class  TimeInformationService {
	
	@Autowired
	private TimeInformationRepository repository;
	
	
	 // used to time info history of all the employees.
	 
	
	public List<TimeInformation> getAllEmployeesTimeInformation() {
		List<TimeInformation> employeeTimeInformation = repository.findAll();
		if(employeeTimeInformation.size() > 0) {
			return employeeTimeInformation;
		} else {
			return new ArrayList<TimeInformation>();
		}
	}
	
	
	 // to get the time info of an employee based on employeeIdNumber
	
	public Optional<TimeInformation> getEmployeeTimeInformationById(int id) {
		Optional<TimeInformation> employeeTime = repository.findById(id);
		return employeeTime;
	}
	
	
	  // to create a new time info
	
	public TimeInformation createEmployeeTimeInformation(TimeInformation entity) {
		Optional<TimeInformation> employeeTime = repository.findById(entity.getEmployee_ID_Number());

		if(employeeTime.isPresent()) {
			return this.updateEmployeeTimeInformation( entity);
		} else {
			entity = repository.save(entity);
			return entity;
		}
	}
	
	
	 // used to update the time info of an existing employee
	 
	public TimeInformation updateEmployeeTimeInformation(TimeInformation entity) {
		Optional<TimeInformation> employeeTime = repository.findById(entity.getEmployee_ID_Number());

		if(employeeTime.isPresent()) {
			TimeInformation newEntity = employeeTime.get();
			newEntity.setEmployee_ID_Number(entity.getEmployee_ID_Number());
			newEntity.setWorked_Hours(entity.getWorked_Hours());
			newEntity.setOff_Hours(entity.getOff_Hours());
			newEntity.setDays_off(entity.getDays_off());
			newEntity.setOver_Time(entity.getOver_Time());
			newEntity.setExtra_Days(entity.getExtra_Days());
			newEntity.setW_From_Date_Day(entity.getW_From_Date_Day());
			newEntity.setW_From_Date_Month(entity.getW_From_Date_Month());
			newEntity.setW_From_Date_Year(entity.getW_From_Date_Year());
			newEntity.setW_To_Date_Day(entity.getW_To_Date_Day());
			newEntity.setW_To_Date_Month(entity.getW_To_Date_Month());
			newEntity.setW_To_Date_Year(entity.getW_To_Date_Year());
			
			return newEntity;
		}
		else {
			entity = null;
			return entity;  
		}
	} 
	
	
	 //to delete the time info data of an employee based on employeeIdNumber
	
	public void deleteEmployeeTimeInfoById(int id) {
		Optional<TimeInformation> employeeTime = repository.findById(id);    
		if(employeeTime.isPresent()) {
			repository.deleteById(id);
		}
		else {
			return;
		}
		
	}

}
