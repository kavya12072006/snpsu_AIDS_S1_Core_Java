package com.snpsu.Exceptionhandlingg;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            int[] arr ={1,2,3,4,5};
            System.out.println(arr[1]);
        }catch(ArithmeticException e){
            System.out.println("Cant divide anything");
        } catch(Exception e){
            System.out.println("We dont know the exception type");
        }finally{
            System.out.println("This will run regardlessly");
        }
        System.out.println("Hello");
    }static {
        System.out.println("Excution starts");
    }
}
