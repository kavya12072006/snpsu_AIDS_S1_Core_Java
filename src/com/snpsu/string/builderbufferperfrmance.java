package com.snpsu.string;
public class builderbufferperfrmance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("snpsu");
        for (int i = 0; i < 10000000; i++) {
            sbf.append("institution ");
         }
        System.out.println("time taken by sbf:" + (System.currentTimeMillis() - startTime + "ms"));
        startTime = System.currentTimeMillis();
        StringBuffer sbl = new StringBuffer("snpsu");
        for (int i = 0; i < 10000000; i++) {
            sbl.append("institutuion ");
        }
        System.out.println("time taken by sbl:" + (System.currentTimeMillis() - startTime + "ms"));
    }
}