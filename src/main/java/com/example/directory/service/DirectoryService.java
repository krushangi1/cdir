package com.example.directory.service;

import java.util.List;

import com.example.directory.entity.Directory;

public interface DirectoryService {
    public List<Directory> getDirectories();
    public Directory findById(int directoryId);
    public void deleteById(int directoryId);
    public void saveDirectory(Directory directoryList);
    //public boolean update(Directory tempDirectory);

    //custom
    //public List<Directory> findByUser(int directoryId);
}
