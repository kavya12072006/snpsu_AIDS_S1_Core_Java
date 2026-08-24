package com.snpsu.oops.pillars.Abstraction.partialabstraction;

abstract class Car {
    abstract void start();
    void brake(){
        System.out.println("car stops");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("bmw has strtt with a button ");
    }

}
class Toyata  extends Car{
    void start(){
        System.out.println("with key ");
    }
}
class DriverCode{
    public static void main(String[] args) {


    }
}