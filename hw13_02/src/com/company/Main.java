package com.company;

public class Main {

    public static void main(String[] args) {
    Student studentOne = new Student();
    studentOne.course = 2;
    studentOne.age = 19;
    studentOne.gender = "male";
    studentOne.height = 182;


    Student studentTwo = new Student();
    studentTwo.course = 3;
    studentTwo.age = 20;
    studentTwo.gender = "female";
    studentTwo.height = 165;


    Student studentThree = new Student();
    studentThree.course = 1;
    studentThree.age = 18;
    studentThree.gender = "female";
    studentThree.height = 170;

        System.out.println("Students:");
    System.out.println(studentOne.course + " " + studentOne.age + " " + studentOne.gender + " " + studentOne.height + " ");
    System.out.println(studentTwo.course + " " + studentTwo.age + " " + studentTwo.gender + " " + studentTwo.height + " ");
    System.out.println(studentThree.course + " " + studentThree.age + " " + studentThree.gender + " " + studentThree.height + " ");

        Cupboard cupboardOne = new Cupboard();
        cupboardOne.doors = 4;
        cupboardOne.shelf = 10;
        cupboardOne.type = "wooden";
        cupboardOne.producerCountry = "KG";

        Cupboard cupboardTwo = new Cupboard();
        cupboardTwo.doors = 2;
        cupboardTwo.shelf = 4;
        cupboardTwo.type = "plastic";
        cupboardTwo.producerCountry = "China";

        Cupboard cupboardThree = new Cupboard();
        cupboardThree.doors = 10;
        cupboardThree.shelf = 18;
        cupboardThree.type = "Glass";
        cupboardThree.producerCountry = "Spain";

        System.out.println("Cupboards:");
        System.out.println(cupboardOne.doors + " " + cupboardOne.shelf + " " + cupboardOne.type + " " + cupboardOne.producerCountry + " ");
        System.out.println(cupboardTwo.doors + " " + cupboardTwo.shelf + " " + cupboardTwo.type + " " + cupboardTwo.producerCountry + " ");
        System.out.println(cupboardThree.doors + " " + cupboardThree.shelf + " " + cupboardThree.type + " " + cupboardThree.producerCountry + " ");
    }
}
