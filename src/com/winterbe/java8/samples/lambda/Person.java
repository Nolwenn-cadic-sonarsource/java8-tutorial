package com.winterbe.java8.samples.lambda;

/**
* @author Benjamin Winterberg
*/
public class Person {
    public String firstName;
    public String lastName;

    public Person() {}

    // Dummy change to trigger PR
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
