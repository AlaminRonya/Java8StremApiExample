package com.alamin.binary_tree;

public class MaxHeap {
    private int[] heapStore;
    private int capacity;
    private int position;
    private int size = 1;

    public MaxHeap() {
        this.position = 1;
        this.capacity = 10;
        this.heapStore = new int[capacity];
    }

    public void insert(int value){
        if (this.position == this.capacity ){
            return;
        }else {
            this.size++;
            heapStore[position++] = value;
            int child = position - 1;

            int parent = child / 2 ;
            while (heapStore[parent] < heapStore[child] && parent > 0){
                int temp = heapStore[parent];
                heapStore[parent] = heapStore[child];
                heapStore[child] = temp;
                child = parent;
                parent = child / 2;
            }
        }
    }
    public void print(){
        for (int i = 1; i < this.size; i++) {
            System.out.print(heapStore[i] + ", ");
        }
        System.out.println();
    }
}
