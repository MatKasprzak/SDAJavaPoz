package pl.sda.poznan.Factory;

import lombok.Data;

import java.util.Date;
@Data
public class Person {
    private String name;
    private String surname;
    private Date birthday;

    public Person(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;

    }
}
