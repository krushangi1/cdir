package com.example.directory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.directory.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email,Integer> {
	
//	@Query("SELECT * FROM email as  e WHERE e.directory_id = (:dirId) ")
//    public List<Email> findByDirectory(int dirId);
}
