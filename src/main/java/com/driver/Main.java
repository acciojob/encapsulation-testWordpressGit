package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly object=new RWOnly();

        //System.out.println(object.string);
        //java: string has private access in com.driver.RWOnly

        object.setName("Encapsulation in Java");
        String string=object.getName();
        System.out.println(string);
    }
}