package com.snpsu.string;

public class bufferexample {
    public static void main(String[] args) {
        StringBuffer sbf =new StringBuffer("hello");
        sbf.append(" world");
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf);
        sbf.insert(4,"A");
        System.out.println(sbf);
        sbf.replace(5,6,"y");
        System.out.println(sbf);
    }
}
