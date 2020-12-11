package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pets: ");
    Parrot par1 = new Parrot("Kesha", 2);
    Parrot pa2 = new Parrot("Vjik", 1);
    Dog dog1 = new Dog("Lassy",3,"female","Tom");
    Dog dog2 = new Dog("Dix", 2, "male","Jimmy");
    Cat cat1 = new Cat("Kissy",4,"female","John");
    Cat cat2 = new Cat("Peppa",5,"female","Antony");
    Fish fish1 = new Fish("Nemo", 1,"Arthur");
    Fish fish2 = new Fish("Dorry", 2,"Micky");

        System.out.println("Parrot info: " + par1);
        System.out.println("Dog info: " + dog2);
        System.out.println("Cat info: " + cat1);
        System.out.println("Fish info: " + fish2);


        System.out.println("Group: ");

        Student student1 = new Student("17.02.2009","Cena","John",'m',11);
        Student student2 = new Student("15.06.2005","McGregor","Conor",'m',15);

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        Group group = new Group(students,1,"11.11.2020","9 months");

        Course course = new Course("Java","12.10.2020","JV-f20","Rustam","Bolotov","Jenishbekovich");

        for(int i = 0; i < group.getStudent().length; i++) {
            System.out.println(group.getStudent()[i].getName());
        }
        System.out.println("Course: " + group.getCourse());
        System.out.println("Data: " + group.getDate());
        System.out.println("Duration: " + group.getDuration());

    }
}
