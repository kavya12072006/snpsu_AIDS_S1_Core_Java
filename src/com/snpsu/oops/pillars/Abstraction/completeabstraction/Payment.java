package com.snpsu.oops.pillars.Abstraction.completeabstraction;

public interface Payment {
    void pay();
    default void refund(){
        System.out.println("refund!!");
    }

}
class UPI implements Payment{
    public void pay() {
        System.out.println("paying through upi");

    }
}
class CreditCard implements Payment{
    public void pay() {
        System.out.println("paying through creditcard");

    }
    public  void refund(){
        System.out.println("refund!!");
    }
}
class cash implements Payment{
    public void pay() {
        System.out.println("paying through cash ");
    }
}
class DriverCode{
    public static void main(String[] args) {
        Payment p =new UPI();
        p.pay();
    }
}