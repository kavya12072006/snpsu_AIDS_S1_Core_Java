package com.snpsu.recurssion;

public class recurssion {
    static void function(int n){
        if (n==0){
            return;//base case
        }
        System.out.println(n);//main body
        function(n-1);//recursive case
    }
    public static void main(String[] args) {
        function(10);
    }

}

