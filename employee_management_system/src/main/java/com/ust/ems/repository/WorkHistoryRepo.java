package com.ust.ems.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.ems.model.WorkHistory;


 //extends the JpaRepository 
 

@Repository
public interface WorkHistoryRepo extends JpaRepository<WorkHistory, Integer> {

	Optional<WorkHistory> findByworkhistoryIdNumber(int workhistoryIdNumber);
	void deleteByworkhistoryIdNumber(int workhistoryIdNumber);

}
