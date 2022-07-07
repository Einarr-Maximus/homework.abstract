package com.einarr.maximus.homework;

import java.util.Random;

public class ForNumber {
    public static void main(String[] args) {



    /* Имеется целое число, определить является ли это число простым,
     т.е. делится без остатка только на 1 и себя.
     */

        Random random = new Random();
        int number = random.nextInt(100);

        for (int count = 2; count < number; count++) {
            if (number % count == 0) {
                System.out.println("Число " + number + " не является простым");
                return;
            }
        }
        System.out.println("Число " + number + " является простым");

    }
}
