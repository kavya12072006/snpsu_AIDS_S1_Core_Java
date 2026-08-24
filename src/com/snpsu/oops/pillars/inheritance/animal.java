package com.snpsu.oops.pillars.inheritance;

public class animal {
    void eat(){
        System.out.println("eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barking");
    }
}
class Drivercode{
    public static void main(String[] args) {
        animal a =new animal();
        dog d =new dog();
        a.eat();
        d.bark();
        d.eat();
    }
}
