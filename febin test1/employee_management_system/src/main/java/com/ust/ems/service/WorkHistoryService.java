package com.ust.ems.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ems.model.WorkHistory;
import com.ust.ems.repository.WorkHistoryRepo;


 //perform service tasks.

@Service
@Transactional
public class WorkHistoryService {
	
	@Autowired
	private WorkHistoryRepo repository;
	
	
	 // used to get working history of all the employees.
	 
	
	public List<WorkHistory> getAllEmployeesWorkHistory() {
		List<WorkHistory> employeeWorkHistory = repository.findAll();
		if(employeeWorkHistory.size() > 0) {
			return employeeWorkHistory;
		} else {
			return new ArrayList<WorkHistory>();
		}
	}
	
	
	 // to get the working history of an employee based on employeeIdNumber
	
	public Optional<WorkHistory> getEmployeeWorkHistoryById(int id) {
		Optional<WorkHistory> employeeWork = repository.findByworkhistoryIdNumber(id);
		return employeeWork;
	}
	
	
	  // to create a new working history
	
	public WorkHistory createEmployeeWorkHistory(WorkHistory entity) {
		Optional<WorkHistory> employeeWork = repository.findByworkhistoryIdNumber(entity.getEmployeeIdNumber());

		if(employeeWork.isPresent()) {
			return this.updateEmployeeWorkHistory(entity);
		} else {
			entity = repository.save(entity);
			return entity;
		}
	}
	
	
	 // used to update the working history of an existing employee
	 
	public WorkHistory updateEmployeeWorkHistory(WorkHistory entity) {
		Optional<WorkHistory> employeeWork = repository.findByworkhistoryIdNumber(entity.getWorkhistoryIdNumber());

		if(employeeWork.isPresent()) {
			WorkHistory newEntity = employeeWork.get();
			newEntity.setEmployeeIdNumber(entity.getEmployeeIdNumber());
			newEntity.setCompanyName(entity.getCompanyName());
			newEntity.setEmployerName(entity.getEmployerName());
			newEntity.setEmployerAddress(entity.getEmployerAddress());
			newEntity.setEmployerCellularPhone(entity.getEmployerCellularPhone());
			newEntity.setEmployerOfficePhone(entity.getEmployerOfficePhone());
			newEntity.setPreviousQualification(entity.getPreviousQualification());
			newEntity.setPreviousExperience(entity.getPreviousExperience());
			newEntity.setpStartDateDay(entity.getpStartDateDay());
			newEntity.setpStartDateMonth(entity.getpStartDateMonth());
			newEntity.setpStartDateYear(entity.getpStartDateYear());
			newEntity.setpEndDateDay(entity.getpEndDateDay());
			newEntity.setpEndDateMonth(entity.getpEndDateMonth());
			newEntity.setpEndDateYear(entity.getpEndDateYear());
			newEntity = repository.save(newEntity);
			return newEntity;
		}
		else {
			entity = null;
			return entity;
		}
	} 
	
	
	 //to delete the working history data of an employee based on employeeIdNumber
	
	public void deleteEmployeeWorkHistoryById(int id) {
		Optional<WorkHistory> employeeWork = repository.findByworkhistoryIdNumber(id);    
		if(employeeWork.isPresent()) {
			repository.deleteByworkhistoryIdNumber(id);
		}
		else {
			return;
		}
		
	}

}