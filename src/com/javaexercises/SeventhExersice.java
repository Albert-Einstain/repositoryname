package com.javaexercises;

public class SeventhExersice {
    public static void main(String[] lessons) {
                /*
        В три переменные a, b и c записаны три вещественных числа. Создать программу,
        которая будет находить и выводить
         на экран вещественные корни квадратного уравнения ax^2 + bx + c=0,
         либо сообщать, что корней нет.
         */

//        double a = 1;  ax^2 − 8x + 12 = 0 дискриминант положительный, два решения
//        double b = 8;  ax^2 − 8x + 12 = 0
//        double c = 12;  ax^2 − 8x + 12 = 0
//        double d = b * b - 4 * a * c

//        double a = 1; // x^2 − 6x + 9 = 0 дискриминант равен 0
//        double b = -6; // x^2 − 6x + 9 = 0
//        double c = 9; // x^2 − 6x + 9 = 0
//        double d = b * b - 4 * a * c

//        double a = 5; // 5x^2 + 3x + 7 = 0 дискриминант отрицательный
//        double b = 3; // 5x^2 + 3x + 7 = 0
//        double c = 7; // 5x^2 + 3x + 7 = 0
//        double d = // b * b - 4 * a * c

        double a = 1, b = 8, c = 12,  d;

        d = b * b - 4 * a * c; // дискриминант отрицательный

        System.out.println("Решение квадратного уравнения, Дискриминант = " + d);

        if(d > 0) {
            System.out.println("Дискриминант положительный, уравнение имеет два корня:");
            System.out.println("Первый корень = " + ((-b + Math.sqrt(d)) / (2 * a)));
            System.out.println("Второй корень = " + ((-b - Math.sqrt(d)) / (2 * a)));
        } else if(d == 0) {
            System.out.println("Дискриминант равен 0, уравнение имеет один корень " + -b / (2 * a));
        } else {
            System.out.println("Нет корней.");
        }
    }
}
