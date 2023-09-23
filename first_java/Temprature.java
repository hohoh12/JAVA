package com.first_java;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float C = temp.nextFloat();
        float F = (C * 9/5) + 32;
        System.out.println("Farenheit is: " + F);
    }
}
