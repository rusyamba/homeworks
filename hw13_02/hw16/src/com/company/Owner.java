package com.company;

public class Owner {
    String name;
    String lastName;
    String patronymic;

    public Owner(String name, String lastName, String patronymic) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public void printInfo(){
        System.out.println("Owner: name - " + name + ", Lase name - " + lastName + ", patronymic - " + patronymic);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
