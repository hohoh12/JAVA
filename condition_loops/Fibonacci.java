package com.condition_loops;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 2;//bc first two numbers are given
        while (count <= n) {
            //System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            count++;
        }
        System.out.println(c);
    }
}
