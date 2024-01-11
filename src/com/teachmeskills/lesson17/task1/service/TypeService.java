package com.teachmeskills.lesson17.task1.service;

import com.teachmeskills.lesson17.task1.util.FunctionInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TypeService {

    public static void doOperation() throws InputMismatchException {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter operation number (1 or 2): ");
            int n = scan.nextInt();
            scan.nextLine();
            switch (n) {
                case 1:

                    System.out.println("Enter the string: ");
                    FunctionInterface<StringBuilder> stringOperation;
                    stringOperation = stringbuild -> {
                        return stringbuild.reverse();
                    };
                    StringBuilder clientString = new StringBuilder(scan.nextLine());
                    System.out.println(stringOperation.operation(clientString));
                    break;

                case 2:

                    System.out.println("Enter the integer: ");
                    FunctionInterface<Integer> intOperation;
                    intOperation = factorial -> {
                        int result = factorial;
                        for (int i = 2; i < factorial; i++) {
                            result *= i;
                        }
                        return result;
                    };
                    System.out.println(intOperation.operation(scan.nextInt()));
                    scan.nextLine();
                    break;

                default:

                    System.out.println("Incorrect value entered.");

            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid data format");
        }
    }

}
