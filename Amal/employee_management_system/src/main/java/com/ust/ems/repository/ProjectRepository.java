package com.ust.ems.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ust.ems.entity.EmployeeDetails;

@Repository
public interface ProjectRepository extends JpaRepository<EmployeeDetails,Integer>{

	//Query for Selecting Employees by First Name
	
	 @Query("from EmployeeDetails where First_Name = ?1")
	public Object findByFirst_nameAll(String firstname);
	 
	 //Query for Selecting Employees by Gender
	 
	 @Query("from EmployeeDetails where Gender = ?1")
	public List<EmployeeDetails> findByGenderAll(String gender);
	 
	 //Query for Selecting Employees by City
	 
	 @Query("from EmployeeDetails where City = ?1")
	public Object findByCityAll(String city);
}
