package com.javaexercises;

import java.util.Random;

public class EightthExercise {
    public static void main(String[] lessons) {
        /*
        Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
        целое число в интервал (25;100) и сообщать результат на экран. //
         */
        Random random1 = new Random();
        int n;

        n = random1.nextInt(151) + 5;
        System.out.println(n);

        if(n > 25 && n < 100) {
            System.out.println("Входит!");
        } else {
            System.out.println("Не входит!");
        }
    }
}
