package oop.overloading;


public class Student {
    private String name;
    private String surname;
    private int age;
    private int indexNumber;
    private int yearOfStudy;
//Kazdy z konstruktorów posiada inna sygnature
    public Student(){
        System.out.println("Tworzenie studenta z uyciem konstruktora bezparametrowego");
    }

    public Student(int age) {
        this.age = age;
    }


    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
        System.out.println("Tworzenie studenta z uzyciem kontruktora parametrowego");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }




}
