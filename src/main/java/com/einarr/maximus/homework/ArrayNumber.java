package com.einarr.maximus.homework;

import java.util.Random;

public class ArrayNumber {
    public static void main(String[] args) {

        int[] marks = new int[20];
        int i;
        Random random = new Random();
        for (i = 0; i < 20; i++) {
            marks[i] = random.nextInt(10) +1;
        }
        int m = marks[0];
        for (i = 0; i < marks.length; i++) {
            System.out.println(i + "   " + marks[i]);
            if (m < marks[i])
                m = marks[i];
        }
        System.out.println("Максимальная оценка = " + m);

        // Вывести номер максимальной оценки
        for (i = 0; i < marks.length; i++) {

            if (marks[i] == m)
                System.out.println("Номер максимальной оценки = " + i);
        }

    }
}
