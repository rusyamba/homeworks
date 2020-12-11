package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Course {
    String name;
    String date;
    String id;
    String firstName;
    String lastName;
    String patronymic;

    public void printInfo(){
        System.out.println("Course: Name - " + name + ", Date create - " + date + ", ID - " + id + ", First name - " + firstName + ", Last name - " + lastName + ", Patronymic - " + patronymic);
    }


    public Course(String name, String date, String  id, String firstName, String lastName, String patronymic) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String dateCreate) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
