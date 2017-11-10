package com.sda.planer.planer.model;

import org.hibernate.annotations.Fetch;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Entity
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    @ManyToOne
    private Room room;
    @ManyToMany
    private List<Employee> attendees;
    @ManyToOne
    private Employee owner;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public Meeting() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Employee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Employee> attendees) {
        this.attendees = attendees;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
