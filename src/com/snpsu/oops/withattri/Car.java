package com.snpsu.oops.withattri;

public class Car {
    //attributes

    String brand;
    int manuDate;
    Car(String brand,int manuDate){//constructor
        this.brand=brand;
        this.manuDate=manuDate;
    }
    void printdetail(){
        System.out.println("car brand: "+brand);
        System.out.println("car manufacturing date : "+manuDate);
    }

    public static void main(String[] args) {
        Car c1=new Car("bmw",2000);
        Car c2=new Car("audi",2006);
        c1.printdetail();
        c2.printdetail();
    }
}
