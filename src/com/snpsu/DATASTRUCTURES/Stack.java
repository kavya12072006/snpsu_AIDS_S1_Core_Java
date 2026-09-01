package com.snpsu.DATASTRUCTURES;

public class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size){
        this.size=size;
        top=-1;
        arr=new int[size];

    }
    void push(int val){
        if(top==size-1){
            System.out.println("overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    void pop(){
        if(top==-1){
            System.out.println("stack underflown");
            return;
        }
        arr[top]=0;//clearing the memory
        top--;
    }
    int Top(){
        if(top==-1){
            System.out.println("stack underflown");
            return -1 ;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}
class DriverCode {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(12);
        st.push(34);
        st.push(73);
        st.push(98);
        st.push(65);
        System.out.println(st.Top());
        st.push(53);

    }
}
