package com.ust.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ust.ems.entity.SalaryInformation;

/**
 * Extends the JpaRepository
 */

@Repository
public interface SalaryInformationRepository extends JpaRepository<SalaryInformation, Integer> {
//	Optional<SalaryInformation> findBysalaryinfoId(int salaryinfoId);
//	void deleteBysalaryinfoId(int salaryinfoId);

}