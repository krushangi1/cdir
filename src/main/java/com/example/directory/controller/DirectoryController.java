package com.example.directory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.directory.ServiceImpl.DirectoryServiceImpl;
import com.example.directory.entity.Address;
import com.example.directory.entity.Directory;
import com.example.directory.service.DirectoryService;

@RestController
@RequestMapping("/directory")
public class DirectoryController {

    
    DirectoryService directoryServiceImpl;
    
    
    public DirectoryController() {
    }


	@Autowired
    public DirectoryController(DirectoryServiceImpl directoryServiceImpl) {
    	this.directoryServiceImpl=directoryServiceImpl;
    }
    
	//----------------------------find all directories
    @GetMapping("/all")
    public List<Directory> getDirectories() {
        return directoryServiceImpl.getDirectories();
    }
    
    //----------------------------find directory by id
    @GetMapping("/all/{directoryId}")
    public Directory findById(@PathVariable("directoryId") int directoryId){
        return directoryServiceImpl.findById(directoryId);
    }
    
    //----------------------------delete directory by id
    @DeleteMapping("/all/{directoryId}")
    public void deleteById(@PathVariable int directoryId){
        directoryServiceImpl.deleteById(directoryId);
    }
    
    //----------------------------create directory
    @PostMapping("/all")
    public Directory saveDirectory(@RequestBody Directory tempDirectory){
    	tempDirectory.setDirectoryId(0);
        return directoryServiceImpl.saveDirectory(tempDirectory);
    }
    
    //----------------------------update address
    @PutMapping("all")
    public Directory updateContact(@RequestBody Directory tempDirectory){
    	Directory  theDirectory= directoryServiceImpl.saveDirectory(tempDirectory);
    	try{
        	return theDirectory;
        }
        catch(Exception e){
        	return null;
        }
    }
}
