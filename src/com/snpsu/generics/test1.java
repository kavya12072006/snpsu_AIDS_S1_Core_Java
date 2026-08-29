package com.snpsu.generics;

public class test1 <t1>{
    t1 obj;
    test1(t1 obj){
        this.obj=obj;
    }
}
class Driver1{
    public static void main(String[] args) {
        test1<Integer>obj1=new test1<>(15);
        test1<String>obj2=new test1<>("kavya");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}