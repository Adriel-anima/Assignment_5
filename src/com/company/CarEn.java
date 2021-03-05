package com.company;

public interface CarEn {
    default public void engineOk(){
        System.out.println("Engine is working correctly");
    }
    public void engineBroken();
}
