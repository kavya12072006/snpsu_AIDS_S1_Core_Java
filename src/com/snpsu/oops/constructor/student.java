package com.snpsu.oops.constructor;

public class student {
    String name;
    int rollno;
    student(String name,int rollno ){
        this.name=name;
        this.rollno=rollno;
    }
    student(student s1){
        this.name=s1.name;
        this.rollno=s1.rollno;
    }

    public static void main(String[] args) {
        student s1=new student ("ashank",102);
        student s2=new student(s1);
        System.out.println(s1==s2);
        s2.name="david";
        System.out.println(s2.name);
    }
}
