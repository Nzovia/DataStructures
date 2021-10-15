package com.company;

import com.company.HeapDataStructure;

public class HeapMain {
        public static void main(String[] args){
            HeapDataStructure maxHeap = new HeapDataStructure(10);

            maxHeap.insert(1);
            maxHeap.insert(2);
            maxHeap.insert(3);
            maxHeap.insert(4);
            maxHeap.insert(5);
            maxHeap.insert(6);
            maxHeap.insert(7);
            maxHeap.insert(8);
            maxHeap.insert(9);
            maxHeap.printHeap();
            maxHeap.delete(8);
            maxHeap.printHeap();

        }
    }

