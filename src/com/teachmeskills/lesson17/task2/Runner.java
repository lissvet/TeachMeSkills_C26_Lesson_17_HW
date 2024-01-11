package com.teachmeskills.lesson17.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
/** Get day of the week by date */
public class Runner {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            SimpleDateFormat date = new SimpleDateFormat("EEEE");
            Calendar calendar = new GregorianCalendar();

            System.out.println("Enter the year (four digits): ");
            int year = scan.nextInt();
            if (year > 0) {
                calendar.set(Calendar.YEAR, year);
            } else {
                throw new InputMismatchException();
            }

            System.out.println("Enter the month (one or two digits, max - 12): ");
            int month = scan.nextInt();
            if (month > 0 && month <= 12) {
                calendar.set(Calendar.MONTH, (month - 1));
            } else {
                throw new InputMismatchException();
            }

            System.out.println("Enter the day (one or two digits, max - 31): ");
            int day = scan.nextInt();
            if (day > 0 && day <= 31) {
                calendar.set(Calendar.DATE, day);
            } else {
                throw new InputMismatchException();
            }

            System.out.println("Day of the week of this date: " + date.format(calendar.getTime()));
        } catch (InputMismatchException e) {
            System.out.println("Wrong data format");
        }
    }

}
