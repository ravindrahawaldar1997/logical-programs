package com.bridgelabz.logical_program_two;

import java.util.Scanner;

public class LogicalPrograms {
    Scanner sc = new Scanner(System.in);

    void vendingMachine() {
        int amount = 0;
        System.out.println("Enter the amount to check the notes");
        amount = sc.nextInt();
        int notes;
        int rupees = 0;
        while (amount != 0) {
            if (amount >= 1000) {
                rupees = 1000;
            }
            if (amount >= 500 && amount < 1000) {
                rupees = 500;
            }
            if (amount >= 100 && amount < 500) {
                rupees = 100;
            }
            if (amount >= 50 && amount < 100) {
                rupees = 50;
            }
            if (amount >= 10 && amount < 50) {
                rupees = 10;
            }
            if (amount >= 5 && amount < 10) {
                rupees = 5;
            }
            if (amount >= 2 && amount < 5) {
                rupees = 2;
            }
            if (amount >= 1 && amount < 2) {
                rupees = 1;
            }
            notes = amount / rupees;
            System.out.println("Number of " + rupees + " rupees notes required is " + notes);
            amount %= rupees;
        }
    }

    public static int getIntValue() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    static double squareRoot() {
        System.out.println("Enter positive Integer value ");
        double c = LogicalPrograms.getIntValue();
        double t = c;
        t = ((c / t) + t) / 2;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = ((c / t) + t) / 2;
        }
        System.out.println(t);
        return t;
    }
    public static void main(String[] args) {
        LogicalPrograms logicalPrograms =new LogicalPrograms();
        logicalPrograms.vendingMachine();
        squareRoot();

    }
}
