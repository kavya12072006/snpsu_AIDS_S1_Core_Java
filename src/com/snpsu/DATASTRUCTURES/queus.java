package com.snpsu.DATASTRUCTURES;

public class queus {
    int[] arr;
    int front;
    int back;
    int size;
    queus(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        back=-1;
    }
    void push(int val){
        if(back==size-1){
            System.out.println("overflowing");
            return;
        }
        back++;
        arr[back]=val;
        if (front==-1){
            front++;
        }
    }
    void pop(){
        if(front==-1||front>back){
            System.out.println("undreflown");
            return;
        }
        arr[front]=0;
        front++;
    }
    int peek(){
        return back;
    }
}
