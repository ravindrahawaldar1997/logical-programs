package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class LogicalPrograms {
    Scanner sc = new Scanner(System.in);

    void fibonacciSeries() {
        System.out.println("Enter the number fibonacci series you want");
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < number; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    int perfectNumber() {
        System.out.println("Enter the number to find is perfect number or not");
        int number = sc.nextInt();
        int perfect = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                perfect += i;
            }
        }
        if (perfect == number) {
            System.out.println(+number + " " + "is a perfect number ");
        } else {
            System.out.println(+number + " " + "is not a perfect number");
        }
        return number;
    }

    int primeNumber() {
        System.out.println("Enter a number to check it weather is prime number");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && number != 1) {
            System.out.println(+number + " " + "is a prime number");
        } else {
            System.out.println(+number + " is not a prime number");
        }
        return number;
    }

    int reverseNumber() {
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int rem;
        int reverse = 0;
        System.out.println("The entered number is " + number);
        while (number != 0) {
            rem = number % 10;
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }
        System.out.println("The reverse number of the entered number " + reverse);
        return reverse;
    }

    public static void main(String[] args) {
        LogicalPrograms logicalPrograms = new LogicalPrograms();
        logicalPrograms.fibonacciSeries();
        logicalPrograms.perfectNumber();
        logicalPrograms.primeNumber();
        logicalPrograms.reverseNumber();
    }
}
