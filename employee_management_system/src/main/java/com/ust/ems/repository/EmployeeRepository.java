package com.ust.ems.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.ems.model.EmployeeBasicDetails;

/*
 * EmployeeBasicDetailsRepository 

 */

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeBasicDetails, Integer> {

	Optional<EmployeeBasicDetails> findByemployeeIdNumber(int employee_id_number);

	void deleteByemployeeIdNumber(int employee_id_number);
}
