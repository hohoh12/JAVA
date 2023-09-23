package com.condition_loops;

public class Conditionals {
    public static void main(String[] args) {
        //if loop
        int sal = 25400;
//        if(sal > 10000){
//            sal = sal + 2000;
//        }
//        else{
//            sal = sal + 1000;
//        }
//    }

//        if (sal>10000){
//            sal += 2000;
//        }
//        else if (sal> 20000){
//            sal += 3000;
//        }
//        else{
//            sal += 1000;
//        }
//        System.out.println(sal);

        int a = 10;
        int b = 20;
        if (a==10 && b==20){
            System.out.println("AND");
        }
        if (a==10 || b==20) {
            System.out.println("OR");
        }
        if (a!=35) {
            System.out.println("NOT EQUAL");
        }
    }
}
