package com.company;

public class Main {

    public static void main(String[] args) {
        Human hum1 = new Human();

        hum1.setName("Rustam");
        hum1.setLastName("Bolotov");
        hum1.setPatronymic("Jenishbekovich");
        hum1.setYearOfBirth(2001);
        hum1.setHobby("Sleep");
        hum1.setGender("Male");

        System.out.println("Name: " + hum1.getName());
        System.out.println("Last name: " + hum1.getLastName());
        System.out.println("Patronymic: " + hum1.getPatronymic());
        System.out.println("Year of birth: " + hum1.getYearOfBirth());
        System.out.println("Hobby: " + hum1.getHobby());
        System.out.println("Gender: " + hum1.getGender());

    }
}
