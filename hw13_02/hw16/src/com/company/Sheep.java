package com.company;

public class Sheep {
    int weight;
    int age;
    String gender;
    String name;

    public Sheep(int weight, int age, String gender, String name) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Sheep: weight - " + weight + ", age - " + age + ", gender - " + gender + ", name - " + name);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
