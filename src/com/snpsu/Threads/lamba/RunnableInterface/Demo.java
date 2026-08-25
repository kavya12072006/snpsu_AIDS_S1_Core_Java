package com.snpsu.Threads.lamba.RunnableInterface;

public class Demo {
    public static void main(String[] args) {
        Runnable task =()->{
            System.out.println("thread is running");
        };

    }
}
