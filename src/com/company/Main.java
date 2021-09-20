package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// this code  has data structures beginning with array lists, it extends everything from the list interface
    //ArrayList implements a list interface
        ArrayList<String> list = new ArrayList<>();// you have created an arraylist named list;
        list.add("Nicho");
        list.add("Jay");
        list.add("Nicho");
        list.add("Jay");
        list.add("Jen");

        //traverse the list va the iterator
        Iterator iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
