package com.company;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        //the stack class of the collection framework is used to implement the stack datastracture
        //different operations can be achieved and are based LIFO(last in first out), and operations include
        //pop, push , empty, search, peek
        Stack<String> s = new Stack<>();
        //adding data into the stack
        s.push("Nicholas");
        s.push("Maundu");
        s.push("Developer");

        //create an iterator for  the stack
        Iterator<String> iterator= s.iterator();

        //displaying the list of items in the iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }
        System.out.println( );
        s.pop();

        //create another iterator for the stack
        iterator =s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
