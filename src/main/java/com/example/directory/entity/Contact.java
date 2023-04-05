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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private int contactId;

 //   @ManyToOne(cascade={CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE})
    @Column(name = "directory_id")
    private int directory;

    @Column(name = "no")
    private int no;

    @Column(name = "type")
    private String type;

    public Contact() {
    }

    public Contact(int directory_id, int no, String type) {
        this.directory = directory_id;
        this.no = no;
        this.type = type;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getDirectoryId() {
        return directory;
    }

    public void setDirectoryId(int directory_idId) {
        this.directory = directory_idId;
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
                ", directory_id=" + directory +
                ", no=" + no +
                ", type='" + type + '\'' +
                '}';
    }
}
