package com.example.directory.service;

import java.util.List;

import com.example.directory.dao.EmailRepository;
import com.example.directory.entity.Email;

public interface EmailService extends EmailRepository {

    public List<Email> findAll();
    public Email findEmailById(int emailId);
    public void deleteById(int emailId);
    public void saveEmail(Email email);
    //public void update(Email tempEmail);

    //custom
    //public List<Email> findByUser(int directoryId);
}
