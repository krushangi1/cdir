package com.example.directory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.directory.entity.Directory;

@Repository
public interface DirectoryRepository extends JpaRepository<Directory,Integer> {
}
