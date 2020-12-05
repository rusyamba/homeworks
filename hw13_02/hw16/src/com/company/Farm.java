package com.company;

public class Farm {

    FarmAddress farmAddress;
    Cow cow;
    Sheep sheep;
    Horse horse;
    Owner owner;

    public Farm(){}

    public Farm (FarmAddress farmAddress, Cow cow, Sheep sheep, Horse horse, Owner owner) {
        this.farmAddress = farmAddress;
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;
        this.owner = owner;
    }

    public void printInfo(){
        System.out.println("Farm ");
        farmAddress.printInfo();
        cow.printInfo();
        sheep.printInfo();
        horse.printInfo();
        owner.printInfo();
    }

    public FarmAddress getFarmAddress() {
        return farmAddress;
    }

    public void setFarmAddress(FarmAddress farmAddress) {
        this.farmAddress = farmAddress;
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
