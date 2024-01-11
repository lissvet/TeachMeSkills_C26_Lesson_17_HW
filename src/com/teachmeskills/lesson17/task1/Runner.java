package com.teachmeskills.lesson17.task1;

import com.teachmeskills.lesson17.task1.service.TypeService;
/**
 * Create a generalized functional interface.
 * Write a class with a single method.
 * In this method, implement the logic:
        - if the number 1 is entered into the console,
        then: use an interface with a string type and pass the logic of reversing the string (outputting the string in reverse order)
        to the interface method.
        - If the number 2 is entered into the console,
        then: use an interface with integer type and pass the logic of finding the factorial of a number
        into the interface method.*/
public class Runner {

    public static void main(String[] args) {
        try {
            TypeService.doOperation();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
