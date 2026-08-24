package com.snpsu.oops.pillars.inheritance.multilevel;

public class animal {void eat(){
        System.out.println("eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barking");
    }
}
class puppy extends dog {
    void cry() {
        System.out.println("crying");
    }
}
class Drivercode{
    public static void main(String[] args) {
        animal a =new animal();
        dog d =new dog();
        puppy p=new puppy();
        a.eat();
        d.bark();
        d.eat();
        p.cry();
        p.eat();
        p.bark();
    }
}

