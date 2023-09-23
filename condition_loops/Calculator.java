package com.condition_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take input from user until they press X or x
        int ans = 0;
        while(true){
            //take operator from user
            System.out.print("Enter an operator: ");
            char op = input.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }

    }
}
