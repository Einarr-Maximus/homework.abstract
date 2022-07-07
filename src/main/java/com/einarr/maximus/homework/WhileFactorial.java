package com.einarr.maximus.homework;

import java.util.Random;

public class WhileFactorial {

    public static void main(String[] args) {

        double sr = 0;
        double sum = 0;
        int n = 0;
        int x = (int) (Math.random() * 20);

        while (x != 0) {
            sum += x;
            n++;
            x = (int) (Math.random() * 20);
        }
        if (n != 0) {
            sr = sum / n;
        } else
            sr = 0;

        System.out.println("Среднее: " + sr);

        /* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма,
        а произведение, т.е. факториал числа. */

        Random random = new Random();
        int number = random.nextInt(10);
        int factorial = 1;
        int count = number;

        while (count > 0) {
            factorial = factorial * count;
            count--;
        }
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }
}
