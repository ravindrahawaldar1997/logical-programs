package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class LogicalPrograms {
    void fibonacciSeries() {
        Scanner sc = new Scanner(System.in);
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
    }

    public static void main(String[] args) {
        LogicalPrograms logicalPrograms = new LogicalPrograms();
        logicalPrograms.fibonacciSeries();
    }
}
