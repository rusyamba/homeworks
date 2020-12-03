package com.company;

import javax.naming.Name;

public class Human {
    String name;
    String lastName;
    String patronymic;
    int yearOfBirth;
    String hobby;
    String gender;

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPatronymic(){
        return patronymic;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public String getHobby(){
        return hobby;
    }

    public String getGender(){
        return gender;
    }

}
