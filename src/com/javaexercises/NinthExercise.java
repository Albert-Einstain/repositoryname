package com.javaexercises;

import java.util.Random;

public class NinthExercise {
    public static void main(String[] lessons) {
        /*
        Создать программу, выводящую на экран случайно сгенерированное
        трёхзначное натуральное число и его наибольшую цифру.
        */
        Random random1 = new Random();
        int n;

        n = random1.nextInt(900) + 100;
        System.out.println(n);

        int n1 = n / 100;
        System.out.println(n1);
        int n2 = n / 10 % 10;
        System.out.println(n2);
        int n3 = n % 10; // 935 / 10 = 93 93*10 = 930
        System.out.println(n3);
    }
}
