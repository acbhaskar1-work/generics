package com.chitkara.exception;

public class ExceptionDemo {

    // 1. "throws" declares that this method *might* look for trouble and pass it up
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // 2. "throw" is the actual trigger that flings the exception object
            throw new IllegalArgumentException("Must be 18 or older to register.");
        }
        System.out.println("Registration successful!");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

