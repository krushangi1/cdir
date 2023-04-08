package com.example.directory.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.directory.dao.DirectoryRepository;
import com.example.directory.entity.Contact;
import com.example.directory.entity.Directory;
import com.example.directory.service.DirectoryService;

@Service
public   class DirectoryServiceImpl implements DirectoryService {

    private DirectoryRepository directoryRepository;
    
    public DirectoryServiceImpl() {
		super();
	}
    
    @Autowired
    public DirectoryServiceImpl(DirectoryRepository directoryRepository){
        this.directoryRepository=directoryRepository;
    }

    //----------------------------find all directories
    @Override
    public List<Directory> getDirectories(){
        return directoryRepository.findAll();
    }
    
    //----------------------------find directory by id
	@Override
    public Directory findById(int directoryId){
		Optional<Directory> tempDirectory=directoryRepository.findById(directoryId);
		Directory theDirectory = null;
		if( tempDirectory.isPresent() ) {
			theDirectory=tempDirectory.get();
		}
		else {
            throw new RuntimeException("Did not find the directory with id - " + directoryId);
        }
		System.out.println(theDirectory);
        return theDirectory;
    }
	
	//----------------------------delete email by id
    @Override
    public void deleteById(int directoryId){
    	Optional<Directory> tempDirectory=directoryRepository.findById(directoryId);
		Directory theDirectory = null;
		if( tempDirectory.isPresent() ) {
			theDirectory=tempDirectory.get();
		}
		else {
            throw new RuntimeException("Did not find the directory with id - " + directoryId);
        }
        directoryRepository.deleteById(directoryId);
    }

    //----------------------------save or delete email by id
    @Override
    public Directory saveDirectory(Directory tempDirectory) {
         return directoryRepository.save(tempDirectory);
    }
}
