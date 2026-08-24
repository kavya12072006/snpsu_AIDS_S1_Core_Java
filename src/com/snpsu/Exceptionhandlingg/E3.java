package com.snpsu.Exceptionhandlingg;

public class E3 {
    public static void main(String[] args) {
        int age=2;
        if (age>=18){
            System.out.println("eligible");
        } else{
            throw new RuntimeException("not eligilbe-access denied");
        }
    }
}
