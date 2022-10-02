package com.tidianedevr.employeemanager.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name; 
    private String email;
    private String job;
    private String phone; 
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;
    
    public Employee() {
    }
    public Employee(Long id, String name, String email, String job, String phone, String imageUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.job = job;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    @Override
    public String toString() {
        return "employee [email=" + email + ", employeeCode=" + employeeCode + ", id=" + id + ", imageUrl=" + imageUrl
                + ", job=" + job + ", name=" + name + ", phone=" + phone + "]";
    }
}
