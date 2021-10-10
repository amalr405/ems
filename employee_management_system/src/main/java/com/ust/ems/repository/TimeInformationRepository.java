package com.ust.ems.repository;



import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.ems.model.TimeInformation;


 //extends the JpaRepository 
 

@Repository
public interface TimeInformationRepository extends JpaRepository<TimeInformation, Integer> {

	Optional<TimeInformation> findBytimeinfoId(int timeinfoId);
	void deleteBytimeinfoId(int timeinfoId);

}
