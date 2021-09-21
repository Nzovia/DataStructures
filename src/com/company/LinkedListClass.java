package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        //the class uses doubly linkedlist to store data
        // it can also store duplicate elements
        LinkedList<String> mylist =new LinkedList<>();
        mylist.add("Nic");
        mylist.add("Jen");
        mylist.add("Nic");

        Iterator<String> itr = mylist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
