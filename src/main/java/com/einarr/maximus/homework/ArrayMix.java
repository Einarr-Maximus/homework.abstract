package com.einarr.maximus.homework;

import java.util.Random;

public class ArrayMix {

    public static void main(String[] args) {

        /* Создать массив, заполнить его случайными элементами, распечатать,
        перевернуть и снова распечатать. (При переворачивании не создавать еще один массив)
         */

        int[] array = new int[11];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.println(i + "   " + array[i]);
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("After changes");

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "   " + array[i]);

        }
    }
}
