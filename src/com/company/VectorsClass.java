package com.company;

import java.util.Vector;

public class VectorsClass {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        for(int i= 1;i<=5; i++)
            vector.add(i);
            System.out.println(vector);
            vector.remove(3);
            System.out.println(vector);

            //printing all the elements on the same line
        for(int i=0; i<vector.size(); i++)
            System.out.println(vector.get(i) + " ");

    }
}
