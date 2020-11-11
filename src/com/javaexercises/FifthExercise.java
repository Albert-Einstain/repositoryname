package com.javaexercises;

public class FifthExercise {
    public static void main(String[] lessons) {
        /*
        Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n,
        чётным либо нечётным.
        */

        int n = 1;

        if(n % 2 == 0){
            System.out.println("число n четное");
        } else {
            System.out.println("число n нечетное");
        }
    }
}
