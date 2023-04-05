package com.example.directory.service;

import java.util.List;

import com.example.directory.dao.CustomRepo;
import com.example.directory.entity.Contact;

public interface ContactService extends CustomRepo{
    public List<Contact> getContacts();
    public Contact findById(int contactId);
    public void deleteById(int contactId);
    public Contact saveContact(Contact tempContact);
   // public void update(Contact tempContact);

    //custom
   // public List<Contact> findByUser(int directoryId);
}
