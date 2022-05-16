package com.einarr.maximus.homework;

import java.util.Random;

public class SquareCircle {

    public static void main(String[] args) {

        /*Имеется прямоугольное отверстие размерами a и b,
        определить, можно ли его полностью закрыть
        круглой картонкой радиусом r */

        Random random = new Random();
        double a = random.nextDouble(100);
        double b = random.nextDouble(100);
        double r = random.nextDouble(100);
        double D = 2 * r;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("r = " + r + "; D = " + D);

        if (c <= D)
            System.out.println("Возможно");
        else
            System.out.println("Вряд ли");
    }
}
