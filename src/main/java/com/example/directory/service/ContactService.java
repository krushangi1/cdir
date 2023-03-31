package com.example.directory.service;

import java.util.List;

import com.example.directory.entity.Contact;

public interface ContactService {
    public List<Contact> getContacts();
    public Contact findById(int contactId);
//    public void deleteById(int contactId);
//    public void saveContact(Contact tempContact);
   // public void update(Contact tempContact);

    //custom
   // public List<Contact> findByUser(int directoryId);
}
