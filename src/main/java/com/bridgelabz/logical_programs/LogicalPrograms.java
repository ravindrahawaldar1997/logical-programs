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
        System.out.println();
    }
    int perfectNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find is perfect number or not");
        int number = sc.nextInt();
        int perfect = 0;
        for(int i =1; i<number; i++){
            if(number % i == 0){
                perfect += i;
            }
        }
        if(perfect == number){
            System.out.println(+number +" "  +"is a perfect number ");
        }else {
            System.out.println(+number +" " +"is not a perfect number");
        }
        return number;
    }

    public static void main(String[] args) {
        LogicalPrograms logicalPrograms = new LogicalPrograms();
        logicalPrograms.fibonacciSeries();
        logicalPrograms.perfectNumber();
    }
}
