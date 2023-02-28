package com.bridgelabz.logical_program_two;

import java.util.Scanner;

public class Util {
    public static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
        return d0;
    }

    public static double temperatureConversion(double temperature, String unit) {
        if (unit.equals("C")) {
            return (temperature * 9 / 5) + 32;
        } else if (unit.equals("F")) {
            return (temperature - 32) * 5 / 9;
        } else {
            System.out.println("Invalid unit.");
            return 0;
        }
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int dayOfWeek = Util.dayOfWeek(m, d, y);
        System.out.println(dayOfWeek);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fahrenheit temperature");
        double fahrenheitTemp;
        fahrenheitTemp = sc.nextDouble();
        double celsiusTemp = org.example.Util.temperatureConversion(fahrenheitTemp, "F");
        System.out.println(fahrenheitTemp + "°F = " + celsiusTemp + "°C");

        double celsiusTemp2;
        System.out.println("Enter the celsius temperature");
        celsiusTemp = sc.nextDouble();
        double fahrenheitTemp2 = org.example.Util.temperatureConversion(celsiusTemp, "C");
        System.out.println(celsiusTemp + "°C = " + fahrenheitTemp2 + "°F");
    }

}

