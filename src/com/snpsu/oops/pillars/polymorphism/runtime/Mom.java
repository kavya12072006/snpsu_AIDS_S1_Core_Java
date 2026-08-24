package com.snpsu.oops.pillars.polymorphism.runtime;

public class Mom {
    void cook(){
        System.out.println("Indian ");
    }
}
class Daughter extends Mom{
    void cook(){
        System.out.println("Chinese  ");
    }

}
class DriverCode{
    public static void main(String[] args) {
        Mom m1=new Mom();
        Daughter d1=new Daughter();
        m1.cook();
        d1.cook();
    }
}