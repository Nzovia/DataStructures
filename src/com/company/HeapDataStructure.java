package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

//the following code implements the binary heap Ds
public class HeapDataStructure {

        private static final int a=2;
        private int [ ] heap;
        private int heapSize;

        //generate constructor with default size
         public HeapDataStructure(int capacity) {
             heapSize = 0;
             heap = new  int[capacity +1 ];
             Arrays.fill(heap, -11);
        }
        //check if the heap is empty
       public boolean isEmpty(){
        return heapSize==0;
    }
    //check if the heap is full
    public boolean isFull(){
             return heapSize == heap.length;
    }
    //returning the parent
    private int parent(int i){
             return (i-1)/a;
    }
    //returning the K th child
    private int kthChild(int i, int j){
             return a*i +j;
    }
    //inserting a new element in an heap
    public void  insert(int x){
             if(isFull())
                 throw  new NoSuchElementException("Heap is full");
             heap[heapSize++] = x;
             heapifyUp(heapSize -1);
    }
  //deleting element from  the heap
  public int delete(int x){
      if(isEmpty())
          throw new NoSuchElementException("Heap is empty, No element to delete");
      int key = heap[x];
      heap[x] = heap[heapSize -1];
      heapSize--;
      heapifyDown(x);
      return key;
  }
  //here you are maintaining the heap property on Insertion
    private void heapifyUp(int i) {
          int temp = heap [i];
          while(i>0 && temp > heap[parent(i)]){
            heap[i] = heap[parent(i)];
            i = parent(i);
        }
        heap[i] = temp;
    }
    //maintain heapproperty on deletion
    private void heapifyDown(int i) {
        int child;
        int temp = heap[i];
        while(kthChild(i, 1) < heapSize){
            child = maxChild(i);
            if(temp < heap[child]){ heap[i] = heap[child]; }else break; i = child; } heap[i] = temp; }
    private int maxChild(int i) { int leftChild = kthChild(i, 1); int rightChild = kthChild(i, 2); return heap[leftChild]>heap[rightChild]?leftChild:rightChild;
    }
    //print the heap
    public void printHeap()
    {
        System.out.print("nHeap = ");
        for (int i = 0; i < heapSize; i++)
            System.out.print(heap[i] +" ");
        System.out.println();
    }

    //return max from the heap
    public int findMax(){
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty.");
        return heap[0];
    }
}



