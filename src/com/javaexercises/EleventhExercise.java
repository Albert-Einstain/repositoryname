package com.javaexercises;

import java.util.Scanner;

public class EleventhExercise {
    public static void main(String[] lessons){
                /*
        Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
        чётным или нечётным. Если пользователь введёт не целое число, то сообщать ему об ошибке.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();

        System.out.println(n);
        if (n % 2 == 0) {
            System.out.print("число " + n + " четное");
        } else {
            System.out.print("число " + n + " нечетное");
        }
    }
}
