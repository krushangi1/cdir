package com.example.directory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.directory.entity.Email;
import com.example.directory.service.EmailService;

@Controller
@RequestMapping("directory")
public class EmailController {
    
    private EmailService emailService;

    
    public EmailController() {
		super();
	}
    @Autowired
	public EmailController(EmailService emailService){
        this.emailService=emailService;
    }

    @GetMapping("/emails")
    public List<Email> getEmails(){
        System.out.println("in email controller ---------------------------------------");
        return emailService.findAll();

    }

    @GetMapping("/email/{id}")
    public Email findById(@PathVariable int emailId)
    {
        return emailService.findEmailById(emailId);

    }
    @DeleteMapping("/email/{emailId}")
    public void deleteById(@PathVariable int emailId){
        emailService.deleteById(emailId);
    }
    @PostMapping("/email")
    public Email saveEmail( @RequestBody Email tempEmail){
        return emailService.save(tempEmail);
    }
}