package com.snpsu.Threads.deadlock;
class lock{

}

public class DeadLock {
    public static void main(String[] args) {
        lock lock1 =new lock();
        lock lock2 = new lock();
        Thread t1 = new Thread(()->{
            synchronized (lock1) {
                System.out.println("t1 locked lock1");
            }//lock releases
            try{
                Thread.sleep(1000);
            } catch (Exception e) {}
            synchronized (lock2){
                System.out.println("t1 locked lock2");
            }
        });
        Thread t2=new Thread(()->{
            synchronized (lock2) {
                System.out.println("t2 locked lock1");
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            synchronized (lock1){
                System.out.println("t2 locked lock2");
            }
        });
        t1.start();
        t2.start();
    }

}
