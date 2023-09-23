package com.switchh;

import java.util.Scanner;

public class Nested_switchh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Isha");
                break;
            case 2:
                System.out.println("Kunal");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("MAnagement Department");
                        break;
                    default:
                        System.out.println("No department selected");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

        switch (empID) {
            case 1 -> System.out.println("Isha");
            case 2 -> System.out.println("Kunal");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("MAnagement Department");
                    default -> System.out.println("No department selected");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
