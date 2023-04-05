package com.example.directory.service;

import java.util.List;

import com.example.directory.dao.CustomRepo;
import com.example.directory.dao.EmailRepository;
import com.example.directory.entity.Email;

public interface EmailService extends CustomRepo {

    public List<Email> findAll();
    public Email findById(int emailId);
    public void deleteById(int emailId);
    public Email saveEmail(Email email);
    //public void update(Email tempEmail);

    //custom
    //public List<Email> findByUser(int directoryId);
}
