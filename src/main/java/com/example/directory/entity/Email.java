package com.example.directory.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
@JsonIdentityInfo(
		scope = Email.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "emaiId")
@Table(name = "email")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private int emaiId;

//    @ManyToOne
    @Column(name = "directory_id")
    private int directory;
    
    @Column(name = "email")
    private String email;

    @Column(name = "type")
    private String type;

    public int getEmaiId() {
        return emaiId;
    }

    public Email() {
    }

    public Email(int directoryId, String email, String type) {
        this.directory = directoryId;
        this.email = email;
        this.type = type;
    }

    public void setEmaiId(int emaiId) {
        this.emaiId = emaiId;
    }

    public int getDirectory() {
        return directory;
    }

    public void setDirectory(int directoryId) {
        this.directory = directoryId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Email{" +
                "emaiId=" + emaiId +
                ", directory=" + directory +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
