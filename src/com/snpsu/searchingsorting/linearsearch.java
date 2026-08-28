package com.snpsu.searchingsorting;

class Linearsearch {
    static int Linearsearch(int key, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {10, 11, 1, 7, 9, 13};
        int key = 7;
        int result = Linearsearch(key, arr);
        if (result != -1) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
    }
}
