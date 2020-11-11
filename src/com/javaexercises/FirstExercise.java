package com.javaexercises;

public class FirstExercise {
    public static void main(String[] lessons) {
        /*
        Поменять местами значения переменных a и b, сначала с использованием дополнительной третьей переменной,
        а затем – без. // //
        */

        int a = 2;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;


//        int c;
//
//        c = a;
//        a = b;
//        b = c;

        System.out.println(a);
        System.out.println(b);
    }
}