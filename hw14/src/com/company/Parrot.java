package com.company;

public class Parrot {
    String name;
    int age;


    public void printInfo(){
        System.out.println("Parrot: Name - " + name + ", Age - " + age);
    }

    public Parrot(String name, int age) {
        this.name = name;
        setAge(age);

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


}
