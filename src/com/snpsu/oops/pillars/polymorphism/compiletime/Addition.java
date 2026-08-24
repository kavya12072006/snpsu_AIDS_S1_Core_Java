package com.snpsu.oops.pillars.polymorphism.compiletime;

public class Addition {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

}
class DriverCode{
    public static void main(String[] args) {
        Addition obj=new Addition();
        System.out.println(obj.add(1,3));
        System.out.println(obj.add(4,6,9));
    }
}



