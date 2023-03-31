package com.example.directory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.directory.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email,Integer> {
    //public List<Email> findByUser(int directoryId);
}
