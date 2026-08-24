package com.snpsu.oops.pillars.Abstraction.partialabstraction;

abstract class bank {
    bank(){
        System.out.println(" rbi constructor ");
    }
    abstract int ROI();
     void welcomemessage(){
         System.out.println("hello");
     }
     static  void TermsAndCondition(){
         System.out.println("some 10 terms and conditions applied........");
     }

}
class hdfc extends bank{
    int ROI(){
        return 3;
    }

    @Override
    void welcomemessage() {
        System.out.println("welcome hdfc");
    }
}
class sbi extends bank{
    int ROI(){
        return 2;
    }
}
class Drivercode2{
    public static void main(String[] args) {
        hdfc obj =new hdfc();
        System.out.println(obj.ROI());
        bank.TermsAndCondition();
        obj.welcomemessage();


    }
}