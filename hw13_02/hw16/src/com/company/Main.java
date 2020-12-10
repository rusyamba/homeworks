package com.company;

public class Main {

    public static void main(String[] args) {
        FarmAddress address1 = new FarmAddress("Central park", 153);
        Cow cow = new Cow(90, 3, "female", "Jessie");
	    Sheep sheep = new Sheep(30, 2, "male", "Lolly");
	    Horse horse = new Horse(75, 4, "female", "Dangerous");
	    Owner owner1 = new Owner("Barry", "Allen", "West");

        Farm farm = new Farm(address1, cow, sheep, horse, owner1);
        farm.printInfo();



        Cow cow1 = new Cow(88, 1, "male", "Strange");
        Cow cow2 = new Cow(95, 3, "male", "Strong");
        Cow cow3 = new Cow(125, 4,"female", "Pussy");
        Cow cow4 = new Cow(140, 6,"female", "Granny");
        Cow cow5 = new Cow(60, 1, "male", "Little");

        Sheep sheep1 = new Sheep(50, 6,"female", "Joe");
        Sheep sheep2 = new Sheep(90, 4, "male", "Steve");
        Sheep sheep3 = new Sheep(65, 3, "female", "Shelly");

        Horse horse1 = new Horse(87, 5,"male", "Spirit");
        Horse horse2 = new Horse(70, 3,"female", "Centaur");

        //Farm farm1 = new Farm(address1, cow1,cow2,cow3,cow4,cow5, sheep1,sheep2,sheep3, horse1,horse2, owner1);
        //farm1.printInfo();

        Cow cow6 = new Cow(77,2,"male", "Rainbow");
        Sheep sheep4 = new Sheep(60, 4, "female", "Dash");
        Horse horse3 = new Horse(135, 3,"female", "Luna");

        Farm farm2 = new Farm(address1,cow6, sheep4, horse3, owner1);
        farm2.printInfo();

        
    }
}
