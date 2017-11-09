package com.sda.planer.planer.model;

import lombok.Data;

import javax.persistence.*;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String phoneNumber;
    private String email;
    @Enumerated(EnumType.STRING)
    private EmployeeDepartment department;

    public Employee(long id, String firstName, String phoneNumber, String email, EmployeeDepartment department) {
        this.id = id;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.department = department;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeDepartment getDepartment() {
        return department;
    }

    public void setDepartment(EmployeeDepartment department) {
        this.department = department;
    }
}
