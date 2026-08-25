package com.snpsu.Threads.WaysOfCreationOfThread;

class mytask1 implements Runnable {
    public void run(){
        System.out.println("thread1 is running");
    }
}
class mytask2 implements Runnable {
    public void run(){
        System.out.println("thread2 is running");
    }
}
class Demo{
    public static void main(String[] args) {
        mytask1 task1=new mytask1();
        mytask2 task2=new mytask2();
        Thread t1 = new Thread(task1);
        Thread t2=new Thread(task2);
        t1.start();
        t2.start();
    }

}