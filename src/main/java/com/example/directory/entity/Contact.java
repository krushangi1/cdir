package com.example.directory.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contact_id")
    private int contactId;

//    @ManyToOne(cascade={CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE})
    @Column(name = "directory_id")
    private int directory;

    @Column(name = "no")
    private int no;

    @Column(name = "type")
    private String type;

    public Contact() {
    }

    public Contact(int directory, int no, String type) {
        this.directory = directory;
        this.no = no;
        this.type = type;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getDirectory() {
        return directory;
    }

    public void setDirectory(int directoryId) {
        this.directory = directoryId;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", directoryId=" + directory +
                ", no=" + no +
                ", type='" + type + '\'' +
                '}';
    }
}
