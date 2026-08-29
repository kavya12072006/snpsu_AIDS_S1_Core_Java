package com.snpsu.generics;

public class test2<k,v> {
    k key;
    v val;
    test2(k key,v val){
        this.key=key;
        this.val=val;

    }
}
class Driver2{
    public static void main(String[] args) {
        test2<String,Integer> obj1=new test2<>("kavya",12);

    }
}
