package com.snpsu.Threads;

public class Demo {
    public static void main(String[] args) {
        System.out.println("main thread crreated!");
        for (int i=0;i<5;i++){
            System.out.println("maian thread:"+i);
        }
        System.out.println("main thread stopped");
    }
}
