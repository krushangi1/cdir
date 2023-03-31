package com.example.directory.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.directory.dao.ContactRepository;
import com.example.directory.entity.Contact;
import com.example.directory.service.ContactService;

@Service
public abstract class ContactServiceImpl implements ContactService {

    
    private ContactRepository contactRepository;
    
    
    
    public ContactServiceImpl() {
		super();
	}

	@Autowired
    public ContactServiceImpl(ContactRepository contactRepository){
        this.contactRepository=contactRepository;
    }

    @Override
    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }

    

	@Override
    public Contact findById(int contactId){
        return contactRepository.getById(contactId);
    }

//    @Override
//    public void deleteById(int contactId){
//        contactRepository.deleteById(contactId);
//    }
//
//    @Override
//    public void saveContact(Contact contactId){
//        contactRepository.save(contactId);
//    }
}
