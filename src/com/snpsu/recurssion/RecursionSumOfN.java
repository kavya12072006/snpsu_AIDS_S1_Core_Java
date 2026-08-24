package com.snpsu.recurssion;

public class RecursionSumOfN {
    int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        RecursionSumOfN obj = new RecursionSumOfN();
        System.out.println(obj.sum(5)); // Example: prints 15
    }
}
