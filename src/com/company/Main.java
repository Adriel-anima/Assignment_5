package com.company;

import java.lang.reflect.InvocationTargetException;

public class Main{

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        String name = "Ford";
        double price = 35000000;

        final Car c  = Car.class.getConstructor(String.class, double.class).newInstance(name,price);

       CarEn car = new CarEn(){
           public void engineBroken(){
               System.out.println("Engine is broken");
           }

       };

        System.out.println(c.carPrice());
        System.out.println(c.carName());
        car.engineOk();
        car.engineBroken();








    }
}
