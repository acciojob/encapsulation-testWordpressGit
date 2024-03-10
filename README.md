Encapsulation in Java

STEPS:

/**
 * Encapsulation
 * 
 * Task 1:
 * Create a file Main.java and RWOnly.java in same package
 * 
 * Task 2:
 * create a class named RWOnly in RWOnly.java, with a private member variable name
 * 
 * Task 3:
 * create main function in Main.java, and crete an obj of class RWOnly in this file
 * 
 * Task 4:
 * try, setting a value to name, by directly accessing it using obj and also try printing it
 * 
 * Error: you might seen some error, please not it down in commnets
 * 
 * Task 5:
 * try implementing getter and setters member function in class RWOnly 
 * 
 * Task 6:
 * Now, try setting a value to name in Main function using setter function and access it's value using getter function
 * 
 * Learnings: 
 * Encapsulation is used for hidding data,
 * you can create a readOnly member, by just implementing getter funtion for that
 * Or you can also create a writeOnly member, by just implementing setter function for that
*/
package com.example;

public class RWOnly {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
package com.example;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Trying to set a value to name directly, this will give an error
        // obj.name = "John Doe";

        // Setting a value to name using setter function
        obj.setName("John Doe");

        // Accessing the value of name using getter function
        System.out.println(obj.getName());
    }
}
