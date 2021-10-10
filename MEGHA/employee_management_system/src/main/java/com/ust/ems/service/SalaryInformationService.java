package com.ust.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ust.ems.model.SalaryInformation;
import com.ust.ems.repository.SalaryInformationRepository;

/**
 * To perform service tasks.
 */
@Service
@Transactional
public class SalaryInformationService {
	@Autowired
	private SalaryInformationRepository repository;

	/**
	 *  Used to get salary information of all the employees.
	 */
	public List<SalaryInformation> getAllEmployeesSalaryInformation() {
	List<SalaryInformation> employeeSalaryInformation = repository.findAll();
	if(employeeSalaryInformation.size() > 0) {
	return employeeSalaryInformation;
	} else {
	return new ArrayList<SalaryInformation>();
	}
	}
	
	/** 
	 * To get the salary information of an employee based on employeeIdNumber
	 */
	public Optional<SalaryInformation> getEmployeeSalaryInformationById(int id) {
	Optional<SalaryInformation> employeeSalary = repository.findBysalaryinfoId(id);
	return employeeSalary;
	}

	/**
	 * To create a new salary information
	 */
	public SalaryInformation createEmployeeSalaryInformation(SalaryInformation entity) {
	Optional<SalaryInformation> employeeSalary = repository.findBysalaryinfoId(entity.getEmployee_ID_Number());

	if(employeeSalary.isPresent()) {
	return this.updateEmployeeSalaryInformation( entity);
	} else {
	entity = repository.save(entity);
	return entity;
	}
	}
	
	/**
	 * To delete the salary information data of an employee based on employeeIdNumber
	 */
	public void deleteEmployeeSalaryInfoById(int id) {
	Optional<SalaryInformation> employeeSalary = repository.findBysalaryinfoId(id);    
	if(employeeSalary.isPresent()) {
	repository.deleteBysalaryinfoId(id);
	}
	else {
	return;
	}

	}
	
	/**
	 * Used to update the salary information of an existing employee
	 */

	public SalaryInformation updateEmployeeSalaryInformation(SalaryInformation entity) {
	Optional<SalaryInformation> employeeSalary = repository.findBysalaryinfoId(entity.getSalaryinfoId());

	if(employeeSalary.isPresent()) {
	SalaryInformation newEntity = employeeSalary.get();
	newEntity.setEmployee_ID_Number(entity.getEmployee_ID_Number());
	newEntity.setMonthly_Salary(entity.getMonthly_Salary());
	newEntity.setMonthly_Money_Currency(entity.getMonthly_Money_Currency());
	newEntity.setMonthly_Taxes(entity.getMonthly_Taxes());
	newEntity.setMonthly_Deductions(entity.getMonthly_Deductions());
	newEntity.setMonthly_Insurances(entity.getMonthly_Insurances());
	newEntity.setMs_From_Date_Day(entity.getMs_From_Date_Day());
	newEntity.setMs_From_Date_Month(entity.getMs_From_Date_Month());
	newEntity.setMs_From_Date_Year(entity.getMs_From_Date_Year());
	newEntity.setMs_To_Date_Day(entity.getMs_To_Date_Day());
	newEntity.setMs_To_Date_Month(entity.getMs_To_Date_Month());
	newEntity.setMs_To_Date_Year(entity.getMs_To_Date_Year());
	
	newEntity.setWeekly_Salary(entity.getWeekly_Salary());
	newEntity.setWeekly_Money_Currency(entity.getWeekly_Money_Currency());
	newEntity.setWeekly_Taxes(entity.getWeekly_Taxes());
	newEntity.setWeekly_Deductions(entity.getWeekly_Deductions());
	newEntity.setWeekly_Insurances(entity.getWeekly_Insurances());
	newEntity.setWs_From_Date_Day(entity.getWs_From_Date_Day());
	newEntity.setWs_From_Date_Month(entity.getWs_From_Date_Month());
	newEntity.setWs_From_Date_Year(entity.getWs_From_Date_Year());
	newEntity.setWs_To_Date_Day(entity.getWs_To_Date_Day());
	newEntity.setWs_To_Date_Month(entity.getWs_To_Date_Month());
	newEntity.setWs_To_Date_Year(entity.getWs_To_Date_Year());

	return newEntity;
	}
	else {
	entity = null;
	return entity;
	}
	}

}
