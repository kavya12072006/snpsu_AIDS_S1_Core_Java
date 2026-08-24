package com.snpsu.oops.pillars.inheritance.superkey;

public class person {
    String fname;
    String lname;
    person(String fname,String lname){
        this.fname=fname;
        this.lname=lname;


    }
}
class student extends person{
    int rollno;
    student(String fname,String lname , int rollno) {
        super(fname, lname);
        this.rollno = rollno;
    }

}
class drivercode{
    public static void main(String[] args) {
        student s1=new student("kavya","perumal",100);
        System.out.println(s1.fname);
        System.out.println(s1.lname);
        System.out.println(s1.rollno);


    }
}