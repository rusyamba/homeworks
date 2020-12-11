package com.company;

public class Dog {
    String name;
    int age;
    String gender;
    String owner;

    public void printInfo(){
        System.out.println("Dog: Name - " + name + ", Age - " + age + ", Gender - " + gender + ", Owner - " + owner);
    }

    public Dog(String name, int age, String gender, String owner) {
        this.name = name;
        setAge(age);
        this.gender = gender;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(true){

        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
