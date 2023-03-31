package com.example.directory.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "directory")
public class Directory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "directory_id")
    private int directoryId;

    @Column(name = "Full name")
    private String fullName;

    @Column(name = "created_at")
    private Timestamp createsAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;


    //mapping to contact,email,address
    @OneToMany(mappedBy = "directory",cascade={CascadeType.ALL})
    private List<Email> emails;
    @OneToMany(mappedBy = "directory",cascade={CascadeType.ALL})
    private List<Contact> contacts;
    @OneToMany(mappedBy = "directory",cascade={CascadeType.ALL})
    private List<Address> addresses;

    //getter & setters

    public Directory() {
    }
    public Directory(String fullName, Timestamp createsAt, Timestamp updatedAt) {
        this.fullName = fullName;
        this.createsAt = createsAt;
        this.updatedAt = updatedAt;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Timestamp getCreatesAt() {

        return createsAt;
    }
    public void setCreatesAt(Timestamp createsAt) {
        this.createsAt = createsAt;
    }
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
    public int getDirectoryId() {
        return directoryId;
    }
    public void setDirectoryId(int directoryId) {
        this.directoryId = directoryId;
    }
    @Override
    public String toString() {
        return "Directory{" +
                "directoryId=" + directoryId +
                ", fullName='" + fullName + '\'' +
                ", createsAt=" + createsAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    //getter & setter for mapped field
    public List<Email> getEmails(){
        return emails;
    }
    public List<Contact> getContacts(){
        return contacts;
    }
    public List<Address> getAddresses(){
        return addresses;
    }
    public void setEmails(List<Email> emails){
        this.emails=emails;
    }
    public void setContacts(List<Contact> contacts){
        this.contacts=contacts;
    }
    public void setAddresses(List<Address> addresses){
        this.addresses=addresses;
    }


    //add method for bidirectional relationship
    public void addEmail(Email tempEmail){
        if(emails==null){
            emails=new ArrayList<>();
        }
        emails.add(tempEmail);
        tempEmail.setDirectory(this.directoryId);
    }
    public void addAddress(Address tempAddress){
        if(addresses==null){
            addresses=new ArrayList<>();
        }
        addresses.add(tempAddress);
        tempAddress.setDirectory(this.directoryId);
    }
    public void addContact(Contact tempContact){
        if(contacts==null){
            contacts=new ArrayList<>();
        }
        contacts.add(tempContact);
        tempContact.setDirectory(this.directoryId);
    }

}
