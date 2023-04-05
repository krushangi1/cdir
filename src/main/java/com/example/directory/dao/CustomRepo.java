package com.example.directory.dao;

import java.util.List;

import com.example.directory.entity.Email;

public interface CustomRepo {

	public List<Email> findByUserDirectory(int directory);

}
