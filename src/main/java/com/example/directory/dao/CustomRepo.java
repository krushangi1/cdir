package com.example.directory.dao;

import java.util.List;

import com.example.directory.entity.Address;
import com.example.directory.entity.Contact;
import com.example.directory.entity.Email;

public interface CustomRepo {

	public List<Address> findAddressByUserDirectory(int directory);
//	public List<Contact> findContactByUserDirectory(int directory);
//	public List<Email> findEmailByUserDirectory(int directory);

}
