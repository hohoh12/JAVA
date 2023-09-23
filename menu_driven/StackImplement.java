package com.menu_driven;
import java.util.*;

class MyStack {
    Scanner sc = new Scanner(System.in);
    private int top;
    private int max;
    private int[] arr;

    public MyStack(int size){
        top = -1;
        max = size;
        arr = new int[max];
    }

    public void push(int value){
        if(top >= max-1){
            System.out.println("OVERFLOW");
        }
        else{
//            System.out.println("Enter the element to be pushed: ");
//            value = sc.nextInt();
            arr[++top] = value; //first adds the value and then increments the top
            //System.out.println("Element " + value + " pushed on the stack");
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

public class StackImplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        int max = sc.nextInt();
        MyStack stack = new MyStack(max);

        int choice;
        System.out.println("Stack Operations");
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Peek");
        System.out.println("4.Display");
        System.out.println("5.Quit");
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
                    System.out.println("Exit Point");
                    break;
                default:
                    System.out.println("Please enter a valid choice (1/2/3/4/5)");
            }
        }while(choice!=5);
        sc.close();
    }
}