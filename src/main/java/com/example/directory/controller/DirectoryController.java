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

import com.example.directory.ServiceImpl.DirectoryServiceImpl;
import com.example.directory.entity.Directory;

@RestController
@RequestMapping("/directory")
public class DirectoryController {

    
    DirectoryServiceImpl directoryServiceImpl;
    
    
    public DirectoryController() {
    }


	@Autowired
    public DirectoryController(DirectoryServiceImpl directoryServiceImpl) {
    	this.directoryServiceImpl=directoryServiceImpl;
    }
    

    @GetMapping("/all")
    public List<Directory> getDirectories() {
        return directoryServiceImpl.getDirectories();
    }
    @GetMapping("/all/{directoryId}")
    public Directory findById(int directoryId){
        return directoryServiceImpl.findById(directoryId);
    }
    @DeleteMapping("/all/{directoryId}")
    public void deleteById(@PathVariable int directoryId){
        directoryServiceImpl.deleteById(directoryId);
    }
    @PostMapping("/all")
    public void saveDirectory(@RequestBody Directory tempDirectory){
         directoryServiceImpl.saveDirectory(tempDirectory);
    }
}
