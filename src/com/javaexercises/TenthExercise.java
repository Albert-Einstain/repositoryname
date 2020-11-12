package com.javaexercises;

public class TenthExercise {
    public static void main(String[] lessons) {
                /*
        В три переменные a, b и c явно записаны программистом три целых попарно неравных между
        собой числа.
        Создать программу, которая переставит числа в переменных таким образом,
        чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей
        1 123 c > a && c > b && b > a cba
        2 132 b > a && b > c && c > a bca
        3 213 c > a && c > b && a > b cab
        4 231 b > a && b > c && a > c bac
        5 312 a > b && a > c && c > b acb
        6 321 a > b && a > c && b > c abc
         */

        int a = 2, b = 9    , c = 11;

        if (c > a && c > b && b > a) {
            System.out.println(c + "" + b + "" + a);
        } else if (b > a && b > c && c > a) {
            System.out.println(b + "" + c + "" + a);
        } else if (c > a && c > b && a > b) {
            System.out.println(c + "" + a + "" + b);
        } else if (b > a && b > c && a > c) {
            System.out.println(b + "" + a + "" + c);
        } else if (a > b && a > c && c > b) {
            System.out.println(a + "" + c + "" + b);
        } else if (a > b && a > c && b > c) {
            System.out.println(a + "" + b + "" + c);
        } else {
            System.out.println("Error!");
        }
    }
}
