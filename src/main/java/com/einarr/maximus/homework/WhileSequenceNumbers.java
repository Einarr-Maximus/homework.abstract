package com.einarr.maximus.homework;

import java.util.Random;

public class WhileSequenceNumbers {

    public static void main(String[] args) {

        /* Имеется последовательность случайных чисел. Найти и вывести
        наибольшее из них. */

        Random random = new Random();
        int count = random.nextInt(100);
        int max = 0;

        while (count > 0)
        {
            count --;
            int x = random.nextInt(100000);
            if (x > max)
                max = x;
            //System.out.println("x = " + x + "    max = " + max);
        }

        System.out.println("Максимальное число " + max);

    }
}
