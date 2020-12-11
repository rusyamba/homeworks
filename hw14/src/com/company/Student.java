package com.company;

import java.time.LocalDate;

public class Student {
    String yearOfBirth;
    String lastName;
    String name;
    char gender;
    int age;

    public void printInfo(){
        System.out.println("Student: Year of birth - " + yearOfBirth + ", Last name - " + lastName + ", Name - " + name + ", Gender - " + gender + ", Age - " + age);
    }

    public Student(String yearOfBirth, String lastName, String name, char gender, int age) {
        this.yearOfBirth = yearOfBirth;
        this.lastName = lastName;
        this.name = name;
        this.gender = gender;
        setAge(age);
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(true) {

        }
        this.age = age;
    }
}

