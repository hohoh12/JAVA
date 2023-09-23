package com.first_java;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
////        1.Write a program to print whether a number is even or odd, also take input from the user.
//
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        if(num%2 == 0){
//            System.out.println("Even Number");
//        }
//        else{
//            System.out.println("Odd Number");
//        }


////        2.Take name as input and print a greeting message for that particular name.
//        System.out.print("Enter your name: ");
//        String name = input.next();
//        System.out.println("Hey how are you doing " + name + " ?");


////        3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        System.out.print("Enter Principle: ");
//        float P = input.nextFloat();
//        System.out.print("Enter Time: ");
//        float T = input.nextFloat();
//        System.out.print("Enter Rate: ");
//        float R = input.nextFloat();
//        float SI = P*T*R;
//        System.out.println("Simple Interest is " + SI);


////        4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        System.out.println("Enter 1st number: ");
//        float num1 = input.nextFloat();
//        System.out.println("Enter 2nd number: ");
//        float num2 = input.nextFloat();
//        System.out.println("Enter an opertor i.e.(+,-,/,*)");
//        String op = input.next();
//        float sum = num1+num2;
//        float diff = num1- num2;
//        float multi = num1*num2;
//        float div = num1/num2;
//        if(Objects.equals(op, "+")){
//            System.out.println("Result is:" + sum);
//        }
//        else if(Objects.equals(op, "-")){
//            System.out.println("Result is: " + diff);
//        }
//        else if(Objects.equals(op, "*")){
//            System.out.println("Result is: " + multi);
//        }
//        else{
//            System.out.println("Result is: " + div);
//        }


////        5.Take 2 numbers as input and print the largest number
//        System.out.print("Enter a number: ");
//        float num1 = input.nextFloat();
//        System.out.print("Enter a number: ");
//        float num2 = input.nextFloat();
//        if(num1>num2){
//            System.out.println("Largest number is "+ num1);
//        }
//        else{
//            System.out.println("Largest number is "+ num2);
//        }


////        6.Input currency in rupees and output in USD.
//        System.out.print("Enter rupees to be converted: ");
//        float rup = input.nextFloat();
//        float USD = rup * 0.012f;
//        System.out.println("Dollars is: " + USD);


////        7.To calculate Fibonacci Series up to n numbers.
//        System.out.print("Enter N: ");
//        int N = input.nextInt();
//        int num1 = 0;
//        int num2 = 1;
//        int counter = 0;
//        while(counter < N){
//            System.out.print(num1 + " ");
//
//            int num3 = num1+num2;
//            num1 = num2;
//            num2 = num3;
//            counter++;
//        }


////        8.To find out whether the given String is Palindrome or not.
//        System.out.println("Enter a string");
//        String a = input.next();
//        char ch;
//        String nstr = "";
//        int len = a.length();
//        //to reverse a string
//        for(int i = 0; i<len; i++){
//           ch = a.charAt(i);//extracts each character
//           nstr = ch + nstr;//adds each character in front of the existing string
//        }
//        //System.out.println("Reverse is " + nstr);
//        if(a .equals(nstr)){
//            System.out.println(a + " is Palindrome");
//        }
//        else{
//            System.out.println(a + " is not Palindrome");
//        }
//        }
////        9.To find Armstrong Number between two given number.
//        System.out.print("Enter a number: ");
//        int num1 = input.nextInt(); //1
//        System.out.print("Enter a number: ");
//        int num2 = input.nextInt();//1000
//        int n,b,sum=0;
//        for(int i = num1 ; i <= num2;i++){
//            n = i;
//            while(n > 0){
//                b = n % 10;
//                sum = sum + (b * b * b);
//                n = n/10;
//            }
//            if(sum == i){
//                System.out.print(i+" ");
//            }
//            sum = 0;
//        }

    }
}

