package com.test.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        /**
         * 这是注释
         */
        System.out.println("world");
        System.out.println(add(2, 6));
    }

    public static int add(int a, int b){
        return a + b;
    }
}
