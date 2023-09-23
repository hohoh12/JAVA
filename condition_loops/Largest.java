package com.condition_loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//
//        //Find the largest of three numbers
//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println("Largest number is: " + max);

//        //OR
//        System.out.println(Math.max(37,26));

        //OORR
        int max =Math.max(c, Math.max(a , b));
        System.out.println("Largest number is :" + max);
    }
}
