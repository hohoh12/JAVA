package com.condition_loops;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character to check its case : ");
        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch<= 'z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}
