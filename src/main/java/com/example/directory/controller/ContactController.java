package com.example.directory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.directory.ServiceImpl.ContactServiceImpl;
import com.example.directory.entity.Contact;

@RestController
@RequestMapping("/api")
public class ContactController {
	
    private ContactServiceImpl contactServiceImpl;
    
    
    public ContactController() {
		
	}

	@Autowired
    public ContactController(ContactServiceImpl contactServiceImpl){
        this.contactServiceImpl=contactServiceImpl;
    }

    @GetMapping("/contacts")
    public List<Contact> findAll(){
        return contactServiceImpl.getContacts();
    }
    @GetMapping("/contacts/{contactId}")
    public Contact findById(@PathVariable int contactId){
        return contactServiceImpl.findById(contactId);
    }
//    @DeleteMapping("/contacts/{contactId}")
//    public void deleteById(@PathVariable int contactId){
//        contactServiceImpl.deleteById(contactId);
//    }
//    @PostMapping("/contacts")
//    public void saveContact(@RequestBody Contact tempContact){
//         contactServiceImpl.saveContact(tempContact);
//    }
}
