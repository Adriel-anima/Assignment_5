package com.company;

public class Car {
    private String name;
    private double price;

    public Car(String name , double price)
    {
        this.name = name ;
        this.price = price;

    }

    public String carName() {
        if (name == "Ford") {
            return "You have a nice taste";
        }
        else return "I guess you have a corona";
    }

    public String carPrice() {
        if (price>20000000) {
            return "Senior";
        }
        else return "Just a Junior";
    }
}





