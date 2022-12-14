package com.r2g.springredisstudent.domain;

import java.io.Serializable;

public class Student implements Serializable {
    private String firstname;
    private String lastname;
    private String emailAddress;
    private String status;

    public Student() {
    }

    public Student(String firstname, String lastname, String emailAddress, String status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailAddress = emailAddress;
        this.status = status;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
