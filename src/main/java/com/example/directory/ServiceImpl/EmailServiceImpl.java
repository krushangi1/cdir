package com.example.directory.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.directory.dao.EmailRepository;
import com.example.directory.entity.Email;
import com.example.directory.service.EmailService;

@Service
public abstract class EmailServiceImpl implements EmailService {


    private EmailRepository emailRepository;
    @Autowired
    public EmailServiceImpl(EmailRepository theEmailRepository){
        emailRepository = theEmailRepository;
    }



    public EmailServiceImpl() {
		super();
	}



	@Override
    public List<Email> findAll(){
        return emailRepository.findAll();
    }

    @Override
    public Email findEmailById(int emailId){
        Optional<Email> result = emailRepository.findById(emailId);
        Email theEmail = null;

        if (result.isPresent()) {
            theEmail = result.get();
        }
        else {
            throw new RuntimeException("Did not find the email with id - " + emailId);
        }

        return theEmail;
    }
    @Override
    public void deleteById(int emailId){

        emailRepository.deleteById(emailId);
    }
    @Override
    public void saveEmail(Email emailList){

        emailRepository.save(emailList);
    }


}
