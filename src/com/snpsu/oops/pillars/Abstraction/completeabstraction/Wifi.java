package com.snpsu.oops.pillars.Abstraction.completeabstraction;

public interface Wifi {
    void connect();
}
class Laptop implements Wifi{
    public void connect(){
        System.out.println("laptop connectewd to wifi");
    }
}
class Phone implements Wifi{
    public void connect() {
        System.out.println("phone connected to wifi ");
    }
}