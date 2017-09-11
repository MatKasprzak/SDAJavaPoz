package pl.sda.poznan.AnonymousCalss;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
public class Employee {
    public Employee() {
    }

    private String name;
    private String surname;
    private Integer age;
    private Integer salary;

    public Employee(String name, String surname, Integer age, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}


