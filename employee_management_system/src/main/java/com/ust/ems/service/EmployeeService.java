package com.ust.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ems.model.EmployeeBasicDetails;
import com.ust.ems.repository.EmployeeRepository;

/*
 * EmployeeBasicDetailsServices 
 */
@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	/*
	 * to get all the employee details
	
	 */
	public List<EmployeeBasicDetails> getAllEmployees(){
		List<EmployeeBasicDetails> employeeList = repository.findAll();
		if(employeeList.size() > 0) {
			return employeeList;
		} else {
			return new ArrayList<EmployeeBasicDetails>();
		}
	}

	/*
	 * to get the employee details based on employeeIdNumber
	 */
	public Optional<EmployeeBasicDetails> getEmployeeById(int id) {
		Optional<EmployeeBasicDetails> employee = repository.findByemployeeIdNumber(id);
		return employee;
	}

	/*
	  to create a new employee if not exist / update an existing employee
	 */
	public EmployeeBasicDetails createOrUpdateEmployee(EmployeeBasicDetails entity) {
		Optional<EmployeeBasicDetails> employee = repository.findByemployeeIdNumber(entity.getEmployeeIdNumber());

		if(employee.isPresent()) {
			EmployeeBasicDetails newEntity = employee.get();
			newEntity.setPersonalIdNumber(entity.getPersonalIdNumber());
			newEntity.setFirstName(entity.getFirstName());
			newEntity.setMiddleName(entity.getMiddleName());
			newEntity.setLastName(entity.getLastName());
			newEntity.setDayOfBirth(entity.getDayOfBirth());
			newEntity.setMonthOfBirth(entity.getMonthOfBirth());
			newEntity.setYearOfBirth(entity.getYearOfBirth());
			newEntity.setCellularPhone(entity.getCellularPhone());
			newEntity.setHomePhone(entity.getHomePhone());
			newEntity.setCity(entity.getCity());
			newEntity.setAddress(entity.getAddress());
			newEntity.setPostalCode(entity.getPostalCode());
			newEntity.setQualification(entity.getQualification());
			newEntity.setCurrentExperience(entity.getCurrentExperience());
			newEntity.setStartDateDay(entity.getStartDateDay());
			newEntity.setStartDateMonth(entity.getStartDateMonth());
			newEntity.setStartDateYear(entity.getStartDateYear());
			newEntity.setEndDateDay(entity.getEndDateDay());
			newEntity.setEndDateMonth(entity.getEndDateMonth());
			newEntity.setEndDateYear(entity.getEndDateYear());
			newEntity.setTypeOfEmployee(entity.getTypeOfEmployee());
			newEntity.setGender(entity.getGender());
			newEntity.setMaritalStatus(entity.getMaritalStatus());
			newEntity = repository.save(newEntity);
			return newEntity;
		} else {
			entity = repository.save(entity);
			return entity;
		}
	} 

	/*
	 *  to delete the employee data based on employeeIdNumber
	 
	 */
	public void deleteEmployeeById(int id){
		Optional<EmployeeBasicDetails> employee = repository.findByemployeeIdNumber(id);    
		if(employee.isPresent()) {
			repository.deleteByemployeeIdNumber(id);
		}
		else {
			return;
		}
	}
}

