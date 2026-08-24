package com.snpsu.Exceptionhandlingg;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}
class DriverCode{
    public static void main(String[] args) throws Exception{
        int age=10;
        if(age<18){
            throw new InvalidAgeException("age is not valid");
    }
        System.out.println("you cant vote!");

        }
    }
