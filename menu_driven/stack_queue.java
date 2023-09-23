package com.menu_driven;

import java.util.Scanner;
class Stack1 {
    private int top;
    private int max;
    private int[] arr;

    public Stack1(int size){
        top = -1;
        max = size;
        arr = new int[max];
    }

    public void push(int value){
        if(top >= max-1){
            System.out.println("OVERFLOW");
        }
        else{
            arr[++top] = value; //first adds the value and then increments the top
        }
    }

    public void pop(){
        if(top == -1){
            System.out.println("UNDERFLOW");
        }
        else{
            System.out.println("Element "+ arr[top] +" is popped from the stack");
            top--;
        }
    }

    public void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Element " + arr[top] + " peeked");
        }
    }

    public void display(){
        if(top == -1){
            System.out.println("Empty Stack");
        }
        else{
            System.out.println("Elements in Stack are: ");
            for(int i = top; i >= 0; i--){
                System.out.println(arr[i]);
            }
        }
    }
}

class Queue1 {
    private int front, rear, max;
    private int[] arr;

    public Queue1(int size){
        front = -1;
        rear = -1;
        max = size;
        arr = new int[max];
    }

    public void insert(int val){
        if(rear == max-1){
            System.out.println("OVERFLOW");
        }
        if(front == -1 && rear == -1){
            front = 1;
            rear = 1;
        }
        else{
            rear++;
        }
        arr[rear] = val;
    }

    public void delete(){
        if(front == -1 || front > rear || front  == rear){
            System.out.println("UNDERFLOW");
        }
        else{
            int ele = arr[front++];
            System.out.println("Element "+ ele +" is deleted.");
        }
    }

    public void display(){
        if(rear == -1){
            System.out.println("Queue is Empty");
        }
        else{
            for(int i = front; i<=rear; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
public class stack_queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int max = sc.nextInt();
        Stack1 stack = new Stack1(max);
        Queue1 queue = new Queue1(max);
        int choice;
        System.out.println("Stack Operations");
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Peek");
        System.out.println("4.Display");
        System.out.println("Queue Operations");
        System.out.println("5.Insert");
        System.out.println("6.Delete");
        System.out.println("7.Display");
        System.out.println("8.Quit");
        do{
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("enter the element to be pushed: ");
                    int ele = sc.nextInt();
                    stack.push(ele);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.print("Enter the element to be inserted: ");
                    int elee = sc.nextInt();
                    queue.insert(elee);
                    break;
                case 6:
                    queue.delete();
                    break;
                case 7:
                    queue.display();
                    break;
                case 8:
                    System.out.println("Exit Point");
                    break;
                default:
                    System.out.println("Please enter a valid choice (1/2/3/4/5/6/7/8)");
            }
        }while(choice!=8);
        sc.close();
    }
}

//public class stack_queue {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of array: ");
//        int max = sc.nextInt();
//        MyStack stack = new MyStack(max);
//        MyQueue queue = new MyQueue(max);
//        int choice;
//        System.out.println("Stack Operations");
//        System.out.println("1.Push");
//        System.out.println("2.Pop");
//        System.out.println("3.Peek");
//        System.out.println("4.Display");
//        System.out.println("Queue Operations");
//        System.out.println("5.Insert");
//        System.out.println("6.Delete");
//        System.out.println("7.Display");
//        System.out.println("8.Quit");
//        do{
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//            switch(choice){
//                case 1:
//                    System.out.print("enter the element to be pushed: ");
//                    int ele = sc.nextInt();
//                    stack.push(ele);
//                    break;
//                case 2:
//                    stack.pop();
//                    break;
//                case 3:
//                    stack.peek();
//                    break;
//                case 4:
//                    stack.display();
//                    break;
//                case 5:
//                    System.out.print("Enter the element to be inserted: ");
//                    int elee = sc.nextInt();
//                    queue.insert(elee);
//                    break;
//                case 6:
//                    queue.delete();
//                    break;
//                case 7:
//                    queue.display();
//                    break;
//                case 8:
//                    System.out.println("Exit Point");
//                    break;
//                default:
//                    System.out.println("Please enter a valid choice (1/2/3/4/5/6/7/8)");
//            }
//        }while(choice!=8);
//        sc.close();
//    }
//}
