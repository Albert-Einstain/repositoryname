package com.javaexercises;

public class SixthExercise {
    public static void main(String[] lessons) {
        /*
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
        */

        int m = 12;
        int n = 9;

        int mDistance = 10 - m;
        int nDistance = 10 - n;

        if(mDistance < 0) {
           // mDistance = -mDistance;
            mDistance = mDistance * -1;
        }

        if(nDistance < 0) {
            nDistance = nDistance * -1;
        }

        if(mDistance > nDistance) {
            System.out.println(n);
        } else if(mDistance == nDistance) {
            System.out.println("m = n");
        } else {
            System.out.println(m);
        }
    }
}
