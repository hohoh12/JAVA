package com.first_java;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        //TypeConversion
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //TypeCasting
//        int num = (int) (67.567f);
//        System.out.println(num);

        //automatic type promotion in expressions
//        int a =257;
//        byte b = (byte) (a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b) / c;
//        System.out.println(d);

//        int num = 'a';
//        System.out.println(num);
//
//        System.out.println("नमस्ते");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i / c) - (d-s);
        System.out.println((f*b) + " " +(i / c) +" "+ (d-s));
        System.out.println(result);
    }
}
