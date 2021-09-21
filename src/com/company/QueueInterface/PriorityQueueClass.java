package com.company.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> priority = new PriorityQueue<>();
        priority.add(1);
        priority.add(11);
        priority.add(111);

        //printing all elements in a queue
        System.out.println(priority + " ");

        //here we are going to perform  different operations in our queue
        //they include  poll, peek
        System.out.println(priority.poll());//returns an element and removes it from the queue
        System.out.println(priority + " ");// a new queue with an element missing
        System.out.println(priority.peek());// peek method prints the element at the top of the queue

    }
}
