package com.company;

public class Fish {
    String name;
    String owner;

    public void printInfo(){
        System.out.println("Fish: Name - " + name + ", Owner - " + owner);
    }

    public Fish(String name, int age, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
