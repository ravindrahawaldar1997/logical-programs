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

    static void toBinary() {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to convert in binary ");
        num = scan.nextInt();
        String binary = "";
        int i = 0;
        int num1;
        while (num > 0) {
            num1 = num % 2;
            binary = num1 + binary;
            num = num / 2;
            i++;
        }
        System.out.println(binary);
        while (binary.length() < 8) {

            binary = "0" + binary;
        }
        System.out.println("Padding of Binary is " + binary);
    }

    static void binary() {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to convert in binary ");
        num = scan.nextInt();
        String binary = "";
        String binarySwap = "";
        int i = 0;
        int num1;
        while (num > 0) {
            num1 = num % 2;
            binary = num1 + binary;
            num = num / 2;
            i++;
        }
        System.out.println(binary);
        while (binary.length() < 8) {

            binary = "0" + binary;
        }
        System.out.println("Padding of Binary is " + binary);
        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4, binary.length());

        binarySwap = nibble2 + nibble1;
        System.out.println("After swapping nibbles new number is " + binarySwap);
        int result = Integer.parseInt(binarySwap);
        int decimal = 0;
        int pow = 0;

        while (result > 0) {
            int rem = result % 10;
            decimal = (int) (decimal + rem * Math.pow(2, pow));
            result = result / 10;
            pow++;
        }
        System.out.println("Decimal number for " + binarySwap + " is " + decimal);

    }

    public static void main(String[] args) {
        LogicalPrograms logicalPrograms = new LogicalPrograms();
        logicalPrograms.vendingMachine();
        squareRoot();
        toBinary();
        binary();

    }
}
