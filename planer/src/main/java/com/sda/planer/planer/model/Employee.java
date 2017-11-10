package com.sda.planer.planer.model;



import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.util.List;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    @Enumerated(EnumType.STRING)
    private EmployeeDepartment department;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "attendees")
    private List<Meeting> meetingList;

    public Employee(long id, String firstName, String lastName, String phoneNumber, String email, EmployeeDepartment department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.department = department;
    }

    public String getFormattedDepartment(){
        String lowerCased = StringUtils.lowerCase(department.toString());
        return StringUtils.capitalize(lowerCased);
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
