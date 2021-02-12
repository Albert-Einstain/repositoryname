package com.javaexercises;

public class TenthExercise {
    public static void main(String[] lessons) {
       /*
        В три переменные a, b и c явно записаны программистом три целых попарно неравных между
        собой числа.
        Создать программу, которая переставит числа в переменных таким образом,
        чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей

        c > a && c > b && b > a = a b c
        b > a && b > c && c > a = a c b
        c > a && c > b && a > b = b a c
        b > a && b > c && a > c = c a b
        a > b && a > c && c > b = b c a
        a > b && a > c && b > c = c b a

        a > b && a > c && c > b = b c a
        a > b && a > c && b > c = c b a

        b > a && b > c && c > a = a c b
        b > a && b > c && a > c = c a b

        c > a && c > b && a > b = b a c
        c > a && c > b && b > a = a b c

         */

        int a = 4, b = 3, c = 5;

        if (a > b && a > c) {
            if (c > b) {
                System.out.println(b + "" + c + "" + a);
            } else {
                System.out.println(c + "" + b + "" + a);
            }
        }
        if (b > a && b > c) {
            if (c > a) {
                System.out.println(a + "" + c + "" + b);
            } else {
                System.out.println(c + "" + a + "" + b);
            }
        }
        if (c > a && c > b) {
            if (a > b) {
                System.out.println(b + "" + a + "" + c);
            } else {
                System.out.println(a + "" + b + "" + c);
            }
        }

//        if (c > a && c > b && b > a) {
//            System.out.println(a + "" + b + "" + c);
//        } else if (b > a && b > c && c > a) {
//            System.out.println(a + "" + c + "" + b);
//        } else if (c > a && c > b && a > b) {
//            System.out.println(b + "" + a + "" + c);
//        } else if (b > a && b > c && a > c) {
//            System.out.println(c + "" + a + "" + b);
//        } else if (a > b && a > c && c > b) {
//            System.out.println(b + "" + c + "" + a);
//        } else if (a > b && a > c && b > c) {
//            System.out.println(c + "" + b + "" + a);
//        } else {
//            System.out.println("Error!");
//        }
    }
}
