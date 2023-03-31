package com.example.directory.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.directory.dao.DirectoryRepository;
import com.example.directory.entity.Directory;
import com.example.directory.service.DirectoryService;

@Service
public  abstract class DirectoryServiceImpl implements DirectoryService {

    private DirectoryRepository directoryRepository;
    @Autowired
    public DirectoryServiceImpl(DirectoryRepository directoryRepository){
        this.directoryRepository=directoryRepository;
    }

    @Override
    public List<Directory> getDirectories(){
        return directoryRepository.findAll();
    }
    public DirectoryServiceImpl() {
		super();
	}

	@Override
    public Directory findById(int directoryId){
        return directoryRepository.getById(directoryId);
    }
    @Override
    public void deleteById(int directoryId){
        directoryRepository.deleteById(directoryId);
    }
    @Override
    public void saveDirectory(Directory tempDirectory){
        directoryRepository.save(tempDirectory);
    }
}
