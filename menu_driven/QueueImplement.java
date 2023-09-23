package com.menu_driven;
import java.util.*;

class MyQueue {
    private int front, rear, max;
    private int[] arr;

    public MyQueue(int size){
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
public class QueueImplement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of queue: ");
        int max = in.nextInt();
        MyQueue queue = new MyQueue(max);

        System.out.println("Queue Operations");
        System.out.println("1.Insert");
        System.out.println("2.Delete");
        System.out.println("3.Display");
        System.out.println("4.Quit");
        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the element to be inserted: ");
                    int ele = in.nextInt();
                    queue.insert(ele);
                }
                case 2 -> queue.delete();
                case 3 -> queue.display();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Please enter Valid choice (1/2/3/4)");
            }
        } while (choice != 4);
        in.close();
    }
}
