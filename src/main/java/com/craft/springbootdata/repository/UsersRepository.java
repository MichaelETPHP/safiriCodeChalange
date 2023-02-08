package com.craft.springbootdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.craft.springbootdata.model.interview_result;

@Repository
public interface UsersRepository extends JpaRepository<interview_result, Long> {

	
	List<interview_result> findByPublished(boolean published);
	List<interview_result> findByTitleContaining(String title);
	
	List<interview_result> findByTitle(String title);
	
}




