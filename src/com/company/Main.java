package com.company;

public class Main {
    public static void main(String args[]) {
        MyMath v = new MyMath();
        int result = v.myMethod(2,6, 1,2,3,4,5,6);
        System.out.println(result);
    }
}

class MyMath {
     public int myMethod(int a, int b, int... nums) {
         int count = 0;
         for (int i = 0; i < nums.length; i++)
             if (i <= b && i >= a) {
                 count = count + 1;
             }
             return count;
     }
}

