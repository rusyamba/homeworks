package com.company;

public class FarmAddress {
    String address;
    int number;

    public FarmAddress(String address, int number) {
        this.address = address;
        this.number = number;
    }

    public void printInfo(){
        System.out.println("Farm address - " + address + ", number - " + number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
