package com.example.directory.service;

import java.util.List;

import com.example.directory.dao.CustomRepo;
import com.example.directory.dao.EmailRepository;
import com.example.directory.entity.Contact;
import com.example.directory.entity.Directory;
import com.example.directory.entity.Email;

public interface EmailService  {

    public List<Email> findAll();
    public Email findById(int emailId);
    public void deleteById(int emailId);
    public Email saveEmail(Email email);
	List<Email> findEmailByUserDirectory(int directory);

    //custom
    //public List<Email> findByUser(int directoryId);
}
interface EmailRepo {

//	public List<Address> findAddressByUserDirectory(int directory);
//	public List<Contact> findContactByUserDirectory(int directory);
	public List<Email> findEmailByUserDirectory(int directory);

}