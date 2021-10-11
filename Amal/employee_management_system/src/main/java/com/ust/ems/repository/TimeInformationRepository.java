package com.ust.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.ems.entity.TimeInformation;

 //extends the JpaRepository 
 
@Repository
public interface TimeInformationRepository extends JpaRepository<TimeInformation, Integer> {

//	Optional<TimeInformation> findBytimeinfoId(int timeinfoId);
//	void deleteBytimeinfoId(int timeinfoId);

}