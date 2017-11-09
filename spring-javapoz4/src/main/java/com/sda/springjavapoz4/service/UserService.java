package com.sda.springjavapoz4.service;

import com.sda.springjavapoz4.model.User;
import com.sda.springjavapoz4.service.generator.FirstNameGenerator;
import com.sda.springjavapoz4.service.generator.LastNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserService {

    private List<User> users;


    @Autowired
    static
    FirstNameGenerator firstNameGenerator = new FirstNameGenerator();

    @Autowired
    static
    LastNameGenerator lastNameGenerator = new LastNameGenerator();

    public UserService() {
        this.users = new ArrayList<>();


        // users.forEach
    }

    @PostConstruct
    public void init() {
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());

        users.forEach(user -> System.out.println(user));
    }

    public User getUser(int id) {
        return id >= users.size() ? null : users.get(id);
    }

    public static User getExampleUser() {
        User user = new User();
        user.setId(1);
        user.setFirstName(firstNameGenerator.getRandomFirstName());
        user.setLastName(lastNameGenerator.getRandomLastName());
        user.setPhoneNumber("888222555");
        return user;
    }

    public List<User> getUsersByFirstName(String firstName) {
        List<User> usersByName = null;
       return users.stream()
                .filter(user -> user.getFirstName().equals(firstName))
                .collect(Collectors.toList());
    }
}

